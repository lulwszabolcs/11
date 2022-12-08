/*
//5. menetrendből listázd ki adott busznak adott időtől az indulásait, 
//ha már nincs járat, akkor írja ki, hogy: Ma már nem indul járat!
const menetrend = {
    2 : ["5.20", "7.20", "9.20", "11.10", "13.15", "15.20", "17.20", "19.30"],
    5 : ["10.40", "13.40", "17.40"],
    17 : ["9.50", "10.50", "12.50", "15.50", "17.50"]
}
let jarat = 5;
let idopont = 10.00;
let ido = prompt("Idő: ");
let szamlalo = 0;
for (let i = 0; i < menetrend[5].length; i++) {
    if (Number(menetrend[jarat][i]) > ido) {
        console.log(menetrend[jarat][i]);
        szamlalo++;
    } 
}
if (szamlalo == 0) {
    console.log("Nem indul");
}

//6. objektumban tároljuk termékeink árát. 20% áremelkedés volt, frissítsd be az árakat!
const termekekAra={
    kenyer: 800,
    zsemle: 95,
    kifli: 90,
    perec: 250,
    kakaós_csiga: 300
}
for (const key in termekekAra) {
    console.log(key, "ára emelés előtt:",termekekAra[key]);
    termekekAra[key]*=1.2;
}
console.log(termekekAra);
*/

//7. osztály jegyei objektumban tárolva, irasd ki a tanulók átlagát és az osztály átlagát
const osztaly_11D={
    Angyal_Anna : [3,4],
    Bak_Kázmér : [5,4,2,2],
    Mekk_Elek :[2,2,5,5],
    Zab_Álmos : [3,3,1,1]
}
let osztalyOssz = 0;
let jegyDb = 0;
for (const key in osztaly_11D) {
    console.log(key,osztaly_11D[key]);
    let sum = 0;
    jegyek = osztaly_11D[key].forEach(elem => sum+= elem);
    console.log(`${key} átlaga: ${sum/osztaly_11D[key].length}`);
    osztalyOssz+=sum;
    jegyDb += osztaly_11D[key].length;
}
console.log(osztalyOssz/jegyDb);
