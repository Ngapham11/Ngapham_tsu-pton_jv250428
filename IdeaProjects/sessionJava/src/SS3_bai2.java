import java.util.Scanner;

public class SS3_bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countStudent = 0;
        int totalScore = 0;
        float maxScore = Float.MIN_VALUE;
        float minScore = Float.MAX_VALUE;
        do {
            System.out.println("**********MENU*********");
            System.out.println("1.Nhap diem hoc vien");
            System.out.println("2.Hien thi thong ke");
            System.out.println("3.Thoat");
            System.out.println("Moi ban chon tu 1-3");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("Nhap diem ");
                        float score = sc.nextFloat();
                        if (score == -1) {
                            break;
                        } else if (score < 0 || score > 10) {
                            System.err.println("Diem khong hop le ");
                        } else {
                            countStudent++;
                            totalScore+=score;
                            if (score>maxScore){
                                maxScore=score;
                            };
                            if (score<minScore){
                                minScore=score;
                            }
                            if (score < 5) {
                                System.out.println("Hoc luc yeu");
                            } else if (score < 7) {
                                System.out.println("Hoc luc trung binh");
                            } else if (score < 8) {
                                System.out.println("Hoc luc kha");

                            } else if (score < 9) {
                                System.out.println("Hoc luc gioi");

                            } else {
                                System.out.println("Hoc sinh xuat sac");

                            };
                        };
                        }while (true) ;
                        break;
                        case 2:
                           if (countStudent==0){
                               System.err.println("Chua co du lieu");
                           }else {
                               System.out.println("So hoc vien da nhap la :"+countStudent);
                               System.out.println("Diem trung binh la :"+totalScore/countStudent);
                               System.out.println("Diem cao nhat la :"+maxScore);
                               System.out.println("Diem thap nhat la :"+minScore);
                           }

                            break;
                        case 3:
                            System.exit(0);
                        default:
                            System.err.println("Ban nhap sai");
                    }
            } while (true) ;
        };
    };
