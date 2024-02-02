package seminars.third.hw;

public class Calculate {
    public static boolean evenOddNumber(int number) {
        return number % 2 == 0;
    }

    public static boolean numberInInterval(int number, int min, int max) {
        return min <= number && number <= max;
    }
}
