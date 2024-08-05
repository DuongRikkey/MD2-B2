import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập snt cần tìm");
        int prime=sc.nextInt();
        int num=2;// số ngto đầu
        int count=0; //biến đếm
        while(count<prime){
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                count++;
                System.out.println("số nguyên tố tại"+count+"là"+num);

            }
            num=num+1;

        }

//


//        Scanner sc = new Scanner(System.in);
//        System.out.println("SNT CẦN CHECK");
//        int number = sc.nextInt();
//        if (number <2) {
//            System.out.println("Ko phải snt nhé");
//
//        }
//        int i=2;
//        boolean check=true;
//        while (i<=Math.sqrt(number)){
//            if (number%i==0){
//                check=false;
//                break;
//            }
//
//        }
//        if (check){
//            System.out.println("Chính là snt");
//        }
//        else {
//            System.out.println("Ko phải snt");
//        }
    }
}
