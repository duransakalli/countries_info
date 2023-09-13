# Country Info Application

This application provides information about various countries. It's built using Spring Boot for the backend, React.js with Bootstrap for the frontend, and MongoDB as its database.
Features

    View detailed information of countries.
    [Other Features you want to highlight]

### Sample Country Info

json

    {
    "name": "Canada",
        "code": "CA",
        "capital": "Ottawa",
        "region": "NA",
        "currency": {
          "code": "CAD",
          "name": "Canadian dollar",
          "symbol": "$"
        },
        "language": {
          "code": "en",
          "name": "English"
        },
        "flag": "https://restcountries.eu/data/can.svg",
        "dialling_code": "+1",
        "isoCode": "124"
    }

### Setup & Installation
##### Prerequisites

    Java 11 or newer
    Node.js & npm
    MongoDB

##### Steps

    Backend Setup:
        Navigate to the backend directory: cd backend-directory-name
        Install the required dependencies: mvn install
        Start the application: mvn spring-boot:run

    Frontend Setup:
        Navigate to the frontend directory: cd frontend-directory-name
        Install the required packages: npm install
        Start the React application: npm start

    MongoDB:
        Ensure MongoDB is running on your machine.

##### Usage

    Open a web browser.
    Navigate to http://localhost:3000 (or whatever port your React app runs on).
    Explore the country information!``
