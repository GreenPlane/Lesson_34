import java.util.Scanner;

public class Lesson_34_Activity_One {
    public static int sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static void main (String[] args){
        int array[] = {1,2,3};
        sum(array);
    }
}
