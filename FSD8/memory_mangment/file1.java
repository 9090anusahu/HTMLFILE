public class file1 {

    public static void main(String[] args) {
        int k = 90;
        int h = 95;
        if (k <h || k>h) {
           
            if (h <k || k<h) {
                System.out.println("frst line");
                System.out.println("second line");
                System.out.println("third line");

                System.out.println("second if executed");
            }
            System.out.println("out of inner if");

        }
        System.out.println("outside of outer if");
    }

}