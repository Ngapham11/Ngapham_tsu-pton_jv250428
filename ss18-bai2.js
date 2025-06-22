let products = [
  { id: 1, name: `Milk`, count: 100 },
  { id: 2, name: `Orange`, count: 100 },
  { id: 3, name: `Butter`, count: 100 },
];
//bai1
let newOj = { id: 4, name: `Apple`, count: 100 };
products.push(newOj);
//bai2
products.splice(1, 1);

console.log(products);
//bai3
let oj2 = products[1];
console.log(oj2);
oj2.count = 0;
console.log(oj2);
//bai4
for (let i of products) {
  let e = Object.values(i);

  let check = e.includes(`Butter`);
  if (check === false) {
    console.log(`Khong ton tai`);
  } else {
    console.log(`Mang ton tai la :`);

    console.log(i);
  }
}
