import javax.xml.transform.Result;
import java.util.Scanner;

public class Reduce {
    public static int main (int start) {
        int counter = 0;

        while (start!=0) {
            if (start % 2 == 0) {
                start = start / 2;
                counter = counter + 1;
            }
            else {
                start = start -1;
                counter = counter + 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int result = main(100);
        System.out.println(result);
    }
}
