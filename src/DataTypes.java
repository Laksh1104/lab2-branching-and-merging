public class DataTypes {
    public static long sum(int[] numbers) {
//        int s = 0; // variable to accumulate the sum in!
        long s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
