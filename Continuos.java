import java.util.*;
import java.util.Scanner;
public class Sample123
{
public static void main(String args[])

{
char a;
Scanner myObj = new Scanner(System.in);
do
{
 
        System.out.println("Continue(Y/N)");
         a = myObj.next().charAt(0);

} while(a =='Y'|| a =='y');
}
}