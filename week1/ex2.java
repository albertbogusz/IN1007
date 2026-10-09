// Write a program that asks for the current year and your birth's year and displays your age
// (assuming that your birthday has already happened this year).

void main() {
    var currentYear = Integer.parseInt(IO.readln("What is the current year? "));
    var birthYear = Integer.parseInt(IO.readln("What is your birth year? "));

    IO.println("Your age is: %d".formatted(currentYear - birthYear));
}
