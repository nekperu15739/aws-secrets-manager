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

By default, this project against AWS, so you must create a new secret, for it, locale on "cdk" folder and execute the cdk project

setup for cdk(only first time):
```shell
npm run build
cdk bootstrap
cdk deploy
```

And then just run the project

```shell
./mvnw spring-boot:run
```

for remove secret
setup for cdk:
```shell
cdk destroy
```


**NOTE**
### Local profile:
If you want to run this project locally we need to set up a new profile and create the infrastructure.

First, running the docker compose:

```shell
docker-compose up -d
```

Second, create a new aws profile called localstack, should look like this:

```shell
cat .aws/config

[profile localstack]
region = us-east-1
output = json
```

```shell
cat .aws/credentials

[profile localstack]
aws_access_key_id = test
aws_secret_access_key = test
region = us-east-1
```

Third locale on "cdk" folder and execute the cdk project:

setup for cdk:
```shell
cdklocal bootstrap -v --profile localstack
```

create the services:
```shell
cdklocal deploy --profile localstack
```

and the running the project using local profile:

```shell
./mvnw spring-boot:run -Dspring-boot.run.profiles=local
```
