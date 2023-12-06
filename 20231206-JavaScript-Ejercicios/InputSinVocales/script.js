let userInput = document.getElementById("user-input");
let mensaje = document.getElementById("mensaje")

userInput.addEventListener("keyup", (event)=>{
    let characters = userInput.value.split("")
    let noVowelCharacters = characters.map(character => (character.toLowerCase() == "a" || character.toLowerCase() == "e" || character.toLowerCase() == "i" || character.toLowerCase() == "o" || character.toLowerCase() == "u")? "_" : character)

    let noVowelNorSpaceCharacters = noVowelCharacters.map(character => (character == " ")? "&nbsp" : character)
    
    let message = noVowelNorSpaceCharacters.join("")
    
    mensaje.innerHTML = message
})