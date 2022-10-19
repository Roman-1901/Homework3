public class Task8 {
    public static void main(String[] args) {
        double Masha = 67760;
        double Den = 83690;
        double Kris = 76230;
        double percent = 0.1;
        double newMasha = Masha*percent + Masha;
        double newDen = Den*percent + Den;
        double newKris = Kris*percent + Kris;
        System.out.println("Маша теперь получает "+newMasha+" рублей. Годовой доход вырос на "+(newMasha*12-Masha*12)+" рублей");
        System.out.println("Денис теперь получает "+newDen+" рублей. Годовой доход вырос на "+(newDen*12-Den*12)+" рублей");
        System.out.println("Кристина теперь получает "+newKris+" рублей. Годовой доход вырос на "+(newKris*12-Kris*12)+" рублей");
    }
}
