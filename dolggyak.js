// Jegyek kiíratása 1-5 elégtelen stb
let jegy = Number(prompt("Írj be egy jegyet: "));
let kiir = "";
switch (jegy) {
   case 1 : kiir = "Elégtelen"; break;
   case 2 : kiir = "Elégséges"; break;
   case 3 : kiir = "közepes"; break;
   case 4 : kiir = "Jó"; break;
   case 5 : kiir = "Jeles"; break;
   default: kiir = "nem jo"; break;
}
document.write(kiir);
// Szám-tól 1-ig kiíratás
let szam = prompt("Szam: ");
while (szam >= 1) {
    document.write(`${szam} <br>`)
    szam--
}
// Név kiíratása hányszor
let nev = prompt("Írj be egy nevet: ");
let hanyszor = prompt("Írj be egy számot: ")
while (hanyszor >= 1) {
    document.write(`<p>${nev}</p>`)
    hanyszor--
}
// Szám osztói
let osztoit = prompt("Szam: ");
let teszt = 1;
while (teszt <= osztoit) {
    if (osztoit%teszt==0) {
        document.write(`${teszt} <br>`)
    }
    teszt++
}
// Tárgyak átlag
let targyak = prompt("Írj be egy számot: ");
let jegyek;
let db = 0;
let osszeg = 0;
while (db != targyak) {
    jegyek = Number(prompt("Írj be egy jegyet: "));
    osszeg+=jegyek;
    db++
}
console.log(osszeg/db);
// 10-20-ig + négyzet
for (let i = 10; i<=20; i++) {
    document.write(`<p>${i} ${i*i}</p>`)
}
// 1-10-ig páros
for (let i = 1; i<=10;i++) {
    if (i%2==0) {
        document.write(`${i} <br>`)
    }
}
// 20 összeg + 20!
let osszeg = 0;
let szorzat = 1;
for (let i = 1;i <= 20; i++) {
    osszeg += i
    szorzat *= i
}
document.write(`${osszeg} <br>`)
document.write(`${szorzat} <br>`)
// 8-as szorzótábla
let szorzo = 8;
for (let i = 1; i <= 10; i++) {
    document.write(`<p>${i} * ${szorzo} = ${i*szorzo}</p>`)
}
// Tárgyak még1x
let targyak = prompt("Írd be hány tárgyad van: ");
let jegyek;
let db = 0;
let osszeg = 0;
while (db != targyak) {
    jegyek = Number(prompt("Írj be a jegyed: "))
    osszeg+=jegyek
    db++
}
document.write(`${osszeg/db}`)