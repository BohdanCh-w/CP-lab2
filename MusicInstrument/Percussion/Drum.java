package MusicInstrument.Percussion;
final public class Drum extends PercussionInstrument {
    private int mountNumber;

    public Drum(String code, String produser, float price, float weight, int mountNumber) {
        super(code, produser, price, weight);
        this.mountNumber = mountNumber;
    }

    public int getMountNumber() { return this.mountNumber; }
    public void setMountNumber(int mountNumber) { this.mountNumber = mountNumber; }
}
