import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class JsonToObj
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Reader read = new FileReader("barang.json");
        // Product prod = new Product();

        Gson gson = new Gson();
        Type collectionType = new TypeToken<ArrayList<Product>>(){}.getType();
        ArrayList<Product> products = gson.fromJson(read, collectionType);
        int i = 0;
        for(Product prod : products)
        {
            System.out.println(products.get(i) + "\n");
            i++;
        }
    }
}