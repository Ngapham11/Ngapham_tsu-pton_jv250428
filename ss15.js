//bai 3
let arr = prompt(`Hay nhap vao day chu hoac so yeu thich.`).split(``);
console.log(arr);
let length = arr.length;
console.log(`Day so co ${length} ki tu`);

//bai4
let arr1 = prompt(`Hay nhap vao day chu hoac so yeu thich.`).split(``);
console.log(arr1);
let arr2 = prompt(`Hay nhap vao day chu hoac so yeu thich.`).split(``);
console.log(arr2);
for (i = 0; i < arr1.length; i++) {
  for (a = 0; a < arr2.length; a++) {
    if (arr1[i] === arr2[a]) {
      console.log(`ki tu giong nhau la ${arr1[i]}`);
    }
  }
}
