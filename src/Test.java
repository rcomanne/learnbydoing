import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(2147483647);
        int b = r.nextInt(2147483647);
        int c = r.nextInt(2147483647);
        int d = r.nextInt(2147483647);
        int e = r.nextInt(2147483647);
        int f = r.nextInt(2147483647);
        int g = r.nextInt(2147483647);
        int h = r.nextInt(2147483647);
        int i = r.nextInt(2147483647);
        int j = r.nextInt(2147483647);
        int k = r.nextInt(2147483647);
        int l = r.nextInt(2147483647);
        int m = r.nextInt(2147483647);
        int n = r.nextInt(2147483647);
        int o = r.nextInt(2147483647);
        int p = r.nextInt(2147483647);
        int counter = 0;

        while (a != b && c != d && e != f && g != h && i != j && k != l && m != n && o != p) {
            System.out.println(counter++);
        }
        System.out.println("Uiteindelijke waarden: "+a+", "+b+", "+c+", "+d+", "+e+", "+f+", "+g+", "+h+", "+i+", "+j+", "+k+", "+l+", "+m+", "+n+", "+o+", "+p);
    }
}
