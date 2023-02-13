let boldog = document.getElementById("boldog");
let szomoru = document.getElementById("szr");

boldog.addEventListener("click", kep); 
szomoru.addEventListener("click", kep); 
function kep() {
    if (boldog.checked) {
        document.getElementById("kephelye").src = "boldog.jpg"
    } else {
        document.getElementById("kephelye").src = "szomoru.jpg"
    }
}