let users = JSON.parse(localStorage.getItem(`users`)) || [];
function renderTodo() {
  let tbody = document.getElementById(`tbody`);
  tbody.innerHTML = ``;
  users.forEach((element) => {
    let tr = document.createElement(`tr`);
    tr.innerHTML = `<td>${element.userCode}</td>
<td>${element.userName}</td>
<td>${element.email}</td>
<td>${element.Role}</td>
<td>${element.birthday}</td>
<td>${element.status}</td>
<td><button id=${element.userCode} class="btn-delete"><i class="fa-solid fa-trash"></i></button>
<button id=${element.userCode} class="btn-edit"><i class="fa-solid fa-pen"></i></button>
</td>`;
    tbody.appendChild(tr);
  });
}
renderTodo();

let container = document.getElementById(`container`);

container.addEventListener("click", function (e) {
  if (e.target.classList.contains("btn-delete")) {
    let userCodeDelete = Number(e.target.id);
    users = users.filter((user) => Number(user.userCode) !== userCodeDelete);
    localStorage.setItem(`users`, JSON.stringify(users));
  }
  if (e.target.classList.contains("btn-edit")) {
    let userCodeEdit = Number(e.target.id);
    let usersItem = users.find((user) => Number(user.userCode) == userCodeEdit);
    localStorage.setItem(`usersItem`, JSON.stringify(usersItem));
    window.location.href = `http://127.0.0.1:5500/project-root/pages/editUses.html`;
  }
  renderTodo();
});
