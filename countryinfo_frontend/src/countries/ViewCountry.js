import axios from "axios";
import React, { useEffect, useState } from "react";
import { Link, useParams } from "react-router-dom";

export default function ViewCountry() {
  const [country, setCountry] = useState({
    name: "",
    code: "",
    capital: "",
    region: "",
    currency: "",
    language: "",
  });

  const { id } = useParams();
  console.log("Country ID:", id);

  useEffect(() => {
    loadCountry();
  }, []);

  const loadCountry = async () => {
    const result = await axios.get(`http://localhost:8080/country/${id}`);
    setCountry(result.data);
  };

  return (
    <div className="d-flex justify-content-center align-items-center vh-100">
      {" "}
      {/* These classes will center the card */}
      <div className="card" style={{ width: "18rem" }}>
        <div className="card-header">
          {country.name} ({country.code})
        </div>
        <ul className="list-group list-group-flush">
          <li className="list-group-item">Capital: {country.capital}</li>
          <li className="list-group-item">Region: {country.region}</li>
          <li className="list-group-item">
            Currency: {country.currency.name} ({country.currency.symbol})
          </li>
          <li className="list-group-item">
            Language: {country.language.name} ({country.language.code})
          </li>
          <li className="list-group-item">
            Dialling Code: {country.dialling_code}
          </li>
          <li className="list-group-item">ISO Code: {country.isoCode}</li>
        </ul>
      </div>
    </div>
  );
}
