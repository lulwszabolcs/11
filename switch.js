// Kérj be egy számot, 1-5 hétköznap, hétvége
/*
let szam = Number(prompt("Írj be egy számot: "));
let t = "";
switch(szam) {
    case 1: t = "Hétfő"; break;
    case 2: t = "Kedd"; break;
    case 3: t = "Szerda"; break;
    case 4: t = "Csütörtök"; break;
    case 5: t = "Péntek"; break;
    default: t = "Hétvége"; break;
}
console.log(t);

//while - előteszetlős

while (szam >= 10) {
    console.log(szam);
    szam++  
}
//do while - hátultesztelős
do {
    console.log(szam);
    szam++
} while (szam >= 10);
*/
//1. feladat: Kérj be számot, írasd ki számtól 1-ig csökkenő sorrendben
//2. feladat: Kérj be  egy nevet, 1 számot , írasd ki a nevet adott számszor
//3. feladat: Kérj be egy számot, írasd ki az osztóit
//4. feladat: Írj prg-ot ami megkérdezi ? tantárgyad van, majd bekéri a jegyeket és kiszámolja az átlagot

//1:
let szam2 = prompt("Írj be egy számot: ");
while (szam2 >= 1) {
    console.log(szam2);
    szam2--
}
//2:
let hanyszor = Number(prompt("Írj be egy számot: "));
let nev = prompt("Írj be egy nevet: ");
while (hanyszor > 0) {
    console.log(nev);
    document.write(`<p>${nev}</>`) //html oldalra
    hanyszor--
}

//3:
let szam3 = Number(prompt("Írj be egy másik számot: "));
let i = 1;
while (i < 10) {
    if (szam3%i==0) {
        console.log(szam3 + "osztói: ");
        console.log(i);
    }
    i++
}
//4:
let tantargy = Number(prompt("Hány tantárgyad van: "));
let jegy = Number(prompt("Írd be a jegyeidet: "));
