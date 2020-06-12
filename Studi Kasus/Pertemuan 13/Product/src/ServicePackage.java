import com.google.gson.annotations.SerializedName;

public class ServicePackage 
{
    @SerializedName("service")
    private String service;
    @SerializedName("value")
    private int value;

    public String getService()
    {
        return this.service;
    }

    public int getValue()
    {
        return this.value;
    }

    public String toString()
    {
        return "{ " + this.service + ", " + this.value +" }";
    }
}