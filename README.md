# NGINX Demo Project


### Run Project via Command

```
./gradlew bootRun --args='--server.port=5556'
./gradlew bootRun --args='--server.port=5557'
```

### Run Docker

```
docker build -t nginxapp .
docker run -p 5555:80 nginxapp
```
