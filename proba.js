/*
let ev = prompt("Kérem az évszámot: ")
// feladat vizsgáld meg hogy 2022-t adott meg. ha igen, írd ki "Ez az év"; "Nem ez az év"

if (ev == 2022) {
    console.log("Ez az év");
} else {
    console.log("Nem ez az év");
}

console.log((ev ==2022)?"2022":"nem 2022");

//feladat: Kérj be egy életkort, irasd ki, hogy felnőtt (>18), vagy fiatal

let kor = prompt("Írj be az életkorod: ")

console.log((kor >= 18)?"Felnőtt":"Fiatal");

// && ÉS
// || VAGY
// ! TAGADÁS

// feladat: Kérj be gy számot 1 és 7 között. Döntsd el, hétköznap vagy hétvége

szam = prompt("Szám: ");
if (szam < 6) {
    console.log("Hétköznap");
} else if (szam < 1 || szam > 7) {
    console.log("Adj meg egy másik számot");
} else {
    console.log("Hétvége");
}
*/
// Kérj be egy számot, irasd ki pozitív vagy negatív vagy 0

let szam2 = prompt("Szám2: ");
if (szam2<0){
    console.log("Negatív");
} else if (szam2 == 0) {
    console.log("Nulla");
} else {
    console.log("Pozitív");
}

console.log(typeof(szam2));