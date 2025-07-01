let users = JSON.parse(localStorage.getItem(`users`)) || [];

let container = document.getElementById(`container`);
let Add = document.getElementById(`Add`);
let inputUserCode = document.getElementById(`userCode`);
inputUserCode.addEventListener(`click`, function () {
  document.getElementById(`userCode`).value = Math.floor(Math.random() * 1000);
});
Add.addEventListener(`click`, function (e) {
  e.preventDefault();
  let userCode = document.getElementById(`userCode`).value;
  let userName = document.getElementById(`userName`).value;
  let password = document.getElementById(`password`).value;
  let Role = document.getElementById(`Role`).value;
  let birthday = document.getElementById(`birthday`).value;
  let email = document.getElementById(`email`).value;
  let status = document.forms[0];
  let checkvalue = "";
  for (let i = 0; i < status.length; i++) {
    if (status[i].checked) {
      checkvalue = checkvalue + status[i].value;
    }
  }

  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  const usernameRegex = /^[a-zA-Z0-9_]{4,16}$/;
  const passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{6,}$/;
  let errorEmail = document.getElementById(`errorEmail`);
  let errorUserName = document.getElementById(`errorUserName`);
  let errorPassword = document.getElementById(`errorPassword`);
  errorEmail.innerText = ``;
  errorUserName.innerText = ``;
  errorPassword.innerText = ``;
  let isValid = true;
  if (!emailRegex.test(email)) {
    errorEmail.innerText = `Email khong hop le`;
    isValid = false;
  }
  if (!usernameRegex.test(userName)) {
    errorUserName.innerText = `Username khong hop he`;
    isValid = false;
  }
  if (!passwordRegex.test(password)) {
    errorPassword.innerText = `Password khong hop le`;
    isValid = false;
  }

  if (isValid) {
    let newUsers = {
      userCode: userCode,
      userName: userName,
      password: password,
      Role: Role,
      birthday: birthday,
      email: email,
      status: checkvalue,
    };
    alert(`Dang nhap thanh cong`);
    users.push(newUsers);
    localStorage.setItem(`users`, JSON.stringify(users));
  }
  document.getElementById(`userCode`).value = ``;
  document.getElementById(`userName`).value = ``;
  document.getElementById(`password`).value = ``;
  document.getElementById(`Role`).value = ``;
  document.getElementById(`birthday`).value = ``;
  document.getElementById(`email`).value = ``;
});

let Back = document.getElementById(`Back`);
Back.addEventListener(`click`, function () {
  window.location.href = `http://127.0.0.1:5500/project-root/pages/Dashboard.html`;
});
