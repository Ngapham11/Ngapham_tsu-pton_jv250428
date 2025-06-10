let arr = [];
arr[0] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[1] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[2] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[3] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[4] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[5] = prompt(`Hay nhap vao so nguyen bat ki:`);
let max = Number(arr[0]);
let tong = 0;

for (i = 0; i < arr.length; i++) {
  tong = tong + Number(arr[i]);
  if (Number(arr[i]) > 0 && max < Number(arr[i])) {
    max = Number(arr[i]);
  }
}
let tb = tong / arr.length;
console.log(arr);
console.log(`So lon nhat la : ${max}`);
console.log(`Gia tri trung binh cua day so ban nhap la : ${tb}`);
