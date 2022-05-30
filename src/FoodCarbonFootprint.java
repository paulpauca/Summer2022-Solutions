/**
 Description: This program helps the user estimate the carbon footprint
 of the foods they eat in a daily basis. Carbon footprint refers to
 the amount of greenhouse gas emissions caused by an individual, a
 product, an event, or an organization. It is expressed in units of
 carbon dioxide equivalence (CO2e).
 <p>
 @author: WFU CSC 111
 */
import java.util.Scanner;

public class FoodCarbonFootprint {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Store the different calories entered by the user
        int beefCal, cheeseCal, yogurtCal, chickenCal, riceCal;
        int milkCal, eggsCal, tofuCal, beanCal, lentilCal, nutCal;

        // For the output
        int totalCal;
        double carbonFootprint;

        System.out.println("Food Carbon Footprint Calculator ===========================\n");
        System.out.println("Please enter the amount of calories you consumed for these food types:");
        System.out.print("Beef: ");
        beefCal = kb.nextInt();
        System.out.print("Chicken: ");
        chickenCal = kb.nextInt();
        System.out.print("Cheese: ");
        cheeseCal = kb.nextInt();
        System.out.print("Yogurt: ");
        yogurtCal = kb.nextInt();
        System.out.print("Milk: ");
        milkCal = kb.nextInt();
        System.out.print("Eggs: ");
        eggsCal = kb.nextInt();
        System.out.print("Rice: ");
        riceCal = kb.nextInt();
        System.out.print("Tofu: ");
        tofuCal = kb.nextInt();
        System.out.print("Beans: ");
        beanCal = kb.nextInt();
        System.out.print("Lentils: ");
        lentilCal = kb.nextInt();
        System.out.print("Nuts: ");
        nutCal = kb.nextInt();

        // Calculate the total number of calories
        totalCal = beefCal + chickenCal + cheeseCal +
                yogurtCal + milkCal + eggsCal + riceCal + tofuCal + beanCal +
                lentilCal + nutCal;

        // Calculate the carbon footprint
        carbonFootprint = beefCal * 0.01378 + chickenCal * 0.00337 +
                cheeseCal * 0.00447 + yogurtCal * 0.00349 +
                milkCal * 0.00317 + eggsCal * 0.00306 + riceCal * 0.00208 +
                tofuCal * 0.00138 + beanCal * 0.00140 +
                lentilCal * 0.00078 + nutCal * 0.00039;

        // Generate the output
        System.out.println("\nYour total number of calories per day would be: " + totalCal);
        System.out.printf("Your daily food carbon footprint would be %.3f kilograms of carbon dioxide equivalent\n", carbonFootprint);
        System.out.printf("Your annual food carbon footprint would be %.3f tons of carbon dioxide equivalent\n", carbonFootprint * 365 / 1000);
    }
}
