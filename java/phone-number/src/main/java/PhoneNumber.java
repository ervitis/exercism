/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

import java.util.regex.Pattern;

class PhoneNumber {
    private String phoneNumber;
    public PhoneNumber(String number) {
        this.phoneNumber = number.replaceAll("(\\+\\d|[()\\-\\s.])", "");;

        this.validateNumber();
    }
    
    private void validateNumber() {
        if (Pattern.compile("[a-zA-Z]").matcher(this.phoneNumber).find())
            throw new IllegalArgumentException("letters not permitted");
        if (Pattern.compile("[\\D]").matcher(this.phoneNumber).find())
            throw new IllegalArgumentException("punctuations not permitted");
        if (this.phoneNumber.length() < 10)
            throw new IllegalArgumentException("incorrect number of digits");
        if (this.phoneNumber.length() > 11)
            throw new IllegalArgumentException("more than 11 digits");
        if (this.phoneNumber.length() > 10 && this.phoneNumber.charAt(0) != '1')
            throw new IllegalArgumentException("11 digits must start with 1");
        if (this.phoneNumber.charAt(this.phoneNumber.length() == 10 ? 0 : 1) == '0')
            throw new IllegalArgumentException("area code cannot start with zero");
        if (this.phoneNumber.charAt(this.phoneNumber.length() == 10 ? 0 : 1) == '1')
            throw new IllegalArgumentException("area code cannot start with one");
        if (this.phoneNumber.charAt(this.phoneNumber.length() == 10 ? 3 : 4) == '0')
            throw new IllegalArgumentException("exchange code cannot start with zero");
        if (this.phoneNumber.charAt(this.phoneNumber.length() == 10 ? 3 : 4) == '1')
            throw new IllegalArgumentException("exchange code cannot start with one");
    }

    public String getNumber() {
        return this.phoneNumber.length() > 10 ? this.phoneNumber.substring(1) : this.phoneNumber;
    }
}