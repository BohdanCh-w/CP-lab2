package MusicInstrument;

public class MusicInstrument {
    private String code;
    private String produser;
    private float price;
    private float weight;

    public enum instrumentType {
        BRASS,
        PERCUSSION,
        STRINGS
    }

    public MusicInstrument(String code, String produser, float price, float weight) {
        this.code = code;
        this.produser = produser;
        this.price = price;
        this.weight = weight;
    }

    public String getCode() { return this.code; }
    public void setCode(String code) { this.code = code; }

    public String getProduser() { return this.produser; }
    public void setProduser(String produser) { this.produser = produser; }

    public float getPrice() { return this.price; }
    public void setPrice(float price) { this.price = price; }

    public float getWeight() { return this.weight; }
    public void setWeight(float weight) { this.weight = weight; }
}