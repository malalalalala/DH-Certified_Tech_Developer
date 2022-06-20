#!/bin/bash
declare – a array=()

req=`curl https://raw.githubusercontent.com/olea/lemarios/master/nombres-propios-es.txt | shuf`
countA=0
countL=0
countX=0

for nombre in $req
do
  if [[ $nombre == A* ]] && [ $countA -le 4 ] ;
  then
     echo $nombre 
     array+=($nombre)
     let "countA++"
  fi
  if [[ $nombre == L* ]] && [ $countL -le 4 ] ;
  then
     echo $nombre
     array+=($nombre)
     let "countL++"
  fi
  if [[ $nombre != L* ]] && [[ $nombre != A* ]] && [ $countX -le 4 ] ;
  then
     echo $nombre
     array+=($nombre)
     let "countX++"
  fi
done

for nombre in ${array[@]};
do
  curl -s https://api.genderize.io/?name=$nombre | jq '.gender' | { read -r gen; echo "Gender of $word is: $gen"; }
  curl -s https://api.nationalize.io/?name=$nombre | jq '.country[0].country_id' | { read -r cn; echo "Country of $word is: $cn";}
done
