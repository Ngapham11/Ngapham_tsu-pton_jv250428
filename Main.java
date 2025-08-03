package SS11.bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.forEach(number->{
            if (number%2==0){
                System.out.println(number);
            }
        });
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Tổng của tất cả các số trong danh sách: " + sum);
    }
}
