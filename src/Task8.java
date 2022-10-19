public class Task8 {
    public static void main(String[] args) {
        int Mary = 67760;
        int Den = 83690;
        int Kris = 76230;
        int percent = 10;
        double newMary = Mary/100.0*percent + Mary;
        double yearMary = (newMary-Mary)*12;
        double newDen = Den/100.0*percent + Den;
        double yearDen = (newDen-Den)*12;
        double newKris = Kris/100.0*percent + Kris;
        double yearKris = (newKris-Kris)*12;
        System.out.println("Маша теперь получает "+(int)newMary+" рублей. Годовой доход вырос на "+(int)yearMary+" рублей");
        System.out.println("Денис теперь получает "+(int)newDen+" рублей. Годовой доход вырос на "+(int)yearDen+" рублей");
        System.out.println("Кристина теперь получает "+(int)newKris+" рублей. Годовой доход вырос на "+(int)yearKris+" рублей");
    }
}
