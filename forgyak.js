/*
let osszeg = 0;
let szorzat = 1;
for (let i = 1; i <= 20; i++) {
    osszeg += i;
    szorzat *= i;
}
document.write(`20 faktoriálisa: ${osszeg}`)
document.write(`<p>20 szorzatai: ${szorzat}<p>`)
let szorzas = 8;
for (let i = 1; i <= 10; i++) {
    document.write(`<p>${i} * 8 = ${i*8}</p>`)
}
*/
for (let i = 2020; i <= 2200; i++) {
    if (i%4 == 0 && (i % 400 == 0 || i % 100 != 0)) {
        document.write(`<p>${i < 2022 ? "Szökőév volt:"  : "Szökőév lesz: "} ${i}</p>`)
    }
}
