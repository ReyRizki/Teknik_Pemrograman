import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Gson gson = new Gson();
        LinkedList<Product> products = gson.fromJson(new FileReader("../barang.json"), new TypeToken<LinkedList<Product>>(){}.getType());
        
        ListIterator<Product> it = products.listIterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}