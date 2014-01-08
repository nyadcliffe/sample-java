package fizzbuzz;

public class Maker {
    private String FIZZ_BUZZ = "fizzbuzz";
    private String FIZZ = "fizz";
    private String BUZZ = "buzz";
    private String GO_TO_CABARET_CLUB = "ÉLÉÉÉoçsÇ´ÇΩÇ¢";
    public String execute(int number) {
        if (number % 15 == 0) {
            return FIZZ_BUZZ;
        } else if (number % 3 == 0) {
            return FIZZ;
        } else if (number % 5 == 0) {
            return BUZZ;
        } else if (number == 31) {
            return GO_TO_CABARET_CLUB;
        } else {
            return new Integer(number).toString();
        }
    }
}
