package SS10.bai3;

public class Users { private String userName;
    private String email;
    private String telephone;

    public Users(String userName, String email, String telephone) {
        this.userName = userName;
        this.email = email;
        this.telephone = telephone;
    }

    public Users() {
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }public void displayUserData(){
        System.out.printf("Ten:%s--Email:%s--So dien thoai:%s\n",this.userName,this.email,this.telephone);
    }
}
