public class Menu_Items {
    public static void main(String[] args) {
        calculateCost(P, Q, R, A, X);
    }
    

    public static void calculateCost(int P, int Q, int R, char choice, char subChoice) {
    if(choice=='A'){
        if(subChoice=='X'){
            System.out.println(P + 10);
        }else if(subChoice=='Y'){
            System.out.println(P + 15);
        }else if(subChoice=='Z'){
            System.out.println(P + 20);
        }else{
            System.out.println("Invalid choice.");
        }
    }else
    if(choice=='B'){
        if(subChoice=='X'){
            System.out.println(Q + 10);
        }else if(subChoice=='Y'){
            System.out.println(Q + 15);
        }else if(subChoice=='Z'){
            System.out.println(Q + 20);
        }else{
            System.out.println("Invalid choice.");
        }
    }else
    if(choice=='C'){
        if(subChoice=='X'){
            System.out.println(R + 10);
        }else if(subChoice=='Y'){
            System.out.println(R + 15);
        }else if(subChoice=='Z'){
            System.out.println(R + 20);
        }else{
            System.out.println("Invalid choice.");
        }
    }
    else{
            System.out.println("Invalid choice.");
        }
    }
}