import java.util.Scanner;

public class Lesson_34_Activity_Two {
    public static double average(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        double avg = (double)sum/(array.length);
        return avg;
    }
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        System.out.println(average(array));
    }
}
