/*
const tomb = [[3,4,2,3],[5,4,3,1]];
const tombos = [];

for (let i = 0; i < 4 ; i++) {
    tombos[i] = []
    for (let j = 0; j < 5; j++) {
        szam = Math.floor(Math.random()*10)+10;
        tombos[i].push(szam);
    }
}

console.log(tombos);
*/

// 3 nev email - jelszo

const adatok = [];
for (let i = 0; i < 3; i++) {
    nev  = prompt("Név: ");
    let vnev = nev.split(" ")[0];
    let knev = nev.split(" ")[1];
    adatok[i] = [];
    email  =  vnev.toLowerCase().concat(knev[0].toLowerCase()) + "@tanulo.hu";
    jel  = vnev[0].concat(knev[0]) + Math.floor(Math.random()*800+100);
    adatok[i].push(nev,email,jel);
}
console.log(adatok);

// beírt jelszo és email van e 