

//while
let i = 0
while (i<=10){
    console.log(i)
    i++
}
/*

//otra forma i=j
let j=10
while (j--){
    console.log(j)
}


//otra forma i=t
let t=10
while(t>0){   
    console.log(t)
    t--
}



let i=0
do{
    console.log(i)
}while(i>0)
*/



//Ejemplo de una contraseña 
let password='Tew-200'
let pass
do{
    pass=prompt('Ingrese el pasword: ')  
}while (pass !== password)

