import java.util.*;

public class ViewsMap
{
    var idToProduct = new HashMap<Integer, Product>();
    idToProduct.put(1, Product.Fixtures.door);
    idToProduct.put(2, Product.Fixtures.floorPanel);
    idToProduct.put(3, Product.Fixtures.window);

    var ids = idToProduct.keySet();

    System.out.println(ids);
    
    System.out.println(idToProduct);
}