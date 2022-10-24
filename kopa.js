let txt = 78;
/*
function hossz() {
    console.log(txt.length);
}
hossz(txt)

//nyíl
const hossz2 = txt => txt.length;
console.log(hossz2(txt));

// String-e függvény
const lol = txt => typeof(txt) === "string" ? txt.length : "nem";
console.log(lol(txt));

// Nagybetű függvény
let szoveg = prompt("Szöveg: ");
const nagyBetu = szoveg => szoveg.toUpperCase();
console.log(nagyBetu(szoveg));

*/

// Teljesnév függvény
let vnev = "Lakatos";
let knev = "Ottó";
let knev2 = "Kázmér";
const teljesnev = (a,b) => a + " " + b;
console.log(teljesnev(vnev,knev));

// Monogramm függvény
const monog = (a,b) => vnev[0] + "." + knev[0] + ".";
console.log(monog(vnev,knev));

// Működik 2 keresztnévvel és 1-el is
const monog2 = (a,b,c) => knev2 ? vnev[0]+knev[0]+knev2[0] : vnev[0]+knev[0];
console.log(monog2(vnev,knev,knev2));