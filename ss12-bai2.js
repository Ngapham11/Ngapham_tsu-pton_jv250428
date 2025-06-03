//bai1
let C = +prompt(`Hay nhap nhiet do(C)`);
let F = C * 1.8 + 32;
console.log(`${C} do C bang ${F} do F.`);

//bai2
let m = +prompt(`Hay nhap so met:`);
let f = (m / 0.3048).toFixed(3);
console.log(`${m} met bang ${f} feet.`);

//bai3

let v = +prompt(`Hay nhap vao mot canh hinh vuong`);
let chuVi = v * 4;
alert(`Chu vi cua hinh vuong la ${chuVi}`);

//bai4
let a = +prompt(`Hay nhap vao chieu dai`);
b = +prompt(`Hay nhap vao chieu rong`);
dt = a * b;
alert(`Dien tich hinh chu nhat la : ${dt}.`);

//bai5
let x = +prompt(`Hay nhap vao canh thu nhat ke goc vuong`);
y = +prompt(`Hay nhap vao canh thu hai ke goc vuong`);
z = (x * y) / 2;
console.log(`Dien tich tam giac vuong do la : ${z}.`);

//bai6

let a = Number(prompt(`Hay nhap vao gia tri cua a:`));
b = Number(prompt(`Hay nhap vao gia tri cua b:`));
if (a != 0) {
  let x = -b / a;
  console.log(`gia tri cua x la ` + x);
} else {
  if (b === 0) {
    console.log(`Phuong trinh co vo so nghiem.`);
  } else {
    console.log(`Phuong trinh vo nghiem.`);
  }
}

//bai7
let a = Number(prompt(`Moi ban nhap so a:`));
b = Number(prompt(`Moi ban nhap so b:`));
c = Number(prompt(`Moi ban nhap so c:`));
delta = Math.pow(b, 2) - 4 * a * c;

if (delta < 0) {
  console.log(`Phuong trinh vo nghiem.`);
} else if (delta === 0) {
  x1 = -b / (2 * a);
  x2 = -b / (2 * a);
  console.log(`Phuong trinh co nghiem kep : x1 = x2 = ${x1}`);
} else {
  x1 = (-b + Math.sqrt(delta)) / (2 * a);
  x2 = (-b - Math.sqrt(delta)) / (2 * a);
  console.log(
    `Phuong trinh co hai nghiem phan biet x1 la : ${x1} va x2 la : ${x2}`
  );
}

let tuoi = Number(prompt(`Hay nhap tuoi vao o:`));
if (!isNaN(tuoi) && tuoi > 0 && tuoi < 120) {
  console.log(`Day la tuoi cua mot nguoi`);
} else {
  console.log(`Ban nhap thong tin khong chinh xac.`);
}
