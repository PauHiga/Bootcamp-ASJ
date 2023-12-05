let boton =  document.getElementById("boton")
let nombre =  document.getElementById("nombre")
let apellido =  document.getElementById("apellido")

let h1 = document.getElementsByTagName("h1")[0]
let h2 = document.getElementsByTagName("h2")[0]

boton.addEventListener("click", ()=>{
    h1.innerText = nombre.value;
    h2.innerText = apellido.value;
    h2.style = "color:red"
})