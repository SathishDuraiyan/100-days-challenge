import java.util.*;

public class even_odd {

    public static void main(String[] args) {
        Scanner dim = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = dim.nextInt();
        dim.close();

        // Method-1 Normal Method
        /*
         * if(n%2==0){
         * System.out.println("Is Even");
         * }
         * else{
         * System.out.println("Is Odd");
         * }
         */

        // Method-2 Ternary operator ---> condition ? (if state ):(else state);
        /*
         * String st = n%2==0 ? " is Even" : " is Odd";
         * System.out.println(n+st);
         */

        // Method-3 Bitwise-AND operator --> (n&1)
        /*
         * if (isEven(n))
         * System.out.println("Even");
         * else
         * System.out.println("Odd");
         * 
         * }
         * static boolean isEven(int n){
         * return ((n & 1)!=1);
         * }
         * 
         */

        // Method-4 Bitwise-XOR operator ---> n XOR 1 is if it is n+1 means EVEN
        // otherwise ODD
        System.out.println((isEven(n)) ? "even" : "odd");

    }

    // Method-5 bitwise OR operator ---> if (n|1)==n means odd .(n | 1)>n is Even
    static boolean isEven(int n) {

        if ((n | 1) > n)
            return true;
        else
            return false;
    }
}
