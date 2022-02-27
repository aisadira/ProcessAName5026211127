import java.util.Scanner;
public class ProcessAName5026211127 {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.print("Type your name : ");
        String name1 = scan.nextLine();
        int index = name1.indexOf(" ");
        String first = name1.substring(0,1);
        String last = name1.substring(index+1);
        System.out.println(index);
        String name2 = (last+", " +first+ ".");
        System.out.println("Your name is : "+name2);

    }
}
