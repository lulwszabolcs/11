function arLekeres() {
    let felnott = document.getElementById("felnott").value;
    let diak = document.getElementById("diak").value;
    let ide = document.getElementById("ide");
    if (document.getElementById("ulo").checked) {
        document.getElementById("ide").innerHTML = `${(diak * 750) + (felnott * 1250)}`
    } else if (document.getElementById("allo").checked) {
        document.getElementById("ide").innerHTML = `${(diak * 500) + (felnott * 1000)}`
    }
}