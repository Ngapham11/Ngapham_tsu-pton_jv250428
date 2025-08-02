package SS10.bai2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static HashMap<String,Book> bookList=new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {try {
            System.out.println("\n****MENU QUAN LY SACH****\n" +
                    "1.Them sach\n" +
                    "2.Tim kiem sach\n" +
                    "3.Hien thi danh sach sach\n" +
                    "4.Thoat\n");
            System.out.println("Lua chon cua ban la :");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    String name =InputData.inputBookName(scanner);
                    String author=InputData.inputAuthor(scanner);
                    int publishYear=InputData.inputPublishYear(scanner);
                    Book newBook=new Book(name,author,publishYear);
                    bookList.put(newBook.getBookName(),newBook);
                    break;
                case 2:
                    boolean check=false;
                    System.out.println("Nhap ten sach ma ban muon tim");
                    String searchBookName=scanner.nextLine();
                    Book book = bookList.get(searchBookName);
                    if (book != null) {
                        System.out.println("Sach ma ban muon tim la:");
                        book.displayBook();
                    } else {
                        System.out.println("Khong tim thay");
                    }
                    break;
                case 3:
                    if (bookList.isEmpty()){
                        System.out.println("Danh sach rong");
                    }else
                    {for (Book b : bookList.values()) {
                        b.displayBook();
                    }
                    }
                    break;
                case 4:System.exit(0);
                    break;
                default:
                    System.err.println("Hay chon 1-4");
                    break;
            }
        }catch (Exception e){
            System.out.println("Nhap tu 1-4");
        }


        }while (true);
    }

}
