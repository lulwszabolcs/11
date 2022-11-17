/*
const szinek = ["piros","kék","zöld","fehér"];

// Adjatok hozzá az elejére: vörös, sárga
// Végére : lila

szinek.unshift("vörös","sárga");
szinek.push("lila");


console.log(szinek.length);

console.log(szinek.at(-2));

szinek[10] = "hupikék";
console.table(szinek)

// töröljük ki a 3 üres indexet
const kiTorolt = szinek.splice(7,3,"citromsárga")

console.log(kiTorolt);

const darab = szinek.slice(0,3);

console.log(szinek);
console.log(darab);

console.log(szinek.sort());
console.log(szinek);

console.log(szinek.reverse());
console.log(szinek);
*/

const velszamok = [];

for (let i = 0;i<10;i++) {
    vel = Math.floor(Math.random()*100+1);
    velszamok.push(vel)
}

console.log(velszamok);

//növekvő
velszamok.sort(function (a,b){return a-b});
console.log(velszamok);

velszamok.sort(function (a,b){return b-a})
console.log(velszamok);

//Maximum
console.log(velszamok[0]);
console.log(velszamok.at(-1));

let maxSzam2 = Math.max(...velszamok);
console.log(maxSzam2);

let minSzam2 = Math.min(...velszamok);
console.log(minSzam2);

console.log("______");
for (let i = 0; i<velszamok.length;i++) {
    console.log(velszamok[i]);
}

console.log("______");
for (const szam of velszamok) {
    console.log(szam);    
}