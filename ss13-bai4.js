let nhapSo = prompt(`Hay nhap vao day so bat ky:`);
let arr = nhapSo.split("");
console.log(arr);
let max = Number(arr[0]);
for (let i = 1; i < arr.length; i++) {
  if (max < Number(arr[i])) {
    max = Number(arr[i]);
  }
}
console.log(max);
