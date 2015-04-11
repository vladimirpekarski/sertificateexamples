package enumdatasecondexample;

public class Main {
    public static void main(String[] args) {
        EnumTest enumTest = new EnumTest(PrinterType.DOTMATRIX);
        enumTest.feature();

        EnumTest enumTest1 = new EnumTest(PrinterType.INKJET);
        enumTest1.feature();
    }
}
