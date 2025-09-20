public class DeviceFactory {
    public static Device createDevice(String type, String brand, String model,
                                      int price) {
        if(type.equals("Phone") ) {
            return new Phone(brand, model, price);
        }else if (type.equals("Laptop") ) {
            return new Laptop(brand, model, price);
        }
        throw new IllegalArgumentException("Unknown device type: " + type);
    }
}
