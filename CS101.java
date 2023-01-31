import java.util.Scanner;
public class CS101 {
    //Methods 1
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
    }

    //Methods 2
    public static void maximumNumber(int first, int second, int third) {
        int max = getMax(2, 5, 3);
        System.out.println(max);
    }

    public static void minimumNumber(int first, int second, int third) {
        int min = getMax(2, 5, 3);
        System.out.println(min);
    }

    public static void evenOrNot(int first){
        boolean evenNumber = (num % 2 == 0);
        int personsNum = sc.nextInt();
        if ()
    }
}


