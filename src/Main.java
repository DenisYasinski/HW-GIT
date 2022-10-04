public class Main {
    public static void main(String[] args) {
        int[] sales = {100, 250, 1000, 1500, 3700};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальная продажа = " + salesManager.max());
        System.out.println("Минимальная продажа = " + salesManager.min());
        System.out.println("Средняя продажа = " + salesManager.averageSale());
    }
}
