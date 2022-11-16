public class Task6 {
    public static void main(String[] args) {
        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        double weightGr = bananas*80 + milk*1.05 + iceCream*100 + eggs*70;
        double weightKg = weightGr/1000;
        System.out.println("Общий вес в кг = " + weightKg);
    }
}
