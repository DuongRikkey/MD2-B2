import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=0;
        while (choice!=4)
           { System.out.println("Menu");
            System.out.println("1. Kiểm tra chẵn lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Chia hết cho 3 ko");
            System.out.println("4. Thoát");

            System.out.println("Nhập lựa chọn nhé");
             choice = sc.nextInt();

             switch (choice){
                 case 1:
                     checkEvenOdd(sc);
                     break;
                 case 2:
                     checkPrime(sc);
                     break;
                 case 3:
                     checkChiahetcho3(sc);
                     break;
                 case 4:
                     System.out.println("Bạn đã thoát");
                     break;
                 default:
                     System.out.println("Nhập lại ");
             }
        }

    }
    private static void checkEvenOdd(Scanner sc){
        System.out.println("Mời bạn nhập số");
        int number= sc.nextInt();
        if (number%2==0){
            System.out.println(number+"là Even");
        }
        else {
            System.out.println(number+ " là Odd");
        }
    }

    private static void checkPrime(Scanner sc){
        System.out.println("Mời bạn nhập số");
        int num= sc.nextInt();
        int i=2;
        if (num<2){
            System.out.println("Ko phải prime");

        }
        boolean flag=true;
        while (i<=Math.sqrt(num)){
            if (num%i==0){
                flag=false;
                break;
            }
            i++;

        }
        if (flag){
            System.out.println(num+" " +" là Prime");
        }
        else {
            System.out.println(num+ " " +"Not Prime");
        }
    }

    private static void checkChiahetcho3(Scanner sc){
        System.out.println("Mời bạn nhập số");
        int number= sc.nextInt();
        if (number%3==0){
            System.out.println(number+"chia het cho 3");
        }
        else {
            System.out.println(number+" 0 chia het cho 3");
        }

    }

}





