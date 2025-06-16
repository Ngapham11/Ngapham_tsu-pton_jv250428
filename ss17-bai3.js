//Khi click vào nút Open Modal, một hộp chứa dòng text “Some text in the Modal” sẽ được hiển thị ra
// và màn hình xung quanh phải tối đi
//Khi click vào nút “x” hoặc màn hình tối xung quanh, Modal ở trên phải ẩn đi
let button = document.getElementById(`button`);
console.log(button);
let span = document.getElementById(`span`);
let padding = document.getElementById(`padding`);
button.addEventListener(`click`, function () {
  padding.style.display = `block`;
});
span.addEventListener(`click`, function () {
  padding.style.display = `none`;
});
