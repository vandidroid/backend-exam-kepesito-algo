package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String input) {
        int result = 0;

        if (input == null || input.length() == 0) return -1;

        for (int i=0; i<input.length(); i++) {
            try {
                result += Integer.parseInt(String.valueOf(input.charAt(i)));
            } catch (NumberFormatException e) {

            }
        }

        return result;
    }
}
