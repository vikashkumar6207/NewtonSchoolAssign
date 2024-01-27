import java.util.*;
public class ButterflyPattern { 
    public static void main(String[] args) {
                    
        Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                    for (int i = 1; i <= N; i++){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                int spaces = 2 * (N - i);
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // printing lower wing of butterfly
            for (int i = N; i >= 1; i--) {
                for (int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                int spaces = 2 * (N - i);
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                }
            }
    
        }

