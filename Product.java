public class Product {
    private String name;
    private int price;
    private int code;
    private int quantity;

    Product(String x, int y, int z, int t)
    {
        this.name = x;
        this.price = y;
        this.code = z;
        this.quantity = t;
    }

    Product(String x, int y, int z)
    {
        this.name = x;
        this.price = y;
        this.code = z;
        this.quantity = 0;
    }

    public static void changeprice(Product p, int x)
    {
        p.price = x;
    }
    public static void changequantity(Product p, int y)
    {
        p.quantity = y;
    }
}
