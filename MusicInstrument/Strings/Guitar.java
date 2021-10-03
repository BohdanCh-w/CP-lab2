package MusicInstrument.Strings;
final public class Guitar extends StringsInstrument {
    private String styleType;

    public Guitar(String code, String produser, double price, double weight, int stringsNumber, String styleType) {
        super(code, produser, price, weight, stringsNumber);
        this.styleType = styleType;
    }

    public String getStyleType() { return this.styleType; }
    public void setStyleType(String styleType) { this.styleType = styleType; }
    
    public String toString() { 
        return " " + this.getCode() + " - " + this.getProduser() + ". " + this.getPrice() + "$, " 
        + this.getWeight() + "kg, strings - " + this.getStringNumber() + ", style - " + this.styleType; 
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Guitar))
            return false;
        Guitar other = (Guitar) o;
        return this.getCode() == other.getCode() &&
            this.getProduser() == other.getProduser() &&
            this.getPrice() == other.getPrice() &&
            this.getWeight() == other.getWeight() &&
            this.getStringNumber() == other.getStringNumber() &&
            this.getStyleType() == other.getStyleType();
    }
}
