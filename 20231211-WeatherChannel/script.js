const btnEnviar = document.getElementById("enviar")
const ciudad = document.getElementById("ciudad")
const temperatura = document.getElementById("temperatura")
const wicon = document.getElementById("wicon")
const descripcion = document.getElementById("descripcion")

function cargarCiudad(ciudad){
    fetch(`https://api.openweathermap.org/data/2.5/weather?q=${ciudad}&appid=fdd533266e28101881f610f2b8f1ebe1`)
    .then((response) => response.json()) //convertir a JSON
    .then((json) => {
        console.log(json);
        document.querySelector(".container").style.visibility = "visible"
        document.querySelector("#ciudad").textContent = json.name
        document.querySelector("#temperatura").textContent = json.main.temp

    })
    .catch((error) => console.log("Ocurrió un error: " + error));
}



btnEnviar.addEventListener("click", ()=>{
    let input = document.getElementById("input").value;
    cargarCiudad(input)
})



