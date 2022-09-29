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

### Try via Urls

```
healt-check -> http://0.0.0.0:5555/status
load-balance -> http://0.0.0.0:5555/api/port
rewrite -> http://0.0.0.0:5555/rewrite-path
cache-check -> http://0.0.0.0:5555/about.html
```
