public class Task4 {
    public static void main(String[] args) {
        byte limit = 16;
        byte limitTimeMinute = 2;
        int limitOneMinute = limit/limitTimeMinute; //высчитываем, сколько будет производится штук в одну минуту, исходя из вводных данных
        int limitDay = limitOneMinute * 60*24; //высчитваем в сутки
        int limitMonth = limitDay * 30; //высчитываем в месяц из рассчета 30 дней
        System.out.println("За 20 минут машина произвела бутылок " + limitOneMinute * 20 +" штук");
        System.out.println("В сутки машина произвела бутылок " + limitDay +" штук");
        System.out.println("За три дня машина произвела бутылок " + limitDay * 3 +" штук");
        System.out.println("За месяц машина произвела бутылок " + limitMonth +" штук");
    }
}
