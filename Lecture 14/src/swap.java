public class swap{
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : " + a);
        System.out.print("b : " + b);
    }
    public static void main(String[] args) {
        int a = 22;
        int b = 77;
        swap(a,b);
    }
}