const btn5 = document.getElementById("btn5");
function emegoldas1() {
    if (feladat1.value === "private") {
        ekiir1.innerHTML = "private";
        ekiir1.style.backgroundColor = "green"
    } else {
        ekiir1.style.backgroundColor = "red"
    }
}
btn5.addEventListener("click",emegoldas1);

const btn6 = document.getElementById("btn6");
btn6.addEventListener("click",()=>{
    if (document.getElementById("eIgaz").checked) {
        document.getElementById("ekiir").innerHTML = "Jó válasz"
        document.getElementById("ekiir").style.color="green";
    } else if (document.getElementById("eHamis").checked) {
        document.getElementById("ekiir").innerHTML = "Rossz válasz"
        document.getElementById("ekiir").style.color="red";
    }
})
const btn7 = document.getElementById("btn7");
btn7.addEventListener("click",()=>{
    let valasz = document.getElementById("adat").value;
    if (valasz == "boolean") {
        document.getElementById("feladat3kiir").innerHTML = "Jó válasz";
        document.getElementById("feladat3kiir").style.color="green"
    } else {
        document.getElementById("feladat3kiir").innerHTML = "Rossz válasz";
        document.getElementById("feladat3kiir").style.color="red"
    }
})