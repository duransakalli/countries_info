import React, { useState, useEffect } from "react";
import { Link, useParams } from "react-router-dom";
import axios from "axios";

export default function Home() {
  const [countries, setCountries] = useState([]);

  useEffect(() => {
    loadCountries();
  }, []);

  const loadCountries = async () => {
    try {
      const response = await axios.get("http://localhost:8080/country");
      setCountries(response.data);
      console.log(response.data);
    } catch (error) {
      console.error("Error fetching countries", error);
    }
  };

  return (
    <div className="container mt-5">
      <div className="row">
        {countries
          .reduce((acc, current) => {
            const exists = acc.find((item) => item.name === current.name);
            if (!exists) {
              return acc.concat([current]);
            } else {
              return acc;
            }
          }, [])
          .sort((a, b) => a.name.localeCompare(b.name))
          .map((country) => (
            <div className="col-md-4" key={country.name}>
              <h1>{country.id}</h1>
              <Link to={`/${country.id}`}>{country.name}</Link>
            </div>
          ))}
      </div>
    </div>
  );
}
