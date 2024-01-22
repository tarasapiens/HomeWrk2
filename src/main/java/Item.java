public class Item {

    String name;
    String vendorCode;
    String color;
    String material;
    String countryOfOrigin;
    String price;
    int remainder;

    public Item(String name, String vendorCode, String color, String material, String countryOfOrigin, String price, int remainder) {
        this.name = name;
        this.vendorCode = vendorCode;
        this.color = color;
        this.material = material;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.remainder = remainder;
    }

    public Item(String name, String vendorCode, String color, String material, String countryOfOrigin, int remainder) {
        this.name = name;
        this.vendorCode = vendorCode;
        this.color = color;
        this.material = material;
        this.countryOfOrigin = countryOfOrigin;
        this.remainder = remainder;
    }


}
