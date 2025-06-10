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
let max = Number(arr[0]);
for (i = 1; i < arr.length; i++) {
  if (max < Number(arr[i])) {
    max = Number(arr[i]);
  }
}
let index = arr.indexOf(`${max}`);
console.log(`So lon nhat la : ${max} , co vi tri ${index}`);
