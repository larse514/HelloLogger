#!/bin/bash

sudo service tomcat8 stop

sudo rm -rf *.war 

sudo service tomcat8 start
