import java.util.Scanner;
public class TemperatureAnalysis {
public static void main(String[] args) {
// Create a Scanner object to read user input
Scanner scanner = new Scanner(System.in);
// Prompt the user to enter the number of days in the week
System.out.print("Enter the number of days in the week: ");
int numDays = scanner.nextInt();
// Create an array to store daily high temperatures
int[] temperatures = new int[numDays];
// Prompt the user to enter daily high temperatures for each day
for (int i = 0; i < numDays; i++) {
System.out.print("Enter the high temperature for day " + (i + 1) + " (in degrees Fahrenheit): ");
temperatures[i] = scanner.nextInt();
}
// Close the scanner
scanner.close();
// Initialize variables for calculations
int totalTemperature = 0;
int highestTemperature = Integer.MIN_VALUE;
int lowestTemperature = Integer.MAX_VALUE;
int above80Count = 0;
int below60Count = 0;
  // Loop through temperature data to calculate statistics
for (int i = 0; i < numDays; i++) {
int temperature = temperatures[i];
// Calculate total temperature
totalTemperature += temperature;
// Update highest and lowest temperatures
if (temperature > highestTemperature) {
highestTemperature = temperature;
}
if (temperature < lowestTemperature) {
lowestTemperature = temperature;
}
// Check if temperature is above 80 or below 60
if (temperature > 80) {
above80Count++;
}
if (temperature < 60) {
below60Count++;
}
}
// Calculate average temperature
double averageTemperature = (double) totalTemperature / numDays;
// Display temperature analysis
System.out.println("Temperature Analysis for the Week:");
System.out.println("Average Daily Temperature: " + averageTemperature + " degrees Fahrenheit");
System.out.println("Highest Daily Temperature: " + highestTemperature + " degrees Fahrenheit");
System.out.println("Lowest Daily Temperature: " + lowestTemperature + " degrees Fahrenheit");
System.out.println("Days with Temperatures Above 80 degrees Fahrenheit: " + above80Count);
System.out.println("Days with Temperatures Below 60 degrees Fahrenheit: " + below60Count);
}
}
