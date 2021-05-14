package ch03;

public class MethodDemo {
    public static void main(String[] args) {
        int x = sum(3, 4);
        System.out.println(x);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
    public static boolean compare(int a,int b){
        return a==b;
    }
}
