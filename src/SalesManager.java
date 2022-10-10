public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = max();
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long averageSale() {
        long sum = 0;
        for (long sale : sales) {
            if (sale != min() && sale != min()) {
                sum += sale;
            }
        }
            sum = (sum - max() - min()) / (sales.length - 2);
            return sum;
        }
    }
