//-- Funcion para remover espacios del nombre de producto

function removerEspacios(string){
    let partes = string.split(" ")
    return partes.join("")
}


//---Funcion para crear product cards dinámicamente

function createCartItemsCards(nombreProducto, cantidadProductos){
    const newCartCard = document.createElement("div");
    newCartCard.classList.add("itemCarrito");
    newCartCard.id= removerEspacios(nombreProducto)
    //--
    const newAnchor = document.createElement("a");
    newAnchor.href = "productPage.html"

    const newImage = document.createElement("img");
    newImage.src = "../Images/01.png"
    newImage.alt = "producto"
    newImage.width= "100%"
    newAnchor.appendChild(newImage);
    //--
    const newItemDescripcion = document.createElement("div");
    newItemDescripcion.classList.add("itemCarritoDescripcion");

    const tituloProducto = document.createElement("h2");
    const titulo = document.createTextNode(nombreProducto);
    tituloProducto.appendChild(titulo)

    const precioProducto = document.createElement("p");
    const precio = document.createTextNode("$120 c/u");
    tituloProducto.appendChild(titulo)

    const cantidadProducto = document.createElement("p");
    const cantidad = document.createTextNode(`Cantidad: ${cantidadProductos}`);

    const newSelectorCantidad = document.createElement("div");
    newSelectorCantidad.classList.add("selectorCantidad");
    
    const botonMenos = document.createElement("button");
    botonMenos.classList.add("botonCambiarCantidad");
    botonMenos.classList.add("disminuirCantidad");
    botonMenos.id = `boton-menos-${removerEspacios(nombreProducto)}`
    botonMenos.setAttribute("productName", nombreProducto)
    botonMenos.innerText = "-"

    botonMenos.addEventListener("click", ()=>{
        console.log(carrito);
        carrito[nombreProducto] = carrito[nombreProducto] - 1
        alert(botonMenos.getAttribute("productname"))
    })
    
    const botonMas = document.createElement("button");
    botonMas.classList.add("botonCambiarCantidad");
    botonMas.classList.add("aumentarCantidad");
    botonMas.id = `boton-mas-${removerEspacios(nombreProducto)}`
    botonMas.setAttribute("productName", nombreProducto)
    botonMas.innerText = "+"

    const botonEliminar = document.createElement("button");
    botonEliminar.classList.add("botonCambiarCantidad");
    botonEliminar.classList.add("eliminar");
    botonEliminar.id = `boton-eliminar-${removerEspacios(nombreProducto)}`
    botonEliminar.setAttribute("productName", nombreProducto)
    botonEliminar.innerText = "0"

    botonEliminar.addEventListener("click", ()=>{
        const carrito = JSON.parse(localStorage.getItem("carrito"))
        const liProductos = document.getElementsByClassName("li-productos")
        const itemsCarrito = document.getElementsByClassName("itemCarrito")
        let totalAEliminar = 120 * Number(carrito[botonEliminar.getAttribute("productname")])
        total -= totalAEliminar 
        mostrarTotal(total)

        for(item of liProductos){
            if (item.id == removerEspacios(nombreProducto)){
                item.remove()
            }
        }
        for(item of itemsCarrito){
            if (item.id == removerEspacios(nombreProducto)){
                item.remove()
            }
        }
        for(key in carrito){
            if (key == nombreProducto){
                delete carrito[key]
            }
        }
        toggleScreenDependingOnCart()

    })

    newSelectorCantidad.appendChild(botonMenos)
    newSelectorCantidad.appendChild(botonMas)
    newSelectorCantidad.appendChild(botonEliminar)

    tituloProducto.appendChild(titulo)
    precioProducto.appendChild(precio)
    cantidadProducto.appendChild(cantidad)
    newItemDescripcion.appendChild(tituloProducto)
    newItemDescripcion.appendChild(precioProducto)
    newItemDescripcion.appendChild(cantidadProducto)
    newItemDescripcion.appendChild(newSelectorCantidad);

    newCartCard.appendChild(newAnchor);
    newCartCard.appendChild(newItemDescripcion);

    const appendChildrenDiv = document.getElementById("appendChildren");
    appendChildrenDiv.appendChild(newCartCard)
}


//--- Funcion para mostrar en barra lateral dinamicamente

function createResume(nombreProducto, cantidadProductos){
    const newli = document.createElement("li");
    newli.classList.add("li-productos");
    newli.id = removerEspacios(nombreProducto);

    const tituloProducto = document.createElement("p");
    const titulo = document.createTextNode(nombreProducto);
    tituloProducto.appendChild(titulo)
    const cantidadProducto = document.createElement("p");
    const cantidad = document.createTextNode(`Cantidad: ${cantidadProductos}`);
    cantidadProducto.appendChild(cantidad)
    const precioProducto = document.createElement("p");
    const aPagar = 120 * cantidadProductos;
    const precio = document.createTextNode(`$${aPagar}`);
    precioProducto.appendChild(precio)

    newli.appendChild(tituloProducto)
    newli.appendChild(cantidadProducto)
    newli.appendChild(precioProducto)

    const ulResumenCarrito = document.getElementById("resumenCarrito");
    ulResumenCarrito.appendChild(newli)
}



//--- Funcion para mostrar el total
function mostrarTotal(valor){
    const totalCompra = document.getElementById("total-compra");
    const totalResumen = document.getElementById("total-resumen");
    totalCompra.innerText = `El total es: $${valor}`
    totalResumen.innerText = `Total: $${valor}`
}


//--- Visualización de carrito y calculo de total 


let carrito = localStorage.getItem("carrito") != null? JSON.parse(localStorage.getItem("carrito")) : {};

let total = 0;

for(const key in carrito){
    let cantidad = carrito[key]
    if(cantidad>0){
        /*Siempre el resume se crea primero!! O el boton de eliminar rompe todo :( */
        createResume(key, cantidad)
        createCartItemsCards(key, cantidad)
    }
    total += 120 * cantidad; 
    mostrarTotal(total)
}


//--- Comprar

let botonesComprar = document.getElementsByClassName("btnConfirmarCompra")

for(button of botonesComprar){
    button.addEventListener("click", ()=>{
        let confirmar = confirm(`El total es de $${total}.\nConfirmar compra?`)
        if(confirmar){
            alert("Gracias por su compra!")
            localStorage.clear();
            window.location.href = "../index.html"
        }
    })
}


//--- El carrito solo se muestra si hay productos que comprar

function toggleScreenDependingOnCart(){
    const carritoLleno = document.getElementById("carrito-lleno")
    const carritoVacio = document.getElementById("carrito-vacio")
    
    if(total<=0){
        carritoLleno.style.display = "none";
        carritoVacio.style.display = "flex";
    } else {
        carritoLleno.style.display = "flex";
        carritoVacio.style.display = "none";
    }
}
toggleScreenDependingOnCart()

//--- Agregar o quitar productos

// if(total>0){
//     let botonesDisminuirCantidad = document.getElementsByClassName('disminuirCantidad');
//     for(btn of botonesDisminuirCantidad){
//         btn.addEventListener("click", ()=>{
//             console.log(carrito);
//             console.log(btn.getAttribute("productname"));
//             console.log(carrito[btn.getAttribute("productname")]);
//             alert(btn.getAttribute("productname"))
//         })
//     }

// }