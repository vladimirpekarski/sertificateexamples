package generics.objecttype;

public class BoxPrinterTest2 {
    public static void main(String[] args) {
        BoxPrinter value1 = new BoxPrinter(new Integer(10));
        System.out.println(value1);
        Integer intValue = (Integer) value1.getVal();

        BoxPrinter value2 = new BoxPrinter("Hello world");
        System.out.println(value2);
//        Integer intValue2 = (Integer) value2.getVal();
    }
}
