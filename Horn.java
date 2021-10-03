final public class Horn extends BrassInstrument {
    private char pitchKey;

    public Horn(String code, String produser, float price, float weight, boolean keyed, char pitchKey) {
        super(code, produser, price, weight, keyed);
        this.pitchKey = pitchKey;
    }

    char getPitchKey() { return this.pitchKey; }
    void setPitchKey(char pitchKey) { this.pitchKey = pitchKey; }
}
