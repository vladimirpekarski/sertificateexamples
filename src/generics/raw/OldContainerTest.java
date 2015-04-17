package generics.raw;

import java.util.Vector;

public class OldContainerTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(10.0f);
        vector.add(100.0);
        for (int i = 0; i < vector.size(); i++) {
//            Float temp = (Float) vector.get(i);
            System.out.println(vector.get(i));
        }
    }
}
