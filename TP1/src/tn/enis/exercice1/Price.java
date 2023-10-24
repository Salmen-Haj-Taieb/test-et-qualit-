package tn.enis.exercice1;

public class Price {
    public static final float TVA = 19;

    public float getTTCprice(float priceHT) {
        return  (priceHT/100)*(100+ TVA);
    }
}
