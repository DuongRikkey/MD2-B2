import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm Toán");
        double Mathematic = sc.nextDouble();
        System.out.println("Nhập điểm Lý");
        double physics = sc.nextDouble();
        System.out.println("Nhập điểm Hóa");
        double chemistry = sc.nextDouble();
        System.out.println("Nhập điểm Anh");
        double english = sc.nextDouble();
        double dtb = (Mathematic + physics + chemistry + english)/4;
        String Traloi=(dtb>=0 && dtb<5)?"yếu":(dtb>5 && dtb <=6.5)?"TB":(dtb<=8 && dtb <9)?"Gioi":"Xuất xắc";
        System.out.println(Traloi);
    }
}
