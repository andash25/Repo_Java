package TestPkg;

public class HWTest {
    /**
     * Create variable to store student-score, and total-possible-score based on the percentage,
     * display grade to student
     * Grade A: 91-100
     * Grade B: 81-90
     * Grade C: 71-80
     * Grade D: 61-70
     * Grade E: 51-60
     * Grade F: less than or equal to 50
     */
    int studentScore = 135;
    int maxScore = 150;
    float studentpercentage = ((100/maxScore) * studentScore);
    if(studentpercentage >= 91 && (studentpercentage <= 100)){
        system.out.println("Your percentage is: " + studentpercentage + "and your grade is A");
    } else if(studentpercentage >= 81 && studentpercentage <= 90){
        system.out.println("Your percentage is: " + studentpercentage + "and your grade is B");
    }else if(studentpercentage >= 71 && studentpercentage <= 80){
        system.out.println("Your percentage is: " + studentpercentage + "and your grade is C");
    }else if(studentpercentage >= 61 && studentpercentage <= 70){
        system.out.println("Your percentage is: " + studentpercentage + "and your grade is D");
    }else if(studentpercentage >= 51 && studentpercentage <= 60){
        system.out.println("Your percentage is: " + studentpercentage + "and your grade is E");
    }else if(studentpercentage <= 50){
        system.out.println("Your percentage is: " + studentpercentage + "and your grade is F);
    }

    }
}
//calculate percentage
//Your percentage: XX.yy and your grade is: A


/**
 * Checking car mode (P, D, N, R)
 * if car mode is P and "you can park car"
 * if car mode is D drive car
 *      if drive type is Snow, display "You are on Snow mode"
 *      if drive type is Sport, display "You are on Sport mode"
 *      if drive type is Eco, display "You are on Eco mode"
 * if car mode is N you can "put car in car wash"
 * if car mode is R you can "revere the car"
 */

char [] carmode = "PDNR";
string drivetype = "";
switch (carmode){
        case(carmode[0]):
            system.out.println("you can park car");
            break;
        case(carmode[1]):
            switch(drivetype){
                case("Snow"):
                system.out.println("You are on Snow moder");
                break;
                case("Eco"):
                system.out.println("You are on Eco mode");
                break;
                case("Sport"):
                system.out.println("You are on Sport mode");
                break;
            }

            break;
        case(carmode[2]):
        system.out.println("put car in car wash");
            break;
        case(carmode[3]):
        system.out.println("revere the car");
            break;

        }
/**
 * store value in an int variable
 * if number is divisible by 3, print "divisible by 3"
 * if number is divisible by 5, print "divisible by 5"
 * if number is divisible by 3 and 5, print "divisible by both"
 * if not divisible by 3 or 5, print the number
 *
}
