# wotoyandi
===========

Spring boot + Maven

Dependencies
===========

## Front end
* Bootstrap 4.0.0-beta.2
* Angular Cli

To get the code
===========
Clone the repository:

```sh
git clone https://github.com/ThiernoMamadouOury-Diallo/wotoyandi.git
```

To Build the application locally
===========

From the command line with Maven:

```sh
cd wotoyandi
mvn clean install
```

Artifacts include the tomcat, therefore we have: 
* `wotoyandi-backend.jar`


To run the Backend locally
===========
Backend is the responsabe of the calls rest Service towards the API

```sh
mvn spring-boot:run
```

To run the Frontend locally
===========
To run frontend
```sh
cd frontend
npm install
npm start

```

Access the deployed web application at [http://localhost:4200/](http://localhost:4200/)

