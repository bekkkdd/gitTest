public class Main {
    public static void main(String[] args) {
        User user = new User(18, "Bekdaulet");
        Car car = new Car(1, 10000 , "BMW x5");
        for (int i = 0; i < 10; i++) {
            System.out.println("Privet, "  + user.getName());
            System.out.println("Privet mir!" + car.getModel());
        }
    }
}
