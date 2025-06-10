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

let tong = 0;
if (arr.length === 10) {
  for (let i = 0; i < arr.length; i++) {
    if (Number(arr[i]) >= 10) {
      console.log(Number(arr[i]));
      tong = tong + 1;
    }
  }
  console.log(`Co ${tong} so lon hon hoac bang 10.`);
}
