let original = {
  name: `Bob`,
  age: 30,
};
let copy = {};
Object.assign(copy, original);
copy.name = `Charlie`;
console.log(copy);
console.log(original);
