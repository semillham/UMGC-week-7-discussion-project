import java.util.Scanner;
import java.util.Arrays;
//week 7 discussion for Sean Millham
//This program will call a method passing it an array
//method will modify the array
//this will be done using a loop, then display the result. 
class Week7_Discussion { 
    private static Scanner Week7Discussion;
//This is a tip calculator. 
    public static double formula(double Cost_of_Meal, double Tip_Percentage[]) {
        return (Cost_of_Meal * (Tip_Percentage[Tip_Percentage.length -1]) / 100);
    }
    public static double formula1(double Cost_of_Meal1, double Tip_Percentage1[]) {
        return (Cost_of_Meal1 * (Tip_Percentage1[Tip_Percentage1.length -2]) / 100);
    }
    public static double formula2(double Cost_of_Meal2, double Tip_Percentage2[]) {
        return (Cost_of_Meal2 * (Tip_Percentage2[Tip_Percentage2.length -3]) / 100);
    }
    public static double formula3(double Cost_of_Meal3, double Tip_Percentage3[]) {
        return (Cost_of_Meal3 * (Tip_Percentage3[Tip_Percentage3.length -4]) / 100);
    }
    public static double formula4(double Cost_of_Meal4, double Tip_Percentage4[]) {
        return (Cost_of_Meal4 * (Tip_Percentage4[Tip_Percentage4.length -5]) / 100);
    }
    
        public static void main(String[] args) {
        Scanner Week7DUser = new Scanner(System.in);
        System.out.println("This is a tip calculator. ");
        double[] Tip_Percentage = {15, 20, 25, 30, 35};
        double[] Tip_Percentage1 = {15, 20, 25, 30, 35};
        double[] Tip_Percentage2 = {15, 20, 25, 30, 35};
        double[] Tip_Percentage3 = {15, 20, 25, 30, 35};
        double[] Tip_Percentage4 = {15, 20, 25, 30, 35};
        System.out.println("Please submit the cost of the meal, rounded up to the next dollar: ");
        double Cost_of_Meal = Week7DUser.nextDouble();
        double Cost_of_Meal1 = Cost_of_Meal;
        double Cost_of_Meal2 = Cost_of_Meal;
        double Cost_of_Meal3 = Cost_of_Meal;
        double Cost_of_Meal4 = Cost_of_Meal;
        System.out.println("Your tip could be any of the following: " + "\n" + formula(Cost_of_Meal,Tip_Percentage) + "\n" + formula1(Cost_of_Meal1,Tip_Percentage1) + "\n" + formula2(Cost_of_Meal2,Tip_Percentage2) + "\n" + formula3(Cost_of_Meal3,Tip_Percentage3) + "\n" + formula4(Cost_of_Meal4,Tip_Percentage4));
    }
    
}
