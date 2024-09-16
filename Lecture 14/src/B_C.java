public class B_C{
    public static int factorial(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static int binomial(int n, int r){
        int nn = factorial(n);
        int rr = factorial(r);
        int xx = factorial(n-r);

        int binomial = nn / (rr * xx);
//        int binomial = factorial(n) / (factorial(r) * factorial(n-r));
        return binomial;
    }
    public static void main(String args[]){
        int b = binomial(5,2);
        System.out.println(b);
    }

}
