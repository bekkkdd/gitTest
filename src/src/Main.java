public class Main {
    public static void main(String[] args) {
        User user = new User(18, "Bekdaulet");
        for (int i = 0; i < 10; i++) {
            System.out.println("Privet, "  + user.getName());
        }
    }
}
