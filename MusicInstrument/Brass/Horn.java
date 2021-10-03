package MusicInstrument.Brass;
final public class Horn extends BrassInstrument {
    private char pitchKey;

    public Horn(String code, String produser, double price, double weight, boolean keyed, char pitchKey) {
        super(code, produser, price, weight, keyed);
        this.pitchKey = pitchKey;
    }

    public char getPitchKey() { return this.pitchKey; }
    public void setPitchKey(char pitchKey) { this.pitchKey = pitchKey; }
}
