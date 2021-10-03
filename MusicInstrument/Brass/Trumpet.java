package MusicInstrument.Brass;
final public class Trumpet extends BrassInstrument {
    private String style;

    public Trumpet(String code, String produser, float price, float weight, boolean keyed, String style) {
        super(code, produser, price, weight, keyed);
        this.style = style;
    }

    public String getStyle() { return this.style; }
    public void setStyle(String style) { this.style = style; }
}
