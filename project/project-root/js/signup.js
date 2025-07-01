let users = JSON.parse(localStorage.getItem("users")) || [];
let form = document.getElementById(`form`);
form.addEventListener(`submit`, function (e) {
  e.preventDefault();
  let email = document.getElementById(`email`).value;
  let userName = document.getElementById(`username`).value;
  let password = document.getElementById(`password`).value;

  let emailError = document.getElementById(`errorEmail`);
  let usernameError = document.getElementById(`errorUsername`);
  let passwordError = document.getElementById(`errorPassword`);

  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  const usernameRegex = /^[a-zA-Z0-9_]{4,16}$/;
  const passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{6,}$/;
  emailError.innerHTML = ``;
  usernameError.innerHTML = ``;
  passwordError.innerHTML = ``;
  let itValid = true;
  if (!emailRegex.test(email)) {
    emailError.innerHTML = `Email ban nhap khong hop le`;
    itValid = false;
  }
  if (!usernameRegex.test(userName)) {
    usernameError.innerHTML = `Username ban nhap khong hop le`;
    itValid = false;
  }
  if (!passwordRegex.test(password)) {
    passwordError.innerHTML = `Password ban nhap khong hop le`;
    itValid = false;
  }
  if (itValid) {
    let newUsers = {
      userCode: Math.floor(Math.random() * 1000),
      userName: userName,
      email: email,
      password: password,
      status: `Active`,
      Role: ` User`,
      birthday: `1 / 1 / 2010`,
    };
    users.push(newUsers);
    localStorage.setItem("users", JSON.stringify(users));
    window.location.href =
      "http://127.0.0.1:5500/project-root/pages/signin.html";
  }
});
