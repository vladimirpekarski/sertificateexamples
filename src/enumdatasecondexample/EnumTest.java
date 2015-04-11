package enumdatasecondexample;

public class EnumTest {
    PrinterType printerType;

    public EnumTest(PrinterType printerType) {
        this.printerType = printerType;
    }

    public void feature() {
        switch (printerType) {
            case DOTMATRIX:
                System.out.println("Dot-matrix printers are economical");
                break;
            case INKJET:
                System.out.println("Inkjet printers provide decent quality prints");
                break;
            case LASER:
                System.out.println("Laser printers provide the best quality prints");
                break;
        }

        System.out.println("Print page capacity per minute: "
                + printerType.getPagePrintCapacity());
    }
}
