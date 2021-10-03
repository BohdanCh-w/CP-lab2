package MusicInstrument.Brass;
final public class Horn extends BrassInstrument {
    private char pitchKey;

    public Horn(String code, String produser, double price, double weight, boolean keyed, char pitchKey) {
        super(code, produser, price, weight, keyed);
        this.pitchKey = pitchKey;
    }

    public char getPitchKey() { return this.pitchKey; }
    public void setPitchKey(char pitchKey) { this.pitchKey = pitchKey; }

    public String toString() { 
        return " " + this.getCode() + " - " + this.getProduser() + ". " + this.getPrice() + "$, " 
        + this.getWeight() + "kg " + (this.isKeyed() ? "keyed" : "without key") + ", pitch - " + this.pitchKey; 
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Horn))
            return false;
        Horn other = (Horn) o;
        return this.getCode() == other.getCode() &&
            this.getProduser() == other.getProduser() &&
            this.getPrice() == other.getPrice() &&
            this.getWeight() == other.getWeight() &&
            this.isKeyed() == other.isKeyed() &&
            this.getPitchKey() == other.getPitchKey();
    }
}
