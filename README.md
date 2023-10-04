# Server Status Manager

Server Status Manager is a web application built using Spring Boot for the backend and Angular for the frontend. It helps monitor and manage server status, displaying which servers are up and which ones are down. Additionally, it has a future functionality to send email notifications if a server is down for over 10 minutes.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Setting Up the Backend](#setting-up-the-backend)
  - [Setting Up the Frontend](#setting-up-the-frontend)
- [Usage](#usage)
- [Future Functionality](#future-functionality)
- [Contributing](#contributing)
- [License](#license)

## Features

- Display server status (up or down).
- Monitor server status changes in real-time.
- Send email notifications if a server is down for over 10 minutes (future functionality).

## Technologies

- **Backend:**

  - Spring Boot
  - MySQL Database

- **Frontend:**
  - Angular

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven
- Node.js and npm
- MySQL Database

### Setting Up the Backend

1. Clone the repository:

   ```
   git clone <repository_url>
   ```

2. Navigate to the backend directory:

   ```
   cd server-status-manager-backend
   ```

3. Configure the MySQL database in `src/main/resources/application.properties`.

4. Build and run the Spring Boot application:
   ```
   mvn spring-boot:run
   ```

### Setting Up the Frontend

1. Navigate to the frontend directory:

   ```
   cd server-status-manager-frontend
   ```

2. Install dependencies:

   ```
   npm install
   ```

3. Build and run the Angular application:
   ```
   ng serve
   ```

## Usage

1. Access the application by navigating to [http://localhost:4200](http://localhost:4200).
2. The application will display a list of servers and their status (up or down).
3. Refresh the page to update the server status.

## Future Functionality

The application will have a future functionality to send email notifications if a server is down for over 10 minutes.

## Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request.

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/my-feature`.
3. Make your changes and commit them: `git commit -m 'Add a new feature'`.
4. Push to the branch: `git push origin feature/my-feature`.
5. Submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
