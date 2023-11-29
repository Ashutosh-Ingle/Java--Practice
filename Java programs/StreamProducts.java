import java.util.*;

public class StreamProducts
{
    public static void main(String []args)
    {
        var door = new Product(1, "Wooden Door", 35);
        var floorPanel = new Product(2, "Floor Panel", 25);
        var window = new Product (3, " Glass Window", 10);

        var products = List.of(door,floorPanel,window,floorPanel,window);

        System.out.println(nameOfLightProductSort(products));
    }

    private static List<String> nameOfLightProductSort(List<Product> products)
    {
        List<Product> lightProducts = new ArrayList<>();

        for(Product product : products)
        {
            if(product.getWeight() < 30)
            {
                lightProducts.add(product);
            }
        }

        lightProducts.sort(comparingInt(Product :: getWeight));

        List<String> productNames = new ArrayList<>();

        for(Product product : lightProducts)
        {
            productNames.add(product.getName());
        }

        return Collections.unmodifiableList(productNames);
    }
}