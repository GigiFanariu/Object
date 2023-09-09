public class SmartphonePrice implements Cloneable {

    private String priceType;
    private double priceInEuros;

    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Price Type: " + priceType + ", Price in Euros: " + priceInEuros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartphonePrice)) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 &&
                Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}

class Smartphone implements Cloneable {
    private String brandName;
    private String modelName;
    private int batterymAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = (SmartphonePrice) producerPrice.clone();
        clonedSmartphone.retailPrice = (SmartphonePrice) retailPrice.clone();
        return clonedSmartphone;
    }

    @Override
    public String toString() {
        return "Brand: " + brandName + ", Model: " + modelName + ", Battery mAh: " + batterymAh +
                "\nProducer Price: " + producerPrice.toString() + "\nRetail Price: " + retailPrice.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone)) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh &&
                Objects.equals(brandName, that.brandName) &&
                Objects.equals(modelName, that.modelName) &&
                Objects.equals(producerPrice, that.producerPrice) &&
                Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }
}
