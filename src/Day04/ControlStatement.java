package Day04;

public class ControlStatement {

    public static void main(String[] args ){

//        //if condition - if specified condition is true
//        if (500>50)
//        {
//            System.out.println("500 is greater");
//        }

        //if else - if first condition is true , otherwise another block

//         int number = 10;
//        if (number % 2 == 0)
//            // %2 mean remainder when number divided by 2 , remainder 0
//        {
//            System.out.println("Even number");
//            //if condition true
//            }
//        else
//        {
//            System.out.println("Odd number");
//            //skipped this line because if statement is true , this will not execute
//        }

        //nested if-else - tests multiple conditions in sequence
        int x = 10; int y = 20; int z = 30;
        if (x>y && x>z)//condition compulsory
        {
            System.out.println("X is greater");
        }
       else if (y>x && y>z);// condition compulsory
        {
            System.out.println("Y is greater");
        }
//           else  //for else no need condition
//           {
//               //System.out.println("Z is greater");
//            }

        //switch case -selects one of many code blocks to execute
        //switch (variable)
        int weekday = 4;
        switch (weekday)
        {
            case 1: System.out.println("Sunday");
            case 2: System.out.println("Monday");
            case 3: System.out.println("Tuesday");
            case 4: System.out.println("Wednesday");break;//only this will be executed
            case 5: System.out.println("Thursday");
            case 6: System.out.println("Friday");
            case 7: System.out.println("Saturday");
        }
        }

    }


