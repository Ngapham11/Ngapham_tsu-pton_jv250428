const checkParity = (numbers1, numbers2 = 2) => {
  let division = numbers1 % numbers2;
  if (isNaN(numbers1)) {
    console.log(`${numbers1} not is number`);
  } else {
    if (division === 0) {
      console.log(`${numbers1} is an even number`);
    } else {
      console.log(`${numbers1} is odd`);
    }
  }
};
checkParity(`a`);
checkParity(10);
checkParity(7);
