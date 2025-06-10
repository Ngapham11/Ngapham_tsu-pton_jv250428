let arr = [];
arr[0] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[1] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[2] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[3] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[4] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[5] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[6] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[7] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[8] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[9] = prompt(`Hay nhap vao so nguyen bat ki:`);
console.log(arr);
let number = prompt(`Hay nhap so nguyen ban muon tim:`);
let index = arr.indexOf(`${number}`);
if (index >= 0) {
  console.log(`Number ${number} is in the array.`);
} else {
  console.log(`Number ${number} is not in the array.`);
}
