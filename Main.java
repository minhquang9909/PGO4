class Main {
    public static void main(String[] args) {
        Customer g1 = new Customer("ab");
        Customer g2 = new Customer("ba");
        Customer u1 = new Customer("Na", "La", "Em", "Pa");
        Customer u2 = new Customer(g1,"Nag1","Lag1","Pag1");

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(u1);
        System.out.println(u2);

        Product p1 = new Product("Car", 5000, 1234, 100);
        Product p2 = new Product("Bike", 500, 4321);
        Product p3 = new Product("Moto", 1500, 4520);

        Product.changeprice(p1, 4999);
        Product.changequantity(p2, 5);

    }
}
