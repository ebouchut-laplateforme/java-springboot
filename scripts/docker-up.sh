#!/bin/bash
# Start Docker Compose with secrets from 1Password

set -e

echo "Loading secrets from 1Password and starting Docker Compose..."
op run --env-file=.env.op -- docker-compose up -d

echo
echo "Run 'docker-compose logs -f db' to view logs"
