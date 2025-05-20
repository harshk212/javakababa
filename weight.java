import java.util.Scanner;
public class weight {
    public static void main(String[]args){
        //weight converter program

        Scanner scanner = new Scanner(System.in);
        System.out.println("----- welcome to or weight covertor program ! -----");
        double weight;
        double newweight;
        int choice;

        System.out.println("1:convert lbs to kgs");
        System.out.println("2:convert kgs to lbs");

        System.out.println("choose an option : ");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("enter the weight in lbs : ");
            weight = scanner.nextDouble();
            newweight = weight * 0.453592;
            System.out.println(" the new kgs weight is " + newweight);
        }
        else if( choice == 2){
            System.out.println("enter the weight in kgs : ");
            weight = scanner.nextDouble();
            newweight = weight * 2.20462;
            System.out.println(" the new lbs weight is " + newweight);

        }

        System.out.println("------ program is end ! -----");
        scanner.close();

    }
}
