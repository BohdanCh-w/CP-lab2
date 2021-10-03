package MusicInstrument;

public class MusicInstrument {
    private String code;
    private String produser;
    private double price;
    private double weight;

    public enum instrumentType {
        BRASS,
        PERCUSSION,
        STRINGS
    }

    public MusicInstrument(String code, String produser, double price, double weight) {
        this.code = code;
        this.produser = produser;
        this.price = price;
        this.weight = weight;
    }

    public String getCode() { return this.code; }
    public void setCode(String code) { this.code = code; }

    public String getProduser() { return this.produser; }
    public void setProduser(String produser) { this.produser = produser; }

    public double getPrice() { return this.price; }
    public void setPrice(double price) { this.price = price; }

    public double getWeight() { return this.weight; }
    public void setWeight(double weight) { this.weight = weight; }
}