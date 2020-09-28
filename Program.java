public class Program {
    public static void main(String[] args) {
        System.out.println(multiply(3, 3) + "\n");
        System.out.println(fib(4));

    }

    /**
     * @param n the number to be multiplied
     * @param m the times it is multiplied
     * @return the multiplication result
     */
        public static int multiply ( int n, int m){
            if (m == 0)
                return 0;
            return n + multiply( n, m - 1);
        }

    /**
     * @param n number
     * @return the fibonacci number at the nth position
     */

    public static int fib ( int n){
            if (n == 0 || n == 1)
                return n;
            else
                return fib(n - 1) + fib(n - 2);
        }

    }
