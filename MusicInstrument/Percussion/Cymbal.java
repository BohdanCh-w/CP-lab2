package MusicInstrument.Percussion;
final public class Cymbal extends PercussionInstrument {
    private double pitch;

    public Cymbal(String code, String produser, double price, double weight, double pitch) {
        super(code, produser, price, weight);
        this.pitch = pitch;
    }

    public double getPitch() { return this.pitch; }
    public void setPitch(double pitch) { this.pitch = pitch; }
}
