package week10.day30_inheritance.day30Tasks.cryptoToken;

public class Bitcoin extends CryptoToken{


    public Bitcoin(double price, double quantity, double marketCap, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }
}
