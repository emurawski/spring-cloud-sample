#!/bin/bash

docker run --name 'redis' -it --rm -p 6379:6379 redis redis-server
