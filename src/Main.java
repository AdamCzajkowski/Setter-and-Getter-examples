
import java.util.Scanner;

public class Main {
    //scan String
    static String scannerString() {
        Scanner scanner = new Scanner(System.in);
        return(scanner.nextLine());
    }
    //scan int
    static int scannerInt()  {
        Scanner scanner = new Scanner(System.in);
        return(scanner.nextInt());
    }
    //scan double
    static double scannerDouble() {
        Scanner scanner = new Scanner(System.in);
        return(scanner.nextDouble());
    }

    static void showPerson() {
        Person person = new Person();
        System.out.println("What's your name? ");
        person.setName(scannerString());
        System.out.println("How old are you? ");
        person.setAge(scannerInt());
        System.out.println("What's your weight? ");
        person.setWeight(scannerDouble());
        System.out.println("Your name is " + person.getName() + ", yours weight is " + person.getWeight() + "kg and you have " + person.getAge() + "yo. ");
    }
    public static void main(String[] args) {
        showPerson();
    }
}
