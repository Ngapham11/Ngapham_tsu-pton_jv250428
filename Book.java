package SS10.bai2;

public class Book { private String bookName;
    private String author;
    private int publishYear;

    public Book(String bookName, String author, int publishYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    public void displayBook(){
        System.out.printf("Ten sach :%s--Tac gia :%s--Nam xuat ban :%d\n",this.bookName,this.author,this.publishYear);
    }
}
