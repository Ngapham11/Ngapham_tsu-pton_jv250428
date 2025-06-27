let users = [
  {
    id: 1,
    username: `Minh Anh`,
    email: `abc@gmail.com`,
    password: 12345,
    status: true,
  },
];
//lay thong tin dang ki nguoi dung
//1-Truy van form va gan su kien
// let users = JSON.parse(localStorage.getItem("users")) || [];
let form = document.getElementById(`form`);
form.addEventListener(`submit`, function (e) {
  e.preventDefault();
  //the input
  let email = document.getElementById(`email`).value;
  let username = document.getElementById(`username`).value;
  let password = document.getElementById(`password`).value;
  //the thong bao loi
  let emailError = document.getElementById(`errorEmail`);
  let usernameError = document.getElementById(`errorUsername`);
  let passwordError = document.getElementById(`errorPassword`);
  //dieu kien trong o input
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  const usernameRegex = /^[a-zA-Z0-9_]{4,16}$/;
  const passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{6,}$/;
  emailError.innerHTML = ``;
  usernameError.innerHTML = ``;
  passwordError.innerHTML = ``;
  let a = true;
  if (!emailRegex.test(email)) {
    emailError.innerHTML = `Email ban nhap khong hop le`;
    a = false;
  }
  if (!usernameRegex.test(username)) {
    usernameError.innerHTML = `Username ban nhap khong hop le`;
    a = false;
  }
  if (!passwordRegex.test(password)) {
    passwordError.innerHTML = `Password ban nhap khong hop le`;
    a = false;
  }
  if (a) {
    let newUsers = {
      id: users.length + 1,

      username: username,
      email: email,
      password: password,
      status: true,
    };
    users.push(newUsers);
    localStorage.setItem("users", JSON.stringify(users));
  }
});
