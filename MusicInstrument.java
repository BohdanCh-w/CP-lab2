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

    String getCode() { return this.code; }
    void setCode(String code) { this.code = code; }

    String getProduser() { return this.produser; }
    void setProduser(String produser) { this.produser = produser; }

    float getPrice() { return this.price; }
    void setPrice(float price) { this.price = price; }

    float getWeight() { return this.weight; }
    void setWeight(float weight) { this.weight = weight; }
}