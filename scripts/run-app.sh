#!/bin/bash
# Run Spring Boot application with secrets from 1Password

set -e # Exit on error

echo "Loading secrets from 1Password and starting Spring Boot..."
op run --env-file=.env.op -- ./mvnw spring-boot:run
