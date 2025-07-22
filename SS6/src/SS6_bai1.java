


import java.util.Scanner;

public class SS6_bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] scores = new float[1000];
        int currentElement = 0;
        do {//in Menu
            System.out.println("******************QUẢN LÝ ĐIỂM SV****************\n" +
                    "\n" +
                    "1. Nhập danh sách điểm sinh viên\n" +
                    "2. In danh sách điểm\n" +
                    "3. Tính điểm trung bình của các sinh viên\n" +
                    "4. Tìm điểm cao nhất và thấp nhất\n" +
                    "5. Đếm số lượng sinh viên đạt và trượt\n" +
                    "6.Sắp xếp điểm tăng dần\n" +
                    "7.Thống kê số lượng sinh viên giỏi và xuất sắc\n" +
                    "8. Thoát");
            System.out.println("Moi ban chon 1-8");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Ban muon nhap diem cho bao nhieu sinh vien");
                    int total = scanner.nextInt();
                    for (int i = 0; i < total; i++) {
                        System.out.println("Nhap diem : ");
                        scores[i] = scanner.nextFloat();
                        currentElement++;
                    }
                    break;
                case 2:
                    System.out.println("Danh sach diem da nhap la :");
                    for (int i = 0; i < currentElement; i++) {
                        System.out.printf("%.1f \t",scores[i]);
                    }
                    break;
                case 3:
                    System.out.println("Diem trung binh la :");
                    int sum = 0;
                    for (int i = 0; i < currentElement; i++) {
                        sum += scores[i];
                    }
                    System.out.println("Diem TB "+ (sum/currentElement));
                    break;
                case 4:
                    System.out.println("Tim diem cao nhat va thap nhat");
                    float max=scores[0];
                    for (int i=1;i<currentElement;i++){
                        if (max<scores[i]){
                            max=scores[i];
                        }
                    }
                    float min=scores[0];
                    for (int i=1;i<currentElement;i++){
                        if (min>scores[i]){
                            min=scores[i];
                        }
                    }
                    System.out.println("Diem thap nhat la :"+min);
                    System.out.println("Diem cao nhat la :"+max);
                    break;
                case 5:
                    System.out.println("Tinh tong so sinh vien dat va truot");
                    int pass=0;
                    int notPass=0;
                    for (int i=0;i<currentElement;i++){
                        if (scores[i]>=5){
                           pass++;
                        }else notPass++;
                    }
                    System.out.println("So hoc sinh truot la :"+notPass);
                    System.out.println("So hoc sinh do la :"+pass);
                    break;
                case 6:
                    System.out.println("Sap xep diem tang dan");
                    for (int i=0;i<currentElement;i++){
                        for (int j=i+1;j<currentElement;j++){
                            if (scores[i]>scores[j]){
                                float temp=scores[i];
                                scores[i]=scores[j];
                                scores[j]=temp;
                            }
                        }
                    }
                    System.out.println("Danh sach diem tang dan la ");
                    for (int i = 0; i < currentElement; i++) {
                        System.out.printf("%.1f \t",scores[i]);
                    }
                    break;
                case 7:
                    System.out.println("So luong sinh vien gioi va xuat sac la :");
                    int goodStudent=0;
                    for (int i=0;i<currentElement;i++){
                        if (scores[i]>=8){
                            goodStudent++;
                        }
                    }
                    System.out.println(goodStudent);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui long chọn lai");
            }
        } while (true);
    }
}
