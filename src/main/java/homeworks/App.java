package homeworks;

/**
 * Hello world!
 *
 */
import homeworks.Hobby;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Hobby examp1 = new Hobby();
        examp1.setAreYouLike(true);

        Hobby object = new Hobby();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your age:");
        object.setAge(scan.nextInt());

        System.out.println("Enter your favourite letter:");
        object.setLetter(scan.next().charAt(0));

        System.out.println("Enter the number of your hobbies:");
        object.setNumberOfHobbies(scan.nextShort());

        System.out.println("Enter your favourite hobby:");
        object.setFavouriteHobby(scan.nextByte());

        System.out.println("Enter the number of hours i spend to name this field:");
        object.setNormNamesEnds(scan.nextLong());

        System.out.println("Enter the current value of Hrivnya:");
        object.setCurrentHrivnyaValue(scan.nextFloat());

        System.out.println("Enter the current value of Bitcoin:");
        object.setCurrentBitcoinValue(scan.nextDouble());

        System.out.println("Do you like my questions?");
        object.setAreYouLike(scan.nextBoolean());

        object.tellAboutHobby();
    }
}
