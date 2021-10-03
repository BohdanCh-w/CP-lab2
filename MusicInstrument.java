public class MusicInstrument {
    private String code;
    private String produser;
    private float price;

    public MusicInstrument(String code, String produser, float price) {
        this.code = code;
        this.produser = produser;
        this.price = price;
    }

    String getCode() { return this.code; }
    void setCode(String code) { this.code = code; }

    String getProduser() { return this.produser; }
    void setProduser(String produser) { this.produser = produser; }

    float getPrice() { return this.price; }
    void setPrice(float price) { this.price = price; }
}