package MusicInstrument.Strings;
final public class Violin extends StringsInstrument {
    private String stringsType;

    public Violin(String code, String produser, double price, double weight, int stringsNumber, String stringsType) {
        super(code, produser, price, weight, stringsNumber);
        this.stringsType = stringsType;
    }

    public String getStringsType() { return this.stringsType; }
    public void setStringsType(String stringsType) { this.stringsType = stringsType; }
    public String toString() { 
        return " " + this.getCode() + " - " + this.getProduser() + ". " + this.getPrice() + "$, " 
        + this.getWeight() + "kg, strings - (" + this.getStringNumber() + ", type - " + this.stringsType + ")"; 
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Violin))
            return false;
        Violin other = (Violin) o;
        return this.getCode() == other.getCode() &&
            this.getProduser() == other.getProduser() &&
            this.getPrice() == other.getPrice() &&
            this.getWeight() == other.getWeight() &&
            this.getStringNumber() == other.getStringNumber() &&
            this.getStringsType() == other.getStringsType();
    }
}
