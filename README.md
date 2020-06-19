# autocomplete
Make sure that you following verions of npm, docker and docker-compose installed on your system <br />
$ npm -v <br />
6.14.4 <br />

$ docker -v <br />
Docker version 19.03.1 <br />

$ docker-compose -v <br />
docker-compose version 1.24.1 <br />


Change directory to directory you have cloned this repository

# build backend
cd backend/ <br />
./mvnw package <br />

# build frontend
cd .. <br />
cd frontend/ <br />
npm install <br />
npm run build <br />

# run docker
cd ..<br />
docker-compose up <br />


To access the UI for application go the URL "http://YOURIP:4200/" (Note: replace YOURIP with IP of your machine where docker is running)
