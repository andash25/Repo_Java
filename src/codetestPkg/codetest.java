package codetestPkg;
import java.util.Arrays;

public class codetest {
    public static void main(String[] args){

        //code block Q1---------

        //int [] intarray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        //int removeint = 24;
        //int [] outputarray = arrayremove(intarray,removeint);
       // System.out.println(Arrays.toString(outputarray));

        //code block Q2--------------------

       int [] missingA = {-1, -3, 4, 2};
        int missingvalue = missingPosInt(missingA);
       System.out.println(missingvalue);

        //code block Q3------------------

        //Points(78);
        //Points(88);
        //Points(178);
        //Points(70);
    }


    //---------------code Q1---------------------------
    /**
     * Question 1:
     * Create a method to return an array after remove a specific value from a given int array.
     * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     *
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     *
     */
    /*
    public static int [] arrayremove(int [] intA, int value){
        int count = 0;
        int[] outputA = new int[intA.length];
        for(int num : intA){
            if (num != value){
                outputA[count] = num;
                count++;
            }


        }

        return outputA;
    } */

        //----------------end of code Q1-------------------------
    //-----------------code Q2-----------------
    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0) from given array.
     * Example:
     * 	For array : {1, 3, 5, 4, 2, 7}

     * 	Method should return : 6
     *
     * 	For array : {-1, -3, 4, 2}
     * 	Method should return : 1
     *
     * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * 	Method should return : 4
     */

  public static int missingPosInt(int [] missingA){
        Arrays.sort(missingA);
      System.out.println(Arrays.toString(missingA));
        int MissingNum = 0;
        int count = 0;
        for(int num : missingA) {
            if (num >= 0 && num > MissingNum) {
                MissingNum = num;
            }
            count++;
        }
        return MissingNum;
    }

    //-----------------end of code Q2----------------
    //----------------code Q3----------------------
    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points charged against the license for over speeding.
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user gets 12 points for a speed then license is suspended
     *
     *  Example:
     *      user speed = 78 ; 1 points
     *      user speed = 88 ; 3 points
     *      user speed = 178 ; 21 points (License suspended).
     *      user speed = 70 ; Thank you for driving within the speed limit.
     *
     *      88 -> 3
     *      70
     *      70-75 : 1
     *      75-80 : 1
     *      80-85 : 1
     *      85-88
     *
     */
  /*  public static void Points(int speed){
        int speedlimit = 70;
        int range = (speed-speedlimit)/5;

        if (range < 12 && speed > speedlimit){
            System.out.println("user speed  = " + speed + ";" + range + " Points" );
        }
        if (range >= 12 && speed > speedlimit){
            System.out.println("user speed  = " + speed + ";" + range + " Points" + " License suspended" );
        }
        if (speed == speedlimit){
            System.out.println("user speed  = " + speed + "Thank you for driving within speed limit " );
        }
    } */
    //----------------end of code Q3-----------------

    }
