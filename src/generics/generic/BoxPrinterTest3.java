package generics.generic;

public class BoxPrinterTest3 {
    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<>(new Integer(10));
        System.out.println(value1);
        Integer intValue = value1.getVal();

        BoxPrinter<String> value2 = new BoxPrinter<>("Hello world");
        System.out.println(value2);
//        Integer intValue2 = value2.getVal();
    }
}
