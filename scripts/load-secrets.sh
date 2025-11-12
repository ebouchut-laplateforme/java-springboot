#!/bin/bash
# Generate .env file from 1Password secrets
# This script can be used with IntelliJ's EnvFile plugin

set -e

echo "Loading secrets from 1Password into .env file..."
op inject -i .env.op -o .env

echo "  Secrets loaded into .env file"
echo "  This file is ignored by git and can be used by IntelliJ IDEA"
