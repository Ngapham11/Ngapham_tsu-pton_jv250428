let height = Number(prompt(`Moi ban nhap vao chieu cao (m):`));
let weight = Number(prompt(`Moi ban nhap can nang (kg):`));
let BMI = Number(weight / (height * height)).toFixed(1);
alert(`Chi so BMI la ${BMI}`);
if (BMI < 18.5) {
  alert(`Can nang thap(gay)`);
} else if (18.5 <= BMI && BMI <= 24.9) {
  alert(`Binh thuong`);
} else if (25 <= BMI && BMI <= 29.9) {
  alert(`Tien beo phi`);
} else if (30 <= BMI && BMI <= 34.9) {
  alert(`Beo phi do 1`);
} else if (35 <= BMI && BMI <= 39.9) {
  alert(`Beo phi do 2`);
} else {
  alert(`Beo phi do 3`);
}
