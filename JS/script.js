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
let evszakhelye = document.getElementById("evszakhelye");
let tel = document.getElementById("tel");
let tavasz = document.getElementById("tavasz");
let nyar = document.getElementById("nyar");
let osz = document.getElementById("osz");
tel.addEventListener("click", evszak);
tavasz.addEventListener("click", evszak);
nyar.addEventListener("click", evszak);
osz.addEventListener("click", evszak);

function evszak() {
    if (tel.checked) {
        evszakhelye.src = "tel.jpg"
    } else if (tavasz.checked) {
        evszakhelye.src = "tavasz.jpg"
    } else if (nyar.checked) {
        evszakhelye.src = "nyar.jpg"
    } else {
        evszakhelye.src = "osz.jpg"
    }
}