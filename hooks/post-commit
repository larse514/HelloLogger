#!/bin/bash

CRUMB=$(curl 'http://jenkinsadmin:5c9889c81f50a089b7b081d07fb01828@ec2-52-36-31-31.us-west-2.compute.amazonaws.com:8080/jenkins/crumbIssuer/api/xml?xpath=concat(//crumbRequestField,%22:%22,//crumb)')
#IP=$(curl automation.whatismyip.com/n09230945.asp)
echo "$CRUMB"
curl -jenkinsAdmin --header "$CRUMB" -X POST http://jenkinsadmin:5c9889c81f50a089b7b081d07fb01828@ec2-52-36-31-31.us-west-2.compute.amazonaws.com:8080/jenkins/job/HelloBuild/build?delay=0sec -v

#curl --header "Jenkins-Crumb:a26de43c49da1252750b00d616a6c60b" -X POST http://hellologger.us-west-2.elasticbeanstalk.com/jenkins/job/HelloPipeline/build?delay=0sec -v
#curl -jenkinsAdmin --header "Jenkins-Crumb:a26de43c49da1252750b00d616a6c60b" -X POST http://jenkinsadmin:5c9889c81f50a089b7b081d07fb01828@ec2-52-36-31-31.us-west-2.compute.amazonaws.com:8080/jenkins/job/HelloPipeline/build?delay=0sec -v
