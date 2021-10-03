package MusicInstrument.Strings;
final public class Guitar extends StringsInstrument {
    private String styleType;

    public Guitar(String code, String produser, double price, double weight, int stringsNumber, String styleType) {
        super(code, produser, price, weight, stringsNumber);
        this.styleType = styleType;
    }

    public String getStyleType() { return this.styleType; }
    public void setStyleType(String styleType) { this.styleType = styleType; }
}
