#!/bin/bash
for word in $(cat lista_nombres)
do
   echo "El nombre es $word"
   if [ $word = "Juan" ]; then
   echo "Encontre a $word"
   else
   let a=$a+1
   fi
done
echo "la cantidad de nombres distintos a Juan es: $a"
	
