import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập N");
        int N = 1;
        while (true){
            if(N%5==0 && N%7==0 && N%11==0  ){
                System.out.println("Gía trị cần trìm là = " +N);
                break;
            }
            N++;

        }
    }
}
