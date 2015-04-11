package enumdata;

public class EnumTest {
    PrinterType printerType;

    public EnumTest(PrinterType printerType) {
        this.printerType = printerType;
    }

    public void feature() {
        switch (printerType) {
            case DOTMATRIX:
                System.out.println("Dot-matrix printers are economical and almost " +
                        "obsolete");
                break;
            case INKJET:
                System.out.println("Inkjet printers provide decent quality prints");
                break;
            case LASER:
                System.out.println("Laser printers provide best quality prints");
                break;
        }
    }
}
