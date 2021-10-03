public class StringsInstrument extends MusicInstrument {
    private int stringsNumber;

    public StringsInstrument(String code, String produser, float price, float weight, int stringsNumber) {
        super(code, produser, price, weight);
        this.stringsNumber = stringsNumber;
    }

    int getStringNumber() { return this.stringsNumber; }
    void setStringNumber(int value) { this.stringsNumber = value; }
}