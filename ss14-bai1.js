const person = {
  name: `john Doe`,
  age: 25,
  job: `Developer`,
};
console.log(person.name);
for (let key in person) {
  console.log(`${key} : ${person[key]}`);
}
