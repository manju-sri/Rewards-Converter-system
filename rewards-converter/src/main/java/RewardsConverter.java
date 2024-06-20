import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");


        // Read miles value input
        System.out.println("\nPlease enter miles value to convert to cash: ");
        String input_miles = scanner.nextLine();
        double milesValue;
        try {
            milesValue = Double.parseDouble(input_miles);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }

        // Convert miles value to cash
        System.out.println("Converting " + input_miles + " miles to $");
        var rewardsValue2 = new RewardValue(milesValue, true);
        System.out.println(input_miles + " miles is worth $" + rewardsValue2.getCashValue());
    }
    }
