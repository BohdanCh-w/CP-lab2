package MusicInstrument.Percussion;
final public class Cymbal extends PercussionInstrument {
    private double pitch;

    public Cymbal(String code, String produser, double price, double weight, double pitch) {
        super(code, produser, price, weight);
        this.pitch = pitch;
    }

    public double getPitch() { return this.pitch; }
    public void setPitch(double pitch) { this.pitch = pitch; }

    public String toString() { 
        return " " + this.getCode() + " - " + this.getProduser() + ". " + this.getPrice() + "$, " 
        + this.getWeight() + "kg " + ", pitch - " + this.pitch; 
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cymbal))
            return false;
        Cymbal other = (Cymbal) o;
        return this.getCode() == other.getCode() &&
            this.getProduser() == other.getProduser() &&
            this.getPrice() == other.getPrice() &&
            this.getWeight() == other.getWeight() &&
            this.getPitch() == other.getPitch();
    }
}
