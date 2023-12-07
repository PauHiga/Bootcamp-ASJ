let cards = document.getElementsByClassName("card")

const cupcakesNames = [
    "Vainilla y Frutilla",
    "Dulce Tentación",
    "Arcoíris Delicioso",
    "Melocotón Suave",
    "Canela y Azúcar",
    "Fresa Delight",
    "Coco y Chocolate Blanco",
    "Mango Exquisito",
    "Almendra Supreme",
    "Dulce Caramelo",
    "Piña Colada",
    "Café Mocha",
    "Limón Fresco",
    "Manzana Caramelizada",
    "Cerezas Jubilosas"
];

for(let i = 0; i< cards.length; i++){
    cards[i].children[0].children[1].innerHTML = cupcakesNames[i]
    cards[i].addEventListener("click", ()=>{
        localStorage.setItem("currentProduct", cupcakesNames[i])
    })
}

