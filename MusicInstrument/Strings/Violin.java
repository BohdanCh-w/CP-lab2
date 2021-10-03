package MusicInstrument.Strings;
final public class Violin extends StringsInstrument {
    private String stringsType;

    public Violin(String code, String produser, float price, float weight, int stringsNumber, String stringsType) {
        super(code, produser, price, weight, stringsNumber);
        this.stringsType = stringsType;
    }

    public String stringsType() { return this.stringsType; }
    public void setStringsType(String stringsType) { this.stringsType = stringsType; }
}
