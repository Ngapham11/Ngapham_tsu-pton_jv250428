let usersItem = JSON.parse(localStorage.getItem(`usersItem`)) || [];

let users = JSON.parse(localStorage.getItem(`users`)) || [];
console.log(users);
let btnSave = document.getElementById(`Save`);
console.log(btnSave);
let btnBack = document.getElementById(`Back`);
let inputCode = document.getElementById(`userCode`);
let checkvalue = ``;
function myFunction(Status) {
  checkvalue = Status;
}

inputCode.addEventListener(`click`, function () {
  document.getElementById(`userCode`).value = usersItem.userCode;
  document.getElementById(`userName`).value = usersItem.userName;
  document.getElementById(`password`).value = usersItem.password;
  document.getElementById(`Role`).value = usersItem.Role;
  document.getElementById(`birthday`).value = usersItem.birthday;
  document.getElementById(`email`).value = usersItem.email;
});

btnSave.addEventListener(`click`, function (e) {
  e.preventDefault();
  let userCode = document.getElementById(`userCode`).value;
  let userName = document.getElementById(`userName`).value;
  let password = document.getElementById(`password`).value;
  let Role = document.getElementById(`Role`).value;
  let birthday = document.getElementById(`birthday`).value;
  let email = document.getElementById(`email`).value;

  let errorEmail = document.getElementById(`errorEmail`);
  let errorPassword = document.getElementById(`errorPassword`);
  let errorUserName = document.getElementById(`errorUserName`);

  errorEmail.innerText = ``;
  errorUserName.innerText = ``;
  errorPassword.innerText = ``;

  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  const usernameRegex = /^[a-zA-Z0-9_]{4,16}$/;
  const passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{6,}$/;

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
    usersItem.userName = userName;
    usersItem.userCode = userCode;
    usersItem.birthday = birthday;
    usersItem.Role = Role;
    usersItem.status = checkvalue;
    usersItem.password = password;
    usersItem.email = email;
    let usersItemIndex = users.findIndex(
      (user) => Number(user.userCode) == Number(usersItem.userCode)
    );
    users[usersItemIndex] = usersItem;
    localStorage.setItem(`usersItem`, JSON.stringify(usersItem));
    localStorage.setItem(`users`, JSON.stringify(users));
  }
  document.getElementById(`userCode`).value = ``;
  document.getElementById(`userName`).value = ``;
  document.getElementById(`email`).value = ``;
  document.getElementById(`Role`).value = ``;
  document.getElementById(`birthday`).value = ``;
  document.getElementById(`password`).value = ``;
  document.getElementById("Status1").checked = false;
  document.getElementById("Status2").checked = false;
  window.location.href = `http://127.0.0.1:5500/project-root/pages/Dashboard.html`;
});

btnBack.addEventListener(`click`, function (e) {
  window.location.href = `http://127.0.0.1:5500/project-root/pages/Dashboard.html`;
});
