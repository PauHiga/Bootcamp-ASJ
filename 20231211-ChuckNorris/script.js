const ChuckJoke = document.getElementById("ChuckJoke");
const actualizar = document.getElementById("actualizar");

actualizar.addEventListener("click", ()=>{
    fetch(`https://api.chucknorris.io/jokes/random`)
    .then((response) => response.json()) //convertir a JSON
    .then((json) => {
        ChuckJoke.innerText = json.value;
    })
    .catch((error) => console.log("Ocurrió un error: " + error));
})