/*
let s = "teszt";
let hossz = s.length;
let szo = "";
const fgv = (s) => {
    for (let i = 0; i < hossz;i++) {
        for (let a = 0; a<=i;a++) {
            szo+=s[i]
        }
    }
    return szo
}
console.log(fgv(s));

// csere replace
let text = "Alma alma piros alma";
let szo2 = "körte";
console.log(text.replace(/alma/i,szo2));
console.log(text.replaceAll("alma",szo2));
*/
let mondat = "fidh dsf dsf dsf dsf asfasf"
let szo3 = "dsf"
const cserel = (mondat,szo3) => mondat.replaceAll(szo3,"***");
console.log(cserel(mondat,szo3));