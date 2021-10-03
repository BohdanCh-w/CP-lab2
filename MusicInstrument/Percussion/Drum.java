package MusicInstrument.Percussion;
final public class Drum extends PercussionInstrument {
    private int mountNumber;

    public Drum(String code, String produser, double price, double weight, int mountNumber) {
        super(code, produser, price, weight);
        this.mountNumber = mountNumber;
    }

    public int getMountNumber() { return this.mountNumber; }
    public void setMountNumber(int mountNumber) { this.mountNumber = mountNumber; }

    public String toString() { 
        return " " + this.getCode() + " - " + this.getProduser() + ". " + this.getPrice() + "$, " 
        + this.getWeight() + "kg " + ", mounts - " + this.mountNumber; 
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Drum))
            return false;
        Drum other = (Drum) o;
        return this.getCode() == other.getCode() &&
            this.getProduser() == other.getProduser() &&
            this.getPrice() == other.getPrice() &&
            this.getWeight() == other.getWeight() &&
            this.getMountNumber() == other.getMountNumber();
    }
}
