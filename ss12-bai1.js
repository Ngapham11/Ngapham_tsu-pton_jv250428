//bai1
let a = Number(prompt(`Moi ban nhap so:`));
let b = Number(prompt(`Moi ban nhap so:`));
if (a % b === 0) {
  alert(`chia het khong du`);
} else {
  alert(`khong chia het`);
}
//bai2

let tuoi = Number(prompt(`Moi ban nhap tuoi:`));
if (tuoi === 15) {
  alert(`Du tuoi vao lop 10.`);
} else {
  alert(`Khong du dieu kien vao lop 10.`);
}

//bai3

let soNguyen = Number(prompt(`Hay nhap mot so nguyen bat ky:`));
if (soNguyen < 0) {
  alert(`So ban nhap nho hon 0`);
} else if (soNguyen === 0) {
  alert(`Ban dang nhap so 0`);
} else {
  alert(`So ban nhap lon hon 0`);
}

//bai4
let so1 = Number(prompt(`Moi ban nhap so thu nhat:`));
so2 = Number(prompt(`Moi ban nhap so thu 2:`));
so3 = Number(prompt(`Moi ban nhap so thu 3:`));
console.log(`Gia tri lon nhat la :` + Math.max(so1, so2, so3));

//bai5
//thang diem 10
let x = +prompt(`Hay nhap diem bai kiem tra:`);
y = +prompt(`Hay nhap diem thi giua ky:`);
z = +prompt(`Hay nhap diem thi cuoi ky:`);
dtb = (x + y + z) / 3;
if (dtb >= 9) {
  //   console.log(`Dat hoc sinh xuat sac`);
} else if (dtb >= 8 && dtb < 9) {
  console.log(` Dat hoc sinh gioi`);
} else if (dtb >= 6 && dtb < 8) {
  console.log(`Dat hoc sinh kha`);
} else if (dtb >= 5 && dtb < 6) {
  console.log(`Dat hoc sinh trung binh`);
} else if (dtb >= 0 && dtb < 5) {
  console.log(`Dat hoc sinh yeu`);
} else {
  console.log(`Ban nhap sai diem.`);
}
