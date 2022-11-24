/*
//1-2-3
const animals = ["cica","kutya","egér","hörcsög","ló"];

for (const i in animals) {
    console.log(i,animals[i]);
}

//4
animals[animals.indexOf("egér")] = "sün";

//5
animals.push("medve","majom");
console.table(animals);

//6
animals.sort();
console.log(animals);

const novenyek = ["fa","hóvirág","bokor","fa"];

const elolenyek = animals.concat(novenyek); //másolás
console.log(elolenyek);

const vanEFind = elolenyek.find(nev => nev == "fa"); //keresés find 
console.log(vanEFind);

const vanEIndexOf = elolenyek.indexOf("fa"); //keresés indexOf
console.log(vanEIndexOf);

const vanELastIndexOf = elolenyek.lastIndexOf("fa"); //keresés LastIndexOf
console.log(vanELastIndexOf);

const vanEIncludes = elolenyek.includes("fa"); //keresés includes true/false
console.log(vanEIncludes);

// 5 lottó generálás 1-90 ne ism
//növekvő
*/

const kihuzott = [];
for (let i = 0; i < 5; i++) {
    x = Math.floor(Math.random()*90+1);
    if (kihuzott.includes(i) != true) {
        kihuzott[i] = x;
    } else {
        i-=1
    }
}
console.log(kihuzott.sort((a,b) => a-b));