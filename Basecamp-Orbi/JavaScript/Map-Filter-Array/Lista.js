const lista = [
    {
        name: 'Tijolo',
        preco: 60,
    },
    {
        name: 'Spray',
        preco: 25,
    },
    {
        name: 'Mouse',
        preco: 15,
    },
];

const saldoDisponivel = 160;

function calculaSaldo(saldoDisponivel, lista) {
    return lista.reduce(function(prev, current, index){
        console.log('Rodada ', index + 1);
        console.log({ prev });
        console.log({ current });
        return prev - current.preco;
    }, saldoDisponivel);
}

console.log(calculaSaldo(saldoDisponivel, lista))