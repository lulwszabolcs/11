let szam = 23;
let szo = "string";
let felnott = false; 

console.log(typeof(szam));

let termek1;
termek1 = "adsa";
console.log(typeof termek1);

let ar = 3100;
const PI = 3.14;

console.log(typeof ar, typeof PI);

ar++
console.log(ar);
ar += 10;
ar -= 50;
ar *= 2;
//ar /= 2;
//ar %= 2; //maradékos osztás
console.log(ar);

if (ar > 1000) {
    console.log("Nagyobb mint 1000");
} else {
    console.log("Kisebb mint 1000");
}

if (ar > 7000) {
    console.log("7000-től nagyobb");
} else if (ar > 5000) {
    console.log("Nagyobb mint 5000");
} else {
    console.log("Kisebb mint 5000");
}

// feladat: hozz létre egy új változót tetszőleges értékkel 
// feladat: páros vagy páratlan
/*
let tetszolgesSzam = "2";
if (tetszolgesSzam == 2) {
    alert("Páros");
} else {
    alert("Páratlan");
}
*/
//document.write(tetszolgesSzam);
document.write("Nagy Szabolcs")
// == érték
// === értéket és típúst is

let szo1 = "5555";
let szam1 = 3333;
let csak = 2222;
console.log(szo1+szam1);
console.log(szam1 + csak + szo1);
