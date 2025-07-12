const User = {
  name: `Nguyễn Văn A`,
  gender: `Nam`,
  brithday: `06/03/2024`,
  email: `abc@gmail.com`,
  address: `Thanh Xuân,Hà Nội`,
};
export default function Userlnfo() {
  return (
    <>
      <div>
        <h2>Thông tin cá nhân </h2>
        <ul>
          <li>
            Họ và tên : <b>{User.name}</b>
          </li>
          <li>
            Giới tính : <b>{User.gender}</b>
          </li>
          <li>
            Ngày sinh : <b>{User.brithday}</b>
          </li>
          <li>
            Email : <b>{User.email}</b>
          </li>
          <li>
            Địa chỉ : <b>{User.address}</b>
          </li>
        </ul>
      </div>
    </>
  );
}
