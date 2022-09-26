// 1-10
for (let i = 1; i < 11; i++) {
    console.log(i);
}

// irasd ki a számokat 10 és 20 között, írd mellé a négyzetét

for (let i = 10; i < 21; i++) {
    console.log(i + " " + i*i);
}

// irasd ki a számokat 50 és 20 között
let kiir = "Számok 50 és 20 között: ";
for (let i = 50; i > 19; i--) {
    console.log(i);
    kiir += `<p>${i}</p>`;
}
document.write(kiir);

// irasd ki a számokat 1-10ig csak a páros számokat !
let kiir2 = "Páros számok 1 - 10-ig: "
for (let i = 1; i < 11; i++) {
    if (i % 2 == 0) {
        document.write(`${i} <br>`)
    }
}
for (let i = 1; i < 6; i++) {
    for (let j = 1; j <= i; j++) {
        console.log("*");
        document.write("*")
    }
    document.write(`<br>`)
}

for (let i = 1; i < 11; i++) {
    if (i % 2 == 1)continue
    console.log(i);
}