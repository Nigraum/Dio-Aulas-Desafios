function filtraPares(arr) {
    return arr.filter(callback)
}

function callback(item){
    return item % 2 === 0 ;
}

const meuArray = [1, 2 , 3 , 53, 123, 66, 97, 10, 14]

console.log(filtraPares(meuArray));