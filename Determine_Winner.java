import java.util.*;
public class Determine_Winner {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int t=1;t<=testCase;t++){
        int pA = sc.nextInt();
        int pB = sc.nextInt();

        int qA = sc.nextInt();
        int qB = sc.nextInt();

        int pratapMax = (pA>pB) ? pA : pB;
        int quencyMax = (qA>qB) ? qA : qB;

        if(pratapMax<quencyMax){
            System.out.println("P");
        }else if(quencyMax<pratapMax){
            System.out.println("Q");
        }else{
            System.out.println("TIE");
            }
        }
    }
}
