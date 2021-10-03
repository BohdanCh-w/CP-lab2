package MusicInstrument.Brass;
final public class Trumpet extends BrassInstrument {
    private String style;

    public Trumpet(String code, String produser, double price, double weight, boolean keyed, String style) {
        super(code, produser, price, weight, keyed);
        this.style = style;
    }

    public String getStyle() { return this.style; }
    public void setStyle(String style) { this.style = style; }

    public String toString() { 
        return " " + this.getCode() + " - " + this.getProduser() + ". " + this.getPrice() + "$, " 
        + this.getWeight() + "kg " + (this.isKeyed() ? "keyed" : "without key") + ", style - " + this.style; 
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Trumpet))
            return false;
        Trumpet other = (Trumpet) o;
        return this.getCode() == other.getCode() &&
            this.getProduser() == other.getProduser() &&
            this.getPrice() == other.getPrice() &&
            this.getWeight() == other.getWeight() &&
            this.isKeyed() == other.isKeyed() &&
            this.getStyle() == other.getStyle();
    }
}
