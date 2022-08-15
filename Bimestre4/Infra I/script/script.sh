#!/bin/bash
for word in $(cat lista_nombres)
do
  nombre=$word
  curl -s https://api.genderize.io/?name=$nombre | jq '.gender' | { read -r gen; echo "Gender of $nombre is: $gen"; }
  curl -s https://api.nationalize.io/?name=$nombre | jq '.country[0].country_id' | { read -r cn; echo "Country of $nombre is: $cn";}

  # if [ $word = "Juan" ]; then
  # echo "Encontre a $word"
  # else
  # let a=$a+1
  # # echo "La cantidad de nombres distintos a Juan es: $a"
  # fi
done
# echo "La cantidad de nombres distintos a Juan es: $a"
