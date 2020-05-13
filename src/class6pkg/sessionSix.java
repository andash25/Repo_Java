package class6pkg;

public class sessionSix {

    //-------------------int array sum--------------------------

   /* public static void main(String[] args) {
    int [] intarray = {1,2,3,4,5};

    System.out.println(sum(intarray));
    }
    public static int sum(int [] numA){
        int count = 0;
        for(int runS : numA){
            count = count + runS;

        }
        return count;
    } */

    //-----------------reverse string------------------
    /*public static void main(String[] args) {
   String word = "Have a nice day";
    String Final = reverse(word);
    System.out.println(Final);
    }
    public static String reverse(String message){
        String [] msgstring = message.split(" ");
        int msglength = message.length();
        String reverseMessage = "";
        for (int i = 0 ; i < msglength; i++){
            reverseMessage = reverseMessage + message.charAt(msglength-1-i);
        }
        return reverseMessage;
    } */

    //--------------------hw1-------------------

    /**
     * String[] names = {"john" , "michael" , "dora" , "philip" , "ilena" , "palena" , "fahry"}
     * String nameToSearch = "philip";
     * Create a method that will tell the position of name of the given array
     * If name present in the names-array, tel user the position (i.e. index+1) else say, name not present
     * <p>
     * philip is on position-4
     * happy is not present in the array
     */
   /* public static void main(String[] args) {
        String[] names = {"john", "michael", "dora", "philip", "ilena", "palena", "fahry"};
        //String nameArray = names.split(",");
        String nameToSearch = "dora";
        System.out.println(names[position(names, nameToSearch)-1] + " is on position - " + position(names, nameToSearch));

    }

    public static int position(String[] message, String comparestr) {
        int counter = 0;

        for (String newString : message) {

                if (newString.compareTo(comparestr) == 0) {
                    counter = counter + 1;
                    break;

                }
                else {
                    counter ++;
                }



        }
        return counter;

    } */

//---------------------------hw2------------------------------------------
/**
 * Create a method to find maximum value in the given int-array
 * int[] numbers = {45, 22, 11, 65, 189, 91, 100, 81};
 *
 * Maximum value in the given array: 189
 */
   /* public static void main(String[] args) {
        int[] numbers = {45, 22, 11, 65, 189, 91, 100, 81};

        System.out.println("Maximum value in the given array: " + maxvalue(numbers));
    }

    public static int maxvalue (int [] intA){
    int max = 0;
    for (int value : intA){
        if (value > max){
            max = value;
        }
    }
    return max;
    } */

    //-----------------------------hw3--------------------------------------------
    /**
     * Create a method to find average of an int-array
     * Average of the given array: 123
     */
    /*public static void main(String[] args) {
        int[] numbers = {45, 22, 11, 65, 189, 91, 100, 81};

        System.out.println("Average of the given array: " + average(numbers));
    }
    public static double average (int [] intA){
        int sum = 0;
        int counter = 0;
        for(int runS : intA){
            sum = sum + runS;
            counter ++;

        }
        return sum/counter;
    } */
    //------------------hw4-------------------------------
    /**
     * Create a method that will tell the name of student with maximum marks/score.
     * int[] scores = {90, 89, 191, 100, 81};
     * String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
     *
     * Jesse scored the maximum score(191)
     */
    public static void main(String[] args) {
        int[] scores = {90, 89, 191, 100, 81};
        String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        int nameindex = maxindex(scores);
        System.out.println(names[nameindex] + " scored the maximum score (" + maxvalue(scores)+ ")");
    }
    public static int maxvalue (int [] intA){
        int max = 0;
        for (int value : intA){
            if (value > max){
                max = value;
            }
        }
        return max;
    }
    public static int maxindex (int [] intA){
        int max = 0;
        int index = 0;
        for (int value : intA){
            if (value > max){
                max = value;
                index++;
            }
        }
        return index;
    }
}



