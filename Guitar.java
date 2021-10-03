final public class Guitar extends StringsInstrument {
    private String styleType;

    public Guitar(String code, String produser, float price, int stringsNumber, String styleType) {
        super(code, produser, price, stringsNumber);
        this.styleType = styleType;
    }

    String getStyleType() { return this.styleType; }
    void setStyleType(String styleType) { this.styleType = styleType; }
}
