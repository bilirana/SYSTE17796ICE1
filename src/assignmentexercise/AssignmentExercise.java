/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentExercise;

/**
 *
 * @author aljen
 */
public class AssignmentExercise {

    public static double calcAvg(double [] temps){
        double sum = 0;
        int overall = 14;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] >= 50 | temps[i] < -50)
            {
                overall = overall - 1;
            }
            else{
                sum += temps[i];
            }
        }
        double average = sum / overall;
        return average;
    }
    public static void main(String[] args) {
        double [] temps = {-4,-9,-7,-11,-8,-12,-3,-11,1,-4,1,-5,-1,-6};
        System.out.printf("Average: %.2f%n",calcAvg(temps));
    } //this is my edit
    
}
