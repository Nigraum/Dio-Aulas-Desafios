function numerosPares(arr) {
    for(let i = 0; i < arr.length; i++) {
        if (arr[i] === 0) {
            console.log("Você já é zero")
        } else if (arr[i] % 2 === 0){
            console.log(`Substituindo ${arr[i]} por 0...`)
            arr[i] = 0;
        }
    }

    return arr;
}

let arr = [1, 2 , 4 , 3, 10, 35, 23, 90, 33, 45];
console.log(numerosPares(arr));