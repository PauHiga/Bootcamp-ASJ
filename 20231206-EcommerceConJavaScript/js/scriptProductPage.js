//--- Asignar el título al producto
const TituloProducto = document.getElementById("titulo-producto")

let nuevoTituloProducto = localStorage.getItem("currentProduct") != null ? localStorage.getItem("currentProduct") : "Titulo Producto"

TituloProducto.innerText = nuevoTituloProducto


//--- La cantidad de unidades de la card concuerda con el carrito actual del usuario
const inputCantidad = document.getElementById("input-cantidad");

let carrito = localStorage.getItem("carrito") != null? JSON.parse(localStorage.getItem("carrito")) : {};

inputCantidad.value = carrito[nuevoTituloProducto] ? carrito[nuevoTituloProducto] : 0;


//--- Cambiar la cantidad de unidades

const botonMenos = document.getElementById("boton-menos");
const botonMas = document.getElementById("boton-mas");

botonMenos.addEventListener("click", ()=>{
    let currentCantidad = inputCantidad.value;
    if (currentCantidad > 0)
    inputCantidad.value = currentCantidad - 1;
})

botonMas.addEventListener("click", ()=>{
    let currentCantidad = Number(inputCantidad.value); 
    inputCantidad.value = currentCantidad + 1;
})


//--- Añadir un producto al carrito

const btnAñadirCarrito = document.getElementById("anadirCarrito");

btnAñadirCarrito.addEventListener("click", ()=>{
    let carrito = localStorage.getItem("carrito") != null? JSON.parse(localStorage.getItem("carrito")) : {};
    carrito[nuevoTituloProducto] = inputCantidad.value;
    let carritoStringified = JSON.stringify(carrito)
    localStorage.setItem("carrito", carritoStringified)
    alert("Producto añadido al carrito")
})