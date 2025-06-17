//bai1
let person = {
  name: `john`,
  age: 30,
  address: `Viet nam`,
  phoneNumber: 2947242,
};
for (let key in person) {
  console.log(key);
}

//bai2

//tao doi tuong student

function student(id, name, gender, age, mark) {
  this.id = id;
  this.name = name;
  this.gender = gender;
  this.age = age;
  this.mark = mark;
}
//khoi tao doi tuong newstudent co cac thuoc tinh tuong tu
const student1 = new student(1, "Nguyen Van A", "nam", 20, 8);
const student2 = new student(2, `Pham Van B`, `nam`, 18, 9);
const student3 = new student(3, `Pham Van C`, `nam`, 18, 6);
const student4 = new student(4, `Pham Van D`, `nam`, 18, 10);

//tao mang arrStudent de chua chung
let arrStudent = [student1, student2, student3, student4];
console.log(arrStudent);
//truy xuat cac thuoc tinh cua newStuden

for (let key in student2) {
  console.log(`${key} la : ${student2[key]}`);
}

//bai3

//tao ham duyet diem trong mang arrstudent
let max = arrStudent[0];
for (let i = 1; i < arrStudent.length; i++) {
  if (max.mark < arrStudent[i].mark) {
    max.mark = arrStudent[i].mark;
    max = arrStudent[i];
  }
}
console.log(`Diem cao nhat la :${max.mark}`);
console.log(max);
