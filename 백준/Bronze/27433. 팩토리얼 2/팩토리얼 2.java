import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int i = Integer.parseInt(String.valueOf(sc.nextInt()));

        System.out.println(recursiveFac(i));


    }

    public static long recursiveFac(int n){
        if(n==0){
            return 1;
        }else{
            return n*recursiveFac(n-1);
        }
    }

}
