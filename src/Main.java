public class Main {
    public static void main(String[] args) {
        long[] sales = {100, 250, 1000, 1500, 3700};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
