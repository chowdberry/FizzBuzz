public class Multiples {

    public static int main (int total, int a, int b) {
        int counter = 0 ;
        int initial = 1;

        while (initial < total) {
            if (initial % a == 0 || initial % b == 0){
                counter ++;
                initial ++;
            }
            else {
                initial += 1;
            }
        }
        return counter;
    }

    public static int main (){
        int a = 3;
        int b = 5;
        int total = 1000;
        int initial = 1;
        int counter = 0;

        while (initial < total){
            if (initial % a == 0 || initial % b == 0){
                counter ++;
                initial ++;
            }
            else{
                initial ++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int intResult = main();
        System.out.println(intResult);
    }
}
