function validaArray(arr, num){
    try{
        if (!arr && !num) throw new ReferenceError("Envie os parâmetros");

    if (typeof arr !== 'object') 
     throw new TypeError("O array precisa ser do tipo Object");

    if (typeof num !== 'number') 
     throw new TypeError("Num precisa ser do tipo number");

    if (arr.length !== num) throw new RangeError("Tamanho incorreto");

    return arr;
    }
    catch(e){
        if (e instanceof ReferenceError){
            console.log("É um ReferenceError")
            console.log(e.message)
        } else if (e instanceof TypeError){
            console.log("É um TypeError")
            console.log(e.message)
        } else if(e instanceof RangerError){
            console.log("É um RangeError!")
        } else {
            console.log("Um erro não esperado" + e);
        }
    }

}
console.log(validaArray())