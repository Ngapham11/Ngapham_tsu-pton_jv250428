public class SS5_bai2 {
    public static void main(String[] args) {
        StringBuilder str1 =new StringBuilder("Hello,Java World");
        System.out.println(str1);
       StringBuilder str2= str1.delete(5,10);


        System.out.println(str2);
       
    }
}
