import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số num ");
        int number = sc.nextInt();
        if (number % 3==0 && number % 5==0) {
            System.out.println("Số chia hềt cho 3 và 5 là "+number);
        } else if (number % 3==0) {
            System.out.println("Số chia hết cho 3 là " +number);
        } else if (number % 5==0) {
            System.out.println("Số chia hết cho 5 là " +number);
        } else {
            System.out.println("Không chia hết cho 3 và 5 là " +number);
        }
    }
}
