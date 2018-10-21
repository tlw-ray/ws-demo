call gradlew bootJar
call pscp -pw @welcome1017 build/libs/ws-demo-0.0.1.jar root@106.12.13.244:/root/onw/
