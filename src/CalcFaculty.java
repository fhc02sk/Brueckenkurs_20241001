public class CalcFaculty {

    /*
    !
    3! = 1 * 2 * 3 = 6
    5! = 1 * 2 * 3 * 4 * 5 = 120

     */
    public static void main(String[] args) {

        System.out.println("calcFaculty(8) = " + calcFaculty(8));
    }

    public static long calcFaculty(int value) {

        long erg = 1;

        for (int i = 1; i <= value; i++) {
            erg = erg * i;
        }
        return erg;
    }
}
