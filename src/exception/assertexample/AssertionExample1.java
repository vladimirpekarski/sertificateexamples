package exception.assertexample;

public class AssertionExample1 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;
        if (i < 10) {
            i = -i;
        }

        System.out.println("the value of i is: " + i);
        assert (i >= 0) : "impossible: i is negative!";
    }
}
