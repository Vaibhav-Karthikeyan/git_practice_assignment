import java.util.*;
class Prime {
    public static boolean prime(int n) {
    if (n <= 1)
            return false;
    if (n == 2 || n == 3)
            return true;
    if (n % 2 == 0 || n % 3 == 0)
        return false;
    for (int i = 5; i <= Math.sqrt(n); i = i + 6)
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
    return true;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(prime(n))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}