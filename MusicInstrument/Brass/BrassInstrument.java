package MusicInstrument.Brass;
import MusicInstrument.MusicInstrument;

public class BrassInstrument extends MusicInstrument {
    private boolean keyed;

    public BrassInstrument(String code, String produser, double price, double weight, boolean keyed) {
        super(code, produser, price, weight);
        this.keyed = keyed;
    }

    public boolean isKeyed() { return this.keyed; }
    public void setKeyed(boolean keyed) { this.keyed = keyed; }
}
