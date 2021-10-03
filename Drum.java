final public class Drum extends PercussionInstrument {
    private int mountNumber;

    public Drum(String code, String produser, float price, float weight, int mountNumber) {
        super(code, produser, price, weight);
        this.mountNumber = mountNumber;
    }

    int getMountNumber() { return this.mountNumber; }
    void setMountNumber(int mountNumber) { this.mountNumber = mountNumber; }
}
