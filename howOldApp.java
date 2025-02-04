import java.util.Scanner;

public class Stuff {

    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {

        String s;
        int s2;
        int s3;


        System.out.print("How old are you?");

        s = userinput.nextLine();



        s2 = Integer.valueOf(s);
        s3 = s2+5;
        System.out.println("In 5 years you will be " + s3 + " years old.");



        System.out.println("It is " + (s2 < 20 && s2 > 12) +" that you are a teenager");

        System.out.println("I am such a smart computer.");

    }

}
