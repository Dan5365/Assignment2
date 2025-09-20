public class Phone implements Device{
    private String brand;
    private String model;
    private int price;

    public Phone(String brand, String model, int price) {
        this.brand =brand;
        this.model = model;
        this.price = price;
    }
    @Override
    public void assemble() {
        System.out.println("Laptop assembling: " + brand + " " + model);

    }

    @Override
    public String getDetails() {
        return "Laptop " + brand + " " + model + " " + price;
    }

}
