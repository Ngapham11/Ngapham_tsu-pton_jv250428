public class Ss7_bai2 {
    public static void main(String[] args) {
      Book myBook=new Book();
      //Thiet lap thuoc tinh
      myBook.setTitle("Java Programming");
      myBook.setAuthor("john Doe");
      //Thiet lap gia hop le
       myBook.setPrice(29.99);
        //Hien thi thong tin sach
        System.out.println("tieu de : "+myBook.getTitle());
        System.out.println("Tac gia :"+myBook.getAuthor());
        System.out.println("Gia tien :"+myBook.getPrice());
        myBook.setPrice(35.50);
        System.out.println("Gia moi la :"+myBook.getPrice());
        myBook.setPrice(-5.00);
    }

}
