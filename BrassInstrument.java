public class BrassInstrument extends MusicInstrument {
    private boolean keyed;

    public BrassInstrument(String code, String produser, float price, boolean keyed) {
        super(code, produser, price);
        this.keyed = keyed;
    }

    boolean isKeyed() { return this.keyed; }
    void setKeyed(boolean keyed) { this.keyed = keyed; }
}
