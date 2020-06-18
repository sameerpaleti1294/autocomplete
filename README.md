# autocomplete
Make sure that you have 
cd to where you have cloned this repository

# build backend
cd backend
./mvnw package

# build frontend
cd ..
cd frontend
npm install
npm build

# run docker
cd ..
docker-compose up


To access the UI go the URL http://<yourip>:42000/
