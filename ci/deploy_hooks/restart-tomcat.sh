#!/bin/bash

sudo service tomcat8 stop

sudo rm -rf 1.0-SNAPSHOT* 

sudo service tomcat8 start
