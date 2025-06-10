let arr = [];
arr[0] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[1] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[2] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[3] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[4] = prompt(`Hay nhap vao so nguyen bat ki:`);
arr[5] = prompt(`Hay nhap vao so nguyen bat ki:`);
let total = 0;
for (i = 0; i < arr.length; i++) {
  if (Number(arr[i]) < 0) {
    total = total + 1;
    console.log(arr[i]);
  }
}
console.log(`co tat ca ${total} so nguyen am.`);
