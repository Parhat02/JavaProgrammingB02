package week10.day30_inheritance.day30Tasks.cryptoToken;

public class CryptoToken {

    private double price, quantity, marketCap, circulatingSupply;
    private boolean isMineable;

    public CryptoToken(double price, double quantity, double marketCap, double circulatingSupply, boolean isMineable) {

        setPrice(price);
        setQuantity(quantity);
        setMarketCap(marketCap);
        setCirculatingSupply(circulatingSupply);
        setMineable(isMineable);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Price can not be set to zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if (price < 0){
            System.err.println("Quantity can nt set to negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        if (marketCap < 0){
            System.err.println("MarketCap can not be zero");
            System.exit(1);
        }
        this.marketCap = marketCap;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double totalPrice(){
        return price*quantity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}
