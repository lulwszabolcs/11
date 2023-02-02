btn5 = document.getElementById("btn5");
btn3.addEventListener("click",()=>{
    if (document.getElementById("eIgaz").checked) {
        document.getElementById("ekiir").innerHTML = "Jó válasz"
    } else if (document.getElementById("eHamis").checked) {
        document.getElementById("ekiir").innerHTML = "Rossz válasz"
    }
})