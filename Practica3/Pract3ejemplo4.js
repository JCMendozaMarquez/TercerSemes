/*NO MOSTRAR MULTIPLOS DE 7 ENTRE 0 Y 100 */
/* EN ESTE CASO SERA HASTA EL 20*/


for (let i=0;i<=20;i++){
    if(i%7===0){
        continue
    }else{
        console.log(i)
    }
}


for(let i=0;i<=20 ;i++){
    if(i%7===0) continue
     console.log(i)
}

/*
for(let i=1;i<=20;i++){
    if(i%7===0) break
    console.log(i)
}
*/

let n=0
for(let i=0;i<=100;i++){
   if(i%7 ===0){
       console.log(i)
       n++
   }
   if(n>=5)break
}
