#!/bin/bash
# touch respuesta.txt
# num=50
# if [ $num -gt 75 ]; then
#         mv respuesta.txt esmayor.txt
# else
#         mv respuesta.txt esmenor.txt
# fi

# verificar si la variable es mayor a 75, si lo es debemo renombrar el archivo respuesta.txt esmayor.txt, sino, esmenor.txt

#!/bin/bash
touch respuesta.txt
num=50
if [ $num -ne 30 ]; then
        rm respuesta.txt esmenor.txt
else
        ls respuesta.txt esmayor.txt
fi