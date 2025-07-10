let evenOdd = (...args) => {
  let sumEven = 0;
  let sumOdd = 0;
  let even = [];
  let odd = [];
  for (let arg of args) {
    if (arg % 2 == 0) {
      sumEven += arg;
      even.push(arg);
    } else {
      sumOdd += arg;
      odd.push(arg);
    }
  }
  console.log(`Số chẵn là : ${even} . Tổng = ${sumEven}`);
  console.log(`Số lẻ là : ${odd} . Tổng = ${sumOdd}`);
};
evenOdd(1, 2, 3, 4, 5);
evenOdd(1, 2, 3, 4);
evenOdd(1, 2, 3);
