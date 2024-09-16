public class MathOperations {
    public static void maximum(int a, int b){
        System.out.println(Math.max(a,b));
    }
    public static void minimum(int a, int b){
        System.out.println(Math.min(a, b));
    }
    public static void power(int a, int b){
        System.out.println((int)Math.pow(a, b));
    }
    public static void squareRoot(int a){
        System.out.println((int)Math.sqrt(a));
    }
    public static void main(String[] args) {

        maximum(5,8);
        minimum(88, 550);
        power(4,2);
        squareRoot(16);


    }
}
