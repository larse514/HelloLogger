#!/bin/bash

CRUMB=$(curl 'http://jenkinsadmin:5c9889c81f50a089b7b081d07fb01828@ec2-52-36-31-31.us-west-2.compute.amazonaws.com:8080/jenkins/crumbIssuer/api/xml?xpath=concat(//crumbRequestField,%22:%22,//crumb)')
echo "$CRUMB"
curl -jenkinsAdmin --header "$CRUMB" -X POST http://jenkinsadmin:5c9889c81f50a089b7b081d07fb01828@ec2-52-36-31-31.us-west-2.compute.amazonaws.com:8080/jenkins/job/HelloLoggerIntegration/build?delay=0sec -v
