let hide = document.getElementById(`hidetext`);

let show = document.getElementById(`showtext`);

let heed = document.getElementById(`h1`);

hide.addEventListener(`click`, function () {
  heed.style.display = `none`;
});
show.addEventListener(`click`, function () {
  heed.style.display = `block`;
});
