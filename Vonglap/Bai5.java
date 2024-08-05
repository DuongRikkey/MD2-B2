import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập i");
        int i = sc.nextInt();
        System.out.println("Mời bạn nhập num");
        int num=sc.nextInt();
        int sum=0;
        for( i=0;i<=num;i++){
            if(i%2==0){
                sum+=i;

            }
        }
        System.out.println("vậy tổng số chẵn là"+sum);
    }
}
