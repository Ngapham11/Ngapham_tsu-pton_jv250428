const sum = (a, b) => a + b;

const subtraction = (a, b) => a - b;
const multiplication = (a, b) => a * b;
const division = (a, b) => a / b;
export default function Calculation() {
  return (
    <>
      <div>
        <h2>Danh sách kết quả</h2>
        <ul>
          <li>{sum(10, 10)}</li>
          <li>{subtraction(10, 10)}</li>
          <li>{multiplication(10, 10)}</li>
          <li>{division(10, 10)}</li>
        </ul>
      </div>
    </>
  );
}
