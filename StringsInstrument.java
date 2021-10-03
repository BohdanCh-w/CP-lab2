public class StringsInstrument extends MusicInstrument {
    private int stringsNumber;

    public StringsInstrument(String code, String produser, float price, int stringsNumber) {
        super(code, produser, price);
        this.stringsNumber = stringsNumber;
    }

    int getStringNumber() { return this.stringsNumber; }
    void setStringNumber(int value) { this.stringsNumber = value; }
}