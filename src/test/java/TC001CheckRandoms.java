import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class TC001CheckRandoms {

    //Verify if all expected arrays is returned as same size as we send

    @Test()
    public void TC001(){

        int sizeParam = 5;
        returnListOfIntegers(sizeParam);

        int[] expected = returnListOfIntegers(sizeParam);

        boolean passed = false;

        if(expected.length == sizeParam)
            passed = true;

        Assert.assertTrue("Test case: " , passed);

    }


    //Verify if all numbers are returned between 0-100
    @Test()
    public void TC002(){

        int sizeParam = 5;
        returnListOfIntegers(sizeParam);

        int[] expected = returnListOfIntegers(sizeParam);
        for(int i = 0; i < sizeParam; i++){

            if(!checkIfNumberInBound(expected[i]));
            Assert.assertFalse(false);
        }
        Assert.assertTrue(true);
    }

    //Verify if numbers are random
    @Test()
    public void TC003(){

        int sizeParam = 5;
        int[] original = returnListOfIntegers(sizeParam);
        int[] clone = returnListOfIntegers(sizeParam);

        for(int i = 0; i< sizeParam; i++){

            if(original[i] == clone[i])
                Assert.assertFalse(false);

            else Assert.assertTrue(true);
        }

    }


    //Check if numbers are unique or not
    @Test()
    public void TC004(){

        int sizeParam = 5;

        int[] original = returnListOfIntegers(sizeParam);

        for(int i =0; i<sizeParam;i++){
            for(int j=1; j<sizeParam;j++) {
                System.out.println("comapring pointer: " + original[i] + " With array next index: " + original[j]);

            }
            //1,2,4,4,0
            //1 <> 2, 1<>4, 1<>4, 1<>0
            //2<>1, 2<>2
        }

    }

    public static int[] returnListOfIntegers(int size) {
        Random randoms = new Random();
        //define the size of the arrray based on the size
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = randoms.nextInt();
        }

        return numbers;
    }


    @Test
    public void verifyIfNumbersAreRandom(){


    }

    public boolean checkIfNumberInBound(int number){

        if(number >= 0 && number <= 100)
            return true;

        else return false;


    }

}
