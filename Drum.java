final public class Drum extends PercussionInstrument {
    private int mountNumber;

    public Drum(String code, String produser, float price, int mountNumber) {
        super(code, produser, price);
        this.mountNumber = mountNumber;
    }

    int getMountNumber() { return this.mountNumber; }
    void setMountNumber(int mountNumber) { this.mountNumber = mountNumber; }
}
