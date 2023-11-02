import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


public class Increment_decrement {
    public static void main (String[] args){
        // Your code here
        Scanner scan=new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        x--;
        y++;
        System.out.println(x+" "+y);
    }
}

