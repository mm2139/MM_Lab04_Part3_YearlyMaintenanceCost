import java.util.Scanner;

public class YearlyMaintenanceCost {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. Please input your home maintenence costs during the summer, fall, winter, and spring.");

        double summerMaintCost = scan.nextDouble();
        double fallMaintCost = scan.nextDouble();
        double winterMaintCost = scan.nextDouble();
        double springMaintCost = scan.nextDouble();

        double totalYearlyMaintCost = summerMaintCost + fallMaintCost + winterMaintCost + springMaintCost;

        System.out.println("According to your seasonal maintenence costs, your total yearly maintenance cost is " + totalYearlyMaintCost + " dollars.");

    }
}