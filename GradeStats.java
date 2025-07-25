//Create Scanner
import java.util.Scanner;

public class GradeStats{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

//Initialize array 
        final int NUM_GRADES = 10;
        float[] grades = new float [NUM_GRADES];
//Loop to read grades into array       
        for (int i = 0; i < NUM_GRADES; i++){
            while (true){
                System.out.print("Enter grade " + (i+1) + ": ");
                if (scanner.hasNextFloat()){
                    grades[i] = scanner.nextFloat();
                    break;    
                } else {
                    System.out.println ("Invalid input. Please enter with a Valid Decimal value.");
//Consume the invalid input
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
        float average = sum / NUM_GRADES;

//Initialize Max and Min
        float max = grades[0];
        float min = grades[0];
        for (int i = 1; i < NUM_GRADES; i++){
            if (grades[i] > max) max = grades[i];
            if (grades[i] < min) min = grades[i];
        }
        
//Output Results
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Maximum: %.2f\n", max);
        System.out.printf("Minimum: %.2f\n", min);

        scanner.close();     
    }
}
