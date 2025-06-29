//lay thong tin tren local ve
let usersItem = JSON.parse(localStorage.getItem(`usersItem`));
console.log(usersItem);

let users = JSON.parse(localStorage.getItem(`users`));
console.log(users);
let btnSave = document.getElementById(`Save`);
console.log(btnSave);
let form = document.getElementById(`form`);
form.addEventListener("click", function (e) {
  // e.preventDefault();
  let userCode = document.getElementById(`userCode`);
  let userName = document.getElementById(`userName`);
  let password = document.getElementById(`password`);
  let Role = document.getElementById(`Role`);
  let birthday = document.getElementById(`birthday`);
  let email = document.getElementById(`email`);
  let checkbox1 = document.getElementById(`Status1`);
  let checkbox2 = document.getElementById(`Status2`);
  //tao ra usercode moi

  userCode.value = Math.floor(Math.random() * 1000);

  //day gia tri tu usersItem len o input
  userName.value = usersItem.userName;
  password.value = usersItem.password;
  Role.value = usersItem.Role;
  birthday.value = usersItem.birthday;
  email.value = usersItem.email;
  //the bao loi
  let errorEmail = document.getElementById(`errorEmail`);
  let errorPassword = document.getElementById(`errorPassword`);
  let errorUserName = document.getElementById(`errorUserName`);
  //reset lai the thong bao loi
  errorEmail.innerText = ``;
  errorUserName.innerText = ``;
  errorPassword.innerText = ``;
  // dieu kien trong o input
  let btnSave = document.getElementById(`Save`);
  btnSave.addEventListener(`submit`, function (e) {
    e.preventDefault();
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

    // chuc nang luu

    if (isValid) {
      console.log(qqwq);

      let newUsersItem = {
        userCode: Number(userCode.value),
        userName: userName.value,
        password: password.value,
        Role: Role.value,
        birthday: birthday.value,
        email: email.value,
        checkbox: checkbox1.value,
        checkbox: checkbox2.value,
      };
      console.log(newUsersItem);
      users.push(newUsersItem);
      console.log(users);
      localStorage.setItem(`users`, JSON.stringify(users));
    }
    //rerset lai noi dung trong o input
    userCode.value = ``;
    userName.value = ``;
    email.value = ``;
    password.value = ``;
    birthday.value = ``;
    Role.value = ``;
  });
});
let Back = document.getElementById(`Back`);
Back.addEventListener(`click`, function () {
  window.location.href = `http://127.0.0.1:5500/project-root/pages/Dashboard.html`;
});
