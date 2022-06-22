#!/bin/bash
echo "creating db secret manager"

awslocal secretsmanager create-secret \
 --name db-secret \
 --description "db credentials Secret" \
 --secret-string file:///tmp/mycreds.json

echo "Done!"
