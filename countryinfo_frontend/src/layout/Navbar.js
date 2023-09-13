import { Button } from "bootstrap";
import React from "react";

export default function Navbar() {
  return (
    <div>
      <nav className="fs-1 navbar-expand-lg navbar-dark bg-success">
        <div className="container-fluid">
          <a
            className="navbar-brand font-weight-bold text-center"
            href="#"
            style={{ width: "12rem" }}>
            Countries Data
          </a>
          <img
            className="rounded float-right ml-auto"
            src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/UN_emblem_blue.svg/1205px-UN_emblem_blue.svg.png"
            style={{
              width: "100px",
              height: "80px",
            }}
            alt="UN Emblem"></img>
        </div>
      </nav>
    </div>
  );
}
