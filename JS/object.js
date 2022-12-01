const tomb = ["Kiss Ottó", 22, "Nyíregyháza"];
const tanulo = {
    nev: "Nagy Lajos",
    kor:22,
    szulHely: "Nyíregyháza",
    haverok: ["Tibi","Zoli","Peti"],
    auto: {
        tipus:"Opel",
        evjarat:2010,
    },
    szoveg: function() {
        return `${this.nev} születési helye: ${this.szulHely}`
    },
    csaladiAllapot: undefined,
};
console.log(tanulo);
console.log(tanulo.haverok);
console.log(tanulo.auto.tipus);
console.log(tanulo["nev"]);

const uresObj = {};
const uresObj2 = new Object();

uresObj2.meret = "ures";
console.log(uresObj2);

tanulo.nev = "Nagy Zoltán";
console.log(tanulo);
tanulo.anyjaNeve = "Nagy Olga";
console.log(tanulo);

// elemek torlese: 
delete tanulo.anyjaNeve;
console.log(tanulo.szoveg());

for (const kulcs in tanulo) {
    console.log(kulcs, "értéke: ", tanulo[kulcs]);
}

//kulcs előfordulásának vizsgálata
console.log(tanulo.csaladiAllapot);
if (tanulo.csaladiAllapot === undefined) {
    console.log("Nincs benne ilyen kulcsérték");
}

if ("csaladiAllapot" in tanulo) {
    console.log("Szerepel ilyen");
}

let x = "szulHely";
console.log(tanulo.x);
console.log(tanulo[x]);

// kapsz 1 bemeno adatot string: szamok: "2,5,-8,0,-2,7,-3"
// obejktumba pozitiv: nulla[] negativ[]

let szamok = "2,5,-8,0,-2,7,-3";
let nums = szamok.split(",")
console.log(nums);

if (Number(nums) % 2 == 0) {
    nums.push
}
const szam2 = {
    pozitiv: [],
    negativ: [],
    nulla: [],
};
