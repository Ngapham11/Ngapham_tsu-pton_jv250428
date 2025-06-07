let arr = prompt(`Hay nhap 10 den 20 so nguyen:`).split(``);
let tong = 0;
for (let i = 0; i < arr.length; i++) {
  if (Number(arr[i] % 2 === 1)) {
    tong = tong + Number(arr[i]);
  }
}
alert(`Tong cac so le la : ${tong}`);
