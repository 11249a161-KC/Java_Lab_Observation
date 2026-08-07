public class highandlow
{
    public static void main (String[] args)
    {
        double[] sales = {12900,9600,5000,13500,3650,7550,9000,11250};
        double minSales = sales[0];
        double maxSales = sales[0];
        int minMonth = 1;
        int maxMonth = 1;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxMonth = i + 1;
            }
            if (sales[i] < minSales) {
                minSales = sales[i];
                minMonth = i + 1;
            }
        }
        System.out.println("Highest Sales: Rs" + maxSales + "(Month: " +  maxMonth + ")");
        System.out.println("Lowest Sales: Rs" + minSales + "(Month: " +  minMonth + ")");
    }
}