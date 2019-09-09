public class Main {
    public static void main(String[] args) {
        int[][] mojaTablica = new int[10][10];


        for(int row = 0; row < mojaTablica.length; row++) {
            for(int col = 0; col < mojaTablica[row].length; col++) {
                 mojaTablica[row][col] = row * col;
            }
        }

        for(int row = 0; row < mojaTablica.length; row++) {
            for(int col = 0; col < mojaTablica[row].length; col++) {
                System.out.print(mojaTablica[row][col] + " ");
            }
            System.out.println("");
        }
    }
}
