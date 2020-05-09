package class5pkg;

public class sessionFive {
    public static void main(String[] args) {
    //-------------------hw1-------------------------------------
        /**
         * Write code to create abbreviation for any given string
         * Example: String msg = "Outfit of the day" //
         * Expected: OOTD //GM HAGDTY
         * String msg = "have a great day to you"
         *
         * //code
         *
         * sout("Abbreviation : " + abr);
         */
       /* String msg = "have a great day to you";
        String abr = "";
        char output;
//code
        String [] word =msg.split(" ");
        for (String value : word){
            output = value.toUpperCase().charAt(0);
            abr = abr + output;

        }
        System.out.println("Abbreviation: " + abr); */

        //----------------hw2------------------

        String line = "once upOn a tiMe in the UNIVERSE"; //Once Upon A Time In The Universe
        String [] slice = line.split(" ");
        System.out.println("Line (Before modification) : " + line);
//code
     /*   line = "";
        for (String group : slice){

            //convert word to lower case and get the substring at index 1
            String partTwo = group.toLowerCase().substring(1);

            //convert the first character of word to upper case
            char partThree = group.toUpperCase().charAt(0);

            line = line + partThree + partTwo + " ";

        }

        System.out.println("Line (After modification) : " + line);
        */

//----------------------------------hw3---------------------------------------------
        /**
         * reverse a string
         */
       /* String message = "happy holidays"; //syadiloh yppah
        String reverseMessage = "";
        System.out.println("Message : " + message);
// code
       // String [] msgstring = message.split(" ");
        int msglength = message.length();

        for (int i = 0 ; i < msglength; i++){
            reverseMessage = reverseMessage + message.charAt(msglength-1-i);
        }
        System.out.println("Message in reverse: " + reverseMessage); */

//----------------------------hw4-----------------------------------------------
/**
 * Check if word is palindrome
 */
        String word = "lever";  //ecar
        boolean result=false;
//code
        int plength = word.length();
        String pMessage = "";
        //reverse the string
        for (int i = 0 ; i < plength; i++){
            pMessage = pMessage + word.charAt(plength-1-i);
        }
        //compare strings
        if (word.compareTo(pMessage) == 0){
            result = true;
        }

        System.out.println("is " + word + " a palindrome: " + result);


//-----------------------end of homework------------------------------

        System.out.println("ok then");

        System.out.println("Good bye!");
    }
}
