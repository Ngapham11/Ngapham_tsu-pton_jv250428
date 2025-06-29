//so sanh thong tin nhap vao va thong tin co trong he thong
//B1: lay thong tin tren he thong
let users = JSON.parse(localStorage.getItem(`users`)) || [];
console.log(users);
//lay thong tin nguoi dung nhap vao
let form = document.getElementById(`form`);
form.addEventListener(`submit`, function (e) {
  e.preventDefault();

  let email = document.getElementById(`email`).value;

  let password = document.getElementById(`password`).value;

  //so sanh thong tin nguoi dung va thong tin luu tren he thong
  let result = users.some(
    (element) => (element.email == email) & (element.password == password)
  );

  if (!result) {
    alert(`Dang nhap khong thanh cong`);
  } else {
    alert(`Dang nhap thanh cong`);
    window.location.href = ``;
  }
});
