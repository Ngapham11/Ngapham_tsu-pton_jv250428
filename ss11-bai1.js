let year = +prompt("Moi ban nhap nam muon kiem tra");
if (year % 4 === 0 && year % 100 !== 0) {
  console.log("Day la nam nhuan");
} else if (year % 100 === 0 && year % 400 !== 0) {
  console.log("Khong phai nam nhuan");
} else if (year % 100 === 0 && year % 400 === 0) {
  console.log("Day la nam nhuan");
} else {
  console.log("Khong phai nam nhuan");
}
