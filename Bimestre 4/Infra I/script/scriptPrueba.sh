#!/bin/bash
declare –a array=()

req=`curl https://raw.githubusercontent.com/olea/lemarios/master/nombres-propios-es.txt | shuf`
countA=0
countL=0
countX=0