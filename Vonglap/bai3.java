import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số có tối đa 3 chữ số: ");
        number = sc.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Nhập sai giới hạn");
        }
        else {
            int hundred, dozen, unit;
            hundred = number / 100;
            dozen = (number % 100) / 10;
            unit = number % 10;

            boolean printed = false;

            // Handle hundreds
            if (hundred > 0) {
                switch (hundred) {
                    case 1:
                        System.out.print("One Hundred");
                        break;
                    case 2:
                        System.out.print("Two Hundred");
                        break;
                    case 3:
                        System.out.print("Three Hundred");
                        break;
                    case 4:
                        System.out.print("Four Hundred");
                        break;
                    case 5:
                        System.out.print("Five Hundred");
                        break;
                    case 6:
                        System.out.print("Six Hundred");
                        break;
                    case 7:
                        System.out.print("Seven Hundred");
                        break;
                    case 8:
                        System.out.print("Eight Hundred");
                        break;
                    case 9:
                        System.out.print("Nine Hundred");
                        break;
                }
                if (dozen > 0||unit>0 ) {
                    System.out.print(" AND ");
                }
                printed = true;
            }

            // Handle special cases for 10 to 19
            if (dozen == 1) {
                switch (unit) {
                    case 0:
                        System.out.print("Ten");
                        break;
                    case 1:
                        System.out.print("Eleven");
                        break;
                    case 2:
                        System.out.print("Twelve");
                        break;
                    case 3:
                        System.out.print("Thirteen");
                        break;
                    case 4:
                        System.out.print("Fourteen");
                        break;
                    case 5:
                        System.out.print("Fifteen");
                        break;
                    case 6:
                        System.out.print("Sixteen");
                        break;
                    case 7:
                        System.out.print("Seventeen");
                        break;
                    case 8:
                        System.out.print("Eighteen");
                        break;
                    case 9:
                        System.out.print("Nineteen");
                        break;
                }
                printed = true;
            } else {
                // Handle tens for numbers greater than 19
                switch (dozen) {
                    case 2:
                        System.out.print("Twenty ");
                        break;
                    case 3:
                        System.out.print("Thirty ");
                        break;
                    case 4:
                        System.out.print("Forty ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("Eighty ");
                        break;
                    case 9:
                        System.out.print("Ninety ");
                        break;
                }

                // Handle units
                switch (unit) {
                    case 0:
                        // No additional print for units if it's zero
                        break;
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
                printed = true;
            }

            // Handle case for zero explicitly
            if (number == 0) {
                System.out.print("Zero");
            }

            if (!printed) {
                System.out.print("Zero");
            }
        }
    }
}
