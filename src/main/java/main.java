import java.util.ArrayList;
import java.util.Random;

        //Write a function to receive a number and return an array of random integres based on the number

public class main{
        public static void main(String[] args) {
                int size = 5;
                returnListOfIntegers(size);
                System.out.println("========");
                returnListOfIntegers(size);


        }

    public static void returnListOfIntegers(int size){
        Random randoms = new Random();
        //define the size of the arrray based on the size
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++){
        numbers[i] = randoms.nextInt(100);
        System.out.println("number is: "+ numbers[i]);
        }

    }
}
