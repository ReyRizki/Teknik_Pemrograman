import com.google.gson.annotations.SerializedName;

public class Product
{
    @SerializedName("status")
    private Status status;
    @SerializedName("servicePackage")
    private ServicePackage servicePackage;
    @SerializedName("city")
    private City city;
    @SerializedName("weight")
    private float weight;
    @SerializedName("quantity")
    private int quantity;
    @SerializedName("priceItem")
    private double priceItem; 
    @SerializedName("productName")
    private String productName;

    public String toString()
    {
        return this.productName + " | " + this.quantity + " | " + this.weight + " | " + this.city.getDestination() + " | " + this.servicePackage + " | " + this.servicePackage.getService() + " | " + this.servicePackage.getValue() + " | " + (this.quantity * this.priceItem);
    }
}