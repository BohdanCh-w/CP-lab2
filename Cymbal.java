final public class Cymbal extends PercussionInstrument {
    private float pitch;

    public Cymbal(String code, String produser, float price, float pitch) {
        super(code, produser, price);
        this.pitch = pitch;
    }

    float getPitch() { return this.pitch; }
    void setPitch(float pitch) { this.pitch = pitch; }
}
