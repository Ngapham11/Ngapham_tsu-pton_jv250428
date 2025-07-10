let createUser = (name, age = 18, role = `user`) => {
  console.log(`name : ${name} , age : ${age} , role : ${role}`);
};
createUser(`Dev`);
createUser(`Nguyen van A`, 20, `Admin`);
