public class SmartPoo {
    public static void main(String[] args) {

        SmartDevice device = new SmartDevice("Bonito", 2020,5);
        System.out.println(device);

        System.out.println("-------------------------");

        SmartDevice phone = new SmartPhone("Roberto","LaMejor", "Linux",200000.0);
        System.out.println(phone);

        System.out.println("-------------------------");

        SmartDevice watch = new SmartWatch("Linux","Fabiola",20,150000.0);
        System.out.println(watch);

        
    }
}