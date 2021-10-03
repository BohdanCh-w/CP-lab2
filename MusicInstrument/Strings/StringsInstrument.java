package MusicInstrument.Strings;
import MusicInstrument.MusicInstrument;

public class StringsInstrument extends MusicInstrument {
    private int stringsNumber;

    public StringsInstrument(String code, String produser, float price, float weight, int stringsNumber) {
        super(code, produser, price, weight);
        this.stringsNumber = stringsNumber;
    }

    public int getStringNumber() { return this.stringsNumber; }
    public void setStringNumber(int value) { this.stringsNumber = value; }
}