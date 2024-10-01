import java.util.Arrays;

public class IBANValidation {
    public static void main(String[] args) {

        String iban = "611904300234573201";

        int[] arr = buildArray(iban);
        System.out.println("arr = " + arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

    public static int[] buildArray(String iban){
        System.out.println("iban.length() = " + iban.length());
        int[] result = new int[iban.length()];

        for (int i = 0; i < result.length;i++) {
            System.out.println("iban.charAt(i) = " + iban.charAt(i));
            result[i] = iban.charAt(i) - 48;
        }

        return result;
    }
}
