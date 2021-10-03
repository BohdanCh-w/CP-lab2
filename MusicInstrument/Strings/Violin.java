package MusicInstrument.Strings;
final public class Violin extends StringsInstrument {
    private String stringsType;

    public Violin(String code, String produser, double price, double weight, int stringsNumber, String stringsType) {
        super(code, produser, price, weight, stringsNumber);
        this.stringsType = stringsType;
    }

    public String stringsType() { return this.stringsType; }
    public void setStringsType(String stringsType) { this.stringsType = stringsType; }
    public String toString() { 
        return " " + this.getCode() + " - " + this.getProduser() + ". " + this.getPrice() + "$, " 
        + this.getWeight() + "kg, strings - (" + this.getStringNumber() + ", type - " + this.stringsType + ")"; 
    }
}
