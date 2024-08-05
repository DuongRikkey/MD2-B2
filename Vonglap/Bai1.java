import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số");
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println(choice+" là Một");
                break;
            case 2:
                System.out.println(choice+" là hai");
                break;
            case 3:
                System.out.println(choice+" là ba");
                break;
            case 4:
                System.out.println(choice+" là bốn");
                break;
            case 5:
                System.out.println(choice+" là năm");
                break;
            case 6:
                System.out.println(choice+"là sáu");
                break;
            case 7:
                System.out.println(choice+"là bảy");
                break;
            case 8:
                System.out.println(choice+"là tám");
                break;
            case 9:
                System.out.println(choice+"là chín");
                break;
            default:
                System.out.println("Số kông hợp lệ");
                break;



        }
    }
}
