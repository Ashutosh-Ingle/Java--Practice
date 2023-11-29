
public interface ProductLookupTable
{
    Product lookupById(int id);

    void addProduct(Product productToadd);

    void clear();
}

public class MapTable implements ProductLookupTable
{
    private final Map<Integer, Product> idProduct = new HashMap<>();

    @Override
    public void addProduct(final Product productToadd)
    {
        var id = productToadd.getId();
        if(idProduct.containsKey(id))
        {
            throw new IllegalArgumentException("Duplicate Id "+ productToadd)

        }
        idProduct.put(id, productToadd);
    }

    @Override
    public Product lookupById(final int id);
    {
       return idProduct.get(id);
    }

    @Override
    public void clear()
    {
        idProduct.clear();
    }
}

public class Product
{
    private final int id;

    private final String name;

    private final int weight;

    public Product(final int id, final String name, final int weight)
    {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }
}