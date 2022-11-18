//Declaração de variável do tipo array, iteração para exibição dos valores de cada elemento do array, localizar o maior valor do array e cálculo de média
var valores = [8,7,2,9];

for (let i = 0; i < valores.length; i++) {
    console.log(valores[i]);
}

//MAIOR VALOR
var maior = 0;

for (let index = 0; index < valores.length; index++) {
    if(maior < valores[index]){
        maior = valores[index]
    }else{
        continue
    }
}

console.log("O maior número é: " + maior)

//MÉDIA
var total = 0;

for (let index = 0; index < valores.length; index++) {
    var element = valores[index];
    total += element;
}

var media = total / valores.length;//Uso de atributo .length para retornar o tamanho do array

console.log("A média é: " + media);

//--------------------------
//Declaração de variável do tipo array vazio e iteração para exibição dos valores de cada elemento do array
var carros = [];
carros[0] = "Volvo";
carros[1] = "Jeep";

for (let i = 0; i < carros.length; i++) {
    console.log(carros[i]);
}

//Declaração de variável e instanciamento de objeto do tipo array e iteração para exibição dos valores de cada elemento do array
var motos = new Array("BMW","Harley Davidson","Honda")

for (let i = 0; i < motos.length; i++) {
    console.log(motos[i]);
}

