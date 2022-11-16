public class Task7 {
    public static void main(String[] args) {
        int weight = 7000;
        int min = 250;
        int max = 500;
        int daysMax = weight/min; //максимальное число дней для похудения, если спортсмен будет скидывать по 250г
        int daysMin = weight/max; //минимальное число дней для похудения, если спортсмен будет скидывать по 500г
        int avgDays = (daysMax + daysMin)/2;
        System.out.println("При похудении на 250г в день понадобится "+daysMax+" дней. При похудении на 500г в день понадобится "+daysMin+" дней. Дней в среднем - "+avgDays);
    }
}
