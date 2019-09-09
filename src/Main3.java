public class Main3 {
    public static void main(String[] args) {


        int i = 0;

        while ((i < 10)) {
            if(i == 8) {
                i++;
                continue;
            }
            System.out.println("P1");
            System.out.println("Moje i to: " + i);
            i++;
        }

        /*i = 20;

        do {
            System.out.println("P2");
            System.out.println("Moje i to: " + i);
            i++;
        } while ((i < 10));*/

        System.out.println("Po petli !!");
    }
}
