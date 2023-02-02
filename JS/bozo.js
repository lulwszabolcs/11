let f1 = document.getElementById("f1");
let ki = document.getElementById("feladat1");
function megoldas1() {
    if (f1.value === "getData") {
        ki.innerHTML = "getData";
        ki.style.backgroundColor = "aqua"
    } else {
        ki.style.backgroundColor = "red"
    }
}
/*
let btn2 = docuemnt.getElementById("btn2");
btn2.addEventListener("click",megoldas1);
document.getElementById("btn2").addEventListener("mouseover",ramutat);
function ramutat() {
    document.getElementById("btn2").style.color="red"
}
*/
const btn3 = document.getElementById("btn3");
btn3.addEventListener("click",()=> {
    if (document.getElementById("igaz").checked) {
        document.getElementById("f2kiir").innerHTML = "A válaszod rossz";
        document.getElementById("f2kiir").style.color="red";
    } else if (document.getElementById("hamis").checked) {
        document.getElementById("f2kiir").innerHTML = "A válaszod jó"
        document.getElementById("f2kiir").style.color="green";
    }
})

const btn4 = document.getElementById("btn4");
btn4.addEventListener("click",()=>{
    let valasz = document.getElementById("prog").value;
    if (valasz == "html") {
        document.getElementById("f3kiir").innerHTML = "Jó válasz";
        document.getElementById("f3kiir").style.color="green"
    } else {
        document.getElementById("f3kiir").innerHTML = "Rossz válasz";
        document.getElementById("f3kiir").style.color="red"
    }
})