# Getting Started

### Requirements
* Java 11
* Maven
* Docker & docker-compose
* awslocal (https://github.com/localstack/awscli-local)
* aws account
* cdk
* cdklocal (https://github.com/localstack/aws-cdk-local)

### Run the project
This project it's a sample of how to integrate with AWS SecretsManager's service using `spring-cloud-starter-aws-secrets-manager-config`.

By default, this project against AWS, so you must create a new secret with the format described on this file:
> /scripts/mycreds.json

And then just run the project

```shell
./mvnw spring-boot:run
```


**NOTE**
### Local profile:
If you want to run this project locally we need to set up the infrastructure first, running the docker compose:

```shell
docker-compose up -d
```

Then locale on "cdk" folder and execute the cdk project:

setup for cdk:
```shell
cdklocal bootstrap
```

create the services:
```shell
cdklocal deploy  
```

and the running the project using local profile:

```shell
./mvnw spring-boot:run -Dspring-boot.run.profiles=local
```
