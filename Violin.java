final public class Violin extends StringsInstrument {
    private String stringsType;

    public Violin(String code, String produser, float price, int stringsNumber, String stringsType) {
        super(code, produser, price, stringsNumber);
        this.stringsType = stringsType;
    }

    String stringsType() { return this.stringsType; }
    void setStringsType(String stringsType) { this.stringsType = stringsType; }
}
