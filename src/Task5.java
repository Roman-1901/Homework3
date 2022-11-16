public class Task5 {
    public static void main(String[] args) {
        byte white = 2;
        byte brown = 4;
        byte all = 120;
        int classes = all / (white + brown);
        int allWhite = white * classes;
        int allBrown = brown * classes;
        System.out.println("В школе, где "+ classes +" классов, нужно " + allWhite +" банок белой краски и " + allBrown +" банок коричневой краски");
    }
}
