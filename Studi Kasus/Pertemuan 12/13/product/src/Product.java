import com.google.gson.annotations.SerializedName;

public class Product
{
    @SerializedName("status")
    public Status status;
    @SerializedName("servicePackage")
    public ServicePackage servicePackage;
    @SerializedName("city")
    public City city;
    @SerializedName("weight")
    public float weight;
    @SerializedName("quantity")
    public int quantity;
    @SerializedName("priceItem")
    public double priceItem; 
    @SerializedName("productName")
    public String productName;

    public String toString()
    {
        return productName + " | " + quantity + " | " + weight + " | " + city.destination + " | " + servicePackage.toString() + " | " + servicePackage.service + " | " + servicePackage.value + " | " + (quantity * priceItem + servicePackage.value);
    }
    
}

/**
 * Status
 */
class Status
{
    @SerializedName("code")
    int code;
    @SerializedName("description")
    String description;
}

/**
 * ServicePackSge
 */
class ServicePackage
{
    @SerializedName("service")
    String service;
    @SerializedName("value")
    int value;

    public String toString()
    {
        return "{" + service + ", " + value +"}";
    }
}

/**
 * City
 */
class City
{
    @SerializedName("origin")
    String origin;
    @SerializedName("destination")
    String destination;
}