import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a,b,c;

    while (true){
        System.out.println("Mời bạn nhập a");
        a = sc.nextDouble();
        System.out.println("Mời bạn nhập b");
        b = sc.nextDouble();
        System.out.println("Mời bạn nhập c");
        c = sc.nextDouble();

        if(isStandard(a,b,c)){
            double p=a+b+c;
            double s=(a+b+c)/2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Chu vi của tam giác là" +p);
            System.out.println("Dien tich của tam giác là" +area);
            break;

        }
        else {
            System.out.println("Đây không phải là tam giác hợp lệ. Vui lòng nhập lại.");
        }
    }
    }
public static boolean isStandard(double a, double b, double c){
        return (a>0&&b>0&&c>0)&&(a+b>c && b+c>a && a+c>b);
}
}

