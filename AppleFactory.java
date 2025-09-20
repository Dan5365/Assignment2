public class AppleFactory implements DeviceAbstractFactory{
    @Override
    public Device createPhone() {
        return new Phone("Apple", "iPhone 15", 1200);
    }
    @Override
    public Device createLaptop() {
        return new Laptop("Apple", "MacBook Pro", 2200);
    }

}
