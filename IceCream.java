public class IceCream {

    public static void main(String[] args) {
        Icecreams(5,1);

    }
        public static void Icecreams(int N, int D){
            for(int i=1;i<=D;i++){
                int eat = N/2;
                int rem = N - eat;
                N = rem * 3;
            }
            System.out.println(N);
    }
}