import com.google.gson.annotations.SerializedName;

public class City 
{
    @SerializedName("origin")
    private String origin;
    @SerializedName("destination")
    private String destination;

    public String getDestination()
    {
        return this.destination;
    }
}