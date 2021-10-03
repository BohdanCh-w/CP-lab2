public class BrassInstrument extends MusicInstrument {
    private boolean keyed;

    public BrassInstrument(String code, String produser, float price, float weight, boolean keyed) {
        super(code, produser, price, weight);
        this.keyed = keyed;
    }

    boolean isKeyed() { return this.keyed; }
    void setKeyed(boolean keyed) { this.keyed = keyed; }
}
