window.addEventListener('load',()=>{
    const nombre=document.querySelector("input[name='nombre']")
    const select=document.querySelector("select[name='numero']")
    const form=document.querySelector('form')
    const ul=document.querySelector('ul')
    let errores=[]
    nombre.addEventListener('focus',()=>{
        console.log(1);
    })
    nombre.addEventListener('blur',()=>{
        console.log(2);
    })
    nombre.addEventListener('change',()=>{
        console.log(3);
    })
    select.addEventListener('change',()=>{
        console.log(4);
    })
    form.addEventListener('submit',(e)=>{
        e.preventDefault()
        console.log('holi');
        if (nombre.value=="") {
            errores.push('ingresa tu nombre')            
        } else if (nombre.value.length<3){
            errores.push('el campo debe tener al menos 3 caracteres')
        }
        console.log('holisss',select.value);
        if (errores.length>0) {
            e.preventDefault();
            for (let index = 0; index < errores.length; index++) {
                ul.innerHTML+='<li>' +errores[index] +'</li>' 
                
            }
        }

    })


})