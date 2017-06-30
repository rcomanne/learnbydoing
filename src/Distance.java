public class Distance {
    public static void main(String[] args) {
        double d1 = getDistance(4,5,4,5);
        System.out.println(d1);

        double d2 = getDistance(-2,1,1,5);
        System.out.println(d2);
    }

    public static double getDistance (int x1, int y1, int x2, int y2) {
        double d = ((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1));
        d = Math.sqrt(d);
        return d;
    }
}
