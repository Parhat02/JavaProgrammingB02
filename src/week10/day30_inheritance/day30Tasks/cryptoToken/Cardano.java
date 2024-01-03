package week10.day30_inheritance.day30Tasks.cryptoToken;

public class Cardano extends CryptoToken{

    public Cardano(double price, double quantity, double marketCap, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }
}
