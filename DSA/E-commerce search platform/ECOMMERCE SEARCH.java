public class EcommerceSearch {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Chair", "Furniture"),
                new Product(104, "Table", "Furniture"),
                new Product(105, "Shoes", "Fashion")
        };

        int searchId = 104;

        Product result1 = LinearSearch.search(products, searchId);

        System.out.println("Linear Search:");
        if(result1 != null)
            result1.display();
        else
            System.out.println("Product not found");

        Product result2 = BinarySearch.search(products, searchId);

        System.out.println("\nBinary Search:");
        if(result2 != null)
            result2.display();
        else
            System.out.println("Product not found");
    }
}
