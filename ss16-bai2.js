function smallest(array) {
  let min = array[0];
  for (i = 1; i < array.length; i++) {
    if (min > array[i]) {
      min = array[i];
    }
  }
  return min;
}
const arr1 = [3, 5, 1, 8, -3, 7, 8];
const arr2 = [7, 12, 6, 9, 20, 56, 89];
const arr3 = [];
const arr4 = [0, 0, 0, 0, 0, 0];

let arr1min = smallest(arr1);
console.log(`So nho nhat la : ${arr1min}`);

let arr2min = smallest(arr2);
console.log(`So nho nhat la : ${arr2min}`);

let arr3min = smallest(arr3);
console.log(`So nho nhat la : ${arr3min}`);

let arr4min = smallest(arr4);
console.log(`So nho nhat la : ${arr4min}`);
