let a = +prompt(`Hay nhap vao mot so yeu thich:`);
let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let check = arr.includes(a);
if (check === true) {
  alert(`Bingo`);
} else {
  alert(`Chuc ban may man lan sau`);
}
