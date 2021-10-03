final public class Trumpet extends BrassInstrument {
    private String style;

    public Trumpet(String code, String produser, float price, boolean keyed, String style) {
        super(code, produser, price, keyed);
        this.style = style;
    }

    String getStyle() { return this.style; }
    void setStyle(String style) { this.style = style; }
}
