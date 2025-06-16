let boxlist = document.querySelectorAll(`.box`);
console.log(boxlist);
boxlist.forEach((a) => {
  a.addEventListener(`mousemove`, function () {
    let boxcolor = a.getAttribute(`id`);
    document.body.style.backgroundColor = boxcolor;
  });
});
