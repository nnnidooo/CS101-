import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CS101 {
    public static void main(String[] args) {
        //methods 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int personsAge = sc.nextInt();
        if (personsAge >= 18) {
            System.out.println("You are eligible to vote");
        } else if (personsAge < 18) {
            System.out.println("You are not eligible to vote");
        }
        //Methods 2
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        printMax(a, b, c);
        printMin(a, b, c);

        //Methods 3

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {//det sån i java vi finder ud af om et tal er lige.
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        //Methods 4

        String firstName = "Nadine";
        String lastName = " Hejazi";
        firstName = firstName.substring(0, firstName.length()-5);
        System.out.println(firstName + lastName);


        //Classes and objects
        Car toyota = new Car("aygo", 100.000);
        System.out.println(toyota);
        System.out.println(toyota.getModel());
        toyota.stop();
        toyota.start();
        toyota.move();
    }

    //Methods 2
    public static int getMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void printMax(int a, int b, int c) {
        System.out.println("The maximum number is: " + getMax(a, b, c));
    }

    public static void printMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("The minimum number is: " + min);
    }
}

//Notater om void og no void i methods.
//Metoden printMin er erklæret med void, fordi den ikke returnerer en værdi.
//Det udfører simpelthen en handling, som at vise minimum af tre tal til konsollen.
//Med andre ord har metodens formål at vise information til brugeren, snarere end at give en værdi.
//I modsætning er metoden getMax erklæret med int,da den returnerer en værdi til os.
//Formålet med denne metode er at beregne maksimum af tre tal og returnere resultatet,
//så det kan bruges til ydeligere kode, hvis det er nødvendigt.

