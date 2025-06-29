//lay thong tin tu tren local ve
let users = JSON.parse(localStorage.getItem(`users`));
console.log(users);

//in du lieu
let currentUserCode = null;
function renderTodo() {
  let tbody = document.getElementById(`tbody`);
  //tranh trung lap noi dung
  tbody.innerHTML = ``;
  users.forEach((element) => {
    //tao the <tr>
    let tr = document.createElement(`tr`);
    //them noi dung vao the tr
    tr.innerHTML = `<td>${element.userCode}</td>
<td>${element.userName}</td>
<td>${element.email}</td>
<td>${element.Role}</td>
<td>${element.brithday}</td>
<td>${element.Status}</td>
<td><button id=${element.userCode} class="btn-delete"><i class="fa-solid fa-trash"></i></button>
<button id=${element.userCode} class="btn-edit"><i class="fa-solid fa-pen"></i></button>
</td>`;
    tbody.appendChild(tr);
  });
}
renderTodo();
console.log(tbody);

//truy van the cha
let container = document.getElementById(`container`);
console.log(container);

container.addEventListener("click", function (e) {
  // su kien xoa
  if (e.target.classList.contains("btn-delete")) {
    let userCodeDelete = Number(e.target.id);
    localStorage.clear(users);
    users = users.filter((users) => users.userCode !== userCodeDelete);
    localStorage.setItem(`users`, JSON.stringify(users));
  }
  renderTodo();
  //su kien sua
  if (e.target.classList.contains("btn-edit")) {
    let userCodeEdit = Number(e.target.id);
    let usersItem = users.find((users) => users.userCode === userCodeEdit);
    localStorage.setItem(`usersItem`, JSON.stringify(usersItem));
    window.location.href = `http://127.0.0.1:5500/project-root/pages/editUses.html`;
  }
});
