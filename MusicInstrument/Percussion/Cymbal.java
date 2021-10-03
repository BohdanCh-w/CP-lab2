package MusicInstrument.Percussion;
final public class Cymbal extends PercussionInstrument {
    private float pitch;

    public Cymbal(String code, String produser, float price, float weight, float pitch) {
        super(code, produser, price, weight);
        this.pitch = pitch;
    }

    public float getPitch() { return this.pitch; }
    public void setPitch(float pitch) { this.pitch = pitch; }
}
