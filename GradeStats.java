//Create Scanner
import java.util.Scanner

public class GradeStats{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

//Initialize array        
        float[] grades = new float[10];
//For loop to add grades to array       
        for (int i = 0; i < 10; i++){
            while (true){
                System.out.print("Enter grade " + (i+1) + ": ");
                if (scanner.hasNextFloat()){
                    grades[i] = scanner.nextFloat();
                    break;    
                } else {
                    System.out.println ("Invalid input. Please enter with a Valid Decimal value.");
//consume the invalid input
                    scanner.next();
                }

            }

        }
//For grade in grades, find sum of grades
        float sum = 0;
        for (float grade : grades) {
            sum += grade;
        }
//Calc Average
        float average = sum / 10;

//Initilize Max and Min
        float max = grades[0];
        float min = grades[0];
        for (int i = 1; i < 10; i++){
            if (grades[i] > max) max = grades[i];
            if (grades[i] < min) min = grades[i];
        }
        
//Output Results
        System.out.printf("Average: %.2f/n", average);
        System.out.printf("Maximum: %.2f/n", max);
        System.out.printf("Minimum: %.2f/n", min);

        scanner.close();     
    }
}