const courses = [
  {
    id: 1,
    content: "Learn Javascript Session 01",
    dueDate: "2023-04-17",
    status: "Pending",
    assignedTo: "Anh Bách",
  },
  {
    id: 2,
    content: "Learn Javascript Session 2",
    dueDate: "2023-04-17",
    status: "Pending",
    assignedTo: "Lâm th`",
  },
  {
    id: 3,
    content: "Learn CSS Session 1",
    dueDate: "2023-04-17",
    status: "Pending",
    assignedTo: "Hiếu Ci ớt ớt",
  },
];
//b1:in ra đối tượng
function renderTodo() {
  let tBody = document.getElementById(`tdpush`);

  tBody.innerHTML = ``;
  courses.forEach((e) => {
    let tr = document.createElement("tr");
    tr.innerHTML = `
    <td>${e.id}</td>
  <td>${e.content}</td>
  <td>${e.dueDate}</td>
  <td>${e.status}</td>
  <td>${e.assignedTo}</td>
  <td><button class= "edit" onclick="Edit( ${e.id})" >Sửa</button>
  <button class= "delete" onclick="Delete (${e.id})">Xóa</button></td>`;
    tBody.appendChild(tr);
  });
}

renderTodo();
//B2:thêm mới

let form = document.getElementById(`form`);
console.log(form);
form.addEventListener(`submit`, function (e) {
  e.preventDefault();

  if (
    form.content.value === `` ||
    form.dueDate.value === `` ||
    form.status.value === `` ||
    form.assignedTo.value === ``
  ) {
    alert(`Ban nhap thieu`);
    return;
  } else {
    let newTodo = {
      id: Math.floor(Math.random() * 1000),
      content: form.content.value,
      dueDate: form.dueDate.value,
      status: form.status.value,
      assignedTo: form.assignedTo.value,
    };

    courses.push(newTodo);
  }
  renderTodo();
  form.reset();
});

//B3:sửa

function Edit(id) {
  let edit = courses.find((el) => el.id === id);
  //xoa du lieu cu
  let ind = courses.indexOf(edit);
  courses.splice(ind, 1);
  if (edit) {
    form.courseId.value = edit.id;
    form.content.value = edit.content;
    form.dueDate.value = edit.dueDate;
    form.status.value = edit.status;
    form.assignedTo.value = edit.assignedTo;
  }
  renderTodo();
}
//B4:xoa
function Delete(id) {
  let deleteItem = courses.find((el) => el.id === id);

  let ind = courses.indexOf(deleteItem);
  courses.splice(ind, 1);
  renderTodo();
}
