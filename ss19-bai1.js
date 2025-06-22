//lấy thẻ html
let users = JSON.parse(localStorage.getItem(`users`)) || [];
let form = document.getElementById(`form`);
let errorEmail = document.getElementById(`errorEmail`);
let errorPassword = document.getElementById(`errorPw`);
let errorConfirmpw = document.getElementById(`errorConfirmPw`);

//ngan chan gui di de kiem tra thong tin
form.onsubmit = (event) => {
  event.preventDefault();
  //luu thong tin
  if (checkData(form)) {
    const newuser = {
      email: form.email.value,
      password: form.password.value,
    };
    users.push(newuser);
    localStorage.setItem(`users`, JSON.stringify(users));
  }
};
//Kiểm tra sự hợp lệ thông tin người dùng nhập vào: Email không được bỏ trống, mật khẩu không được bỏ trống, xác nhận mật khẩu trùng khớp.

//ham kiem tra thong tin nhap lieu
function checkData(form) {
  let check = true;
  if (form.email.value === ``) {
    errorEmail.innerText = `Email khong duoc de trong`;
    check = false;
  } else if (!validEmail(form.email.value)) {
    errorEmail.innerText = "Email khong hop le";
    check = false;
  } else {
    errorEmail.innerText = ``;
  }

  if (form.password.value === ``) {
    errorPassword.innerText = `Email khong duoc de trong`;
    check = false;
  } else if (!validpassword(form.password.value)) {
    errorPassword.innerText = `Mat khau khong hop le`;
    check = false;
  } else {
    errorPassword.innerText = ``;
  }

  if (form.inputConfirm.value === "") {
    errorConfirmpw.innerText = `khong duoc de trong`;
    check = false;
  } else if (form.inputConfirm.value !== form.password.value) {
    errorConfirmpw.innerText = `MK khong trung khop`;
    check = false;
  } else {
    errorConfirmpw.innerText = ``;
  }
  return check;
}

function validEmail(email) {
  return /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/.test(email);
}
function validpassword(password) {
  return /^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/.test(
    password
  );
}
