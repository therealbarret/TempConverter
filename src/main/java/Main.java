import java.util.Scanner;

public class Main
{
    public static void main (String [] args)
    {
        Scanner temp = new Scanner(System.in);
        Scanner number = new Scanner(System.in);

        //variables
        int option = 0;
        double value;
        double result;

        while (option != 4){
            System.out.println("Enter number associated with temperature type: \n" +
                    "1. Celsius \n" +
                    "2. Fahrenheit \n" +
                    "3. Kelvin \n" +
                    "4. Quit");
            option = temp.nextInt();

            switch (option){

                //Celsius is chosen first
                case 1:

                    //convert to other temp type
                    System.out.println("Enter number associated with temperature type you want converted to: \n" +
                            "1. Fahrenheit \n" +
                            "2. Kelvin");
                    option = temp.nextInt();

                    if (option == 1) { //Fahrenheit
                        //Temperature
                        System.out.println("What is the current temperature?");
                        value = number.nextDouble();

                        //calculation
                        result = value * 1.8 + 32;
                        System.out.println(value + " degrees Celsius equals " + result + " degrees Fahrenheit.");
                    }else if (option == 2){ //Kelvin
                        //Temperature
                        System.out.println("What is the current temperature?");
                        value = number.nextDouble();

                        //calculation
                        result = value + 273.15;
                        System.out.println(value + " degrees Celsius equals " + result + " degrees Kelvin.");
                    }
                    break;

                //Fahrenheit chosen first
                case 2:
                    //convert to other temp type
                    System.out.println("Enter number associated with temperature type you want converted to: \n" +
                            "1. Celsius \n" +
                            "2. Kelvin");
                    option = temp.nextInt();

                    if (option == 1) { //Celsius
                        //Temperature
                        System.out.println("What is the current temperature?");
                        value = number.nextDouble();

                        //calculation
                        result = (value - 32) * (5.0/9.0);
                        System.out.println(value + " degrees Fahrenheit equals " + result + " degrees Celsius.");
                    }else if (option == 2){ //Kelvin
                        //Temperature
                        System.out.println("What is the current temperature?");
                        value = number.nextDouble();

                        //calculation
                        result = ((value - 32) * (5.0/9.0)) + 273.15;
                        System.out.println(value + " degrees Fahrenheit equals " + result + " degrees Kelvin.");
                    }
                    break;

                //Kelvin is chosen first
                case 3:
                    //convert to other temp type
                    System.out.println("Enter number associated with temperature type you want converted to: \n" +
                            "1. Celsius \n" +
                            "2. Fahrenheit");
                    option = temp.nextInt();

                    if (option == 1) { //Celsius
                        //Temperature
                        System.out.println("What is the current temperature?");
                        value = number.nextDouble();

                        //calculation
                        result = value - 273.15;
                        System.out.println(value + " degrees Kelvin equals " + result + " degrees Celsius.");
                    }else if (option == 2){ //Fahrenheit
                        //Temperature
                        System.out.println("What is the current temperature?");
                        value = number.nextDouble();

                        //calculation
                        result = 1.8 * (value - 273) + 32;
                        System.out.println(value + " degrees Kelvin equals " + result + " degrees Fahrenheit.");
                    }
                    break;

                default:
                    System.out.println("Goodbye!");
            }

        }

    }
}
