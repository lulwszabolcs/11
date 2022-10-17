/*
let oszto = 0;
let szam = prompt("Szám: ");
function prim(szam) {
    if (szam === undefined) {
        console.log("Nem adtál meg számot");
    }

    for (let i = 0; i <= szam; i++) {
        if (szam%i == 0) {
            oszto++
        }
    }
    if (oszto == 2) {
        console.log("prím");
    } else if (szam == 0) {
        console.log("A 0 nem prím");
    } else {
        console.log("nem prim");
    }
}
prim(szam)
*/
// Anonim fgv adj meg egy születési évet és térj vissza az életko
const eletkor = function kor(ev) {
    return 2022 - ev 
}
console.log(eletkor(2005));