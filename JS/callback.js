/*
// 3 paraméter háromszög ker
function ker1(a,b,c) {
    return a+b+c
 }
console.log(ker1(5,4,2));

const ker2 = function (a,b,c) {
    return a+b+c
}
console.log(ker2(5,4,2));

const ker3 = (a,b,c) => a+b+c;
console.log(ker3(5,4,2));
// 1 paraméter, ha "string" akkor hosszával, "number" szam*2; : "Hiba van"
// typeof 
const vegyes = (f) => {
    if (typeof(f) == "string") {
        return f.length;
    } else if (typeof(f) == "number") {
        return f*2;
    } else {
        return "Hiba van";
    }
}
console.log(vegyes(4));
console.log(vegyes("kutya"));
console.log(vegyes(true));

// fg meghívja saját magát Rekurzió
// pl. faktoriális 5! = 5*4!, 4! = 4*3 ...
function fakt(n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        let eredmeny = n * fakt(n-1);
        return eredmeny;
    }
}
console.log(fakt(5));


// n-től z-ig növekvő sorrendben kiiíírja a számokat kiir(10,20)
function kiir(n,z) {
    while (n < z) {
        console.log(n);
        n++;
    }
}

const kis = (a,b,callback) => {
    if (a<b) {
        callback(a,b);
    } else {
        callback(b,a);
    }
}

kis(30,20,kiir)
*/
// fgv, adott karakterlánc betűit szópiramis alakban írja ki
let szo = "alma"
let szou = ""
function szopiramis(szo) {
    for (let i = 0; i < szo.length; i++) {
        szou+=szo[i]
        console.log(szou.toUpperCase());
    }
}
szopiramis(szo);
