import java.util.Scanner;
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("Menu gồm");
            System.out.println("1.Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2.Tính chu vi và diện tích hình tam giác");
            System.out.println("3.Tính chu vi và diện tích hình tròn");
            System.out.println("4..Thoát");

            System.out.println("Mời bạn nhập lựa chọn");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkPSHCN(sc);
                    break;
                case 2:
                    checkPSTAMGIAC(sc);
                    break;
                case 3:
                    checkPShinhtron(sc);
                    break;
                case 4:
                    System.out.println("Bạn đã thoát");
                    ;
                    break;
                default:
                    System.out.println("Bạn đã nhập sai xin vui lòng nhập lại");
            }
        }

    }

    private static void checkPSHCN(Scanner sc) {
        System.out.println("Mời bạn nhập số");
        int a = sc.nextInt();
        System.out.println("Mời bạn nhập số");
        int b = sc.nextInt();
        int p = 2 * a * b;
        int s = a * b;
        System.out.println("Diện tích hcn là" + s);
        System.out.println("Chu vi hcn là" + p);


    }

    private static void checkPSTAMGIAC(Scanner sc) {
        System.out.println("Mời bạn nhập cạnh1");
        int a = sc.nextInt();
        System.out.println("Mời bạn nhập cạnh2");
        int b = sc.nextInt();
        System.out.println("Mời bạn nhập cạnh3");
        int c = sc.nextInt();
        int p =  a + b + c;
        int s = (a + b+c) / 2;
        System.out.println("Diện tích hcn là" + s);
        System.out.println("Chu vi hcn là" + p);

    }
    private static void checkPShinhtron(Scanner sc) {
        System.out.println("Mời bạn nhập bán kính");
        int r = sc.nextInt();

        double p =  2*Math.PI*Math.pow(r,1);
        double s = Math.PI*Math.pow(r,2);
        System.out.println("Diện tích hcn là" + s);
        System.out.println("Chu vi hcn là" + p);

    }
}