// Write a program which asks the user to enter a month of the year and displays the corresponding number
// case-insensitively, e.g. January = 1, February = 2, etc., and "Unknown month" for anything else.

void main() {
    var n = switch (IO.readln("Enter a month: ").toUpperCase()) {
        case "JANUARY" -> 1;
        case "FEBRUARY" -> 2;
        case "MARCH" -> 3;
        case "APRIL" -> 4;
        case "MAY" -> 5;
        case "JUNE" -> 6;
        case "JULY" -> 7;
        case "AUGUST" -> 8;
        case "SEPTEMBER" -> 9;
        case "OCTOBER" -> 10;
        case "NOVEMBER" -> 11;
        case "DECEMBER" -> 12;
        default -> 0;
    };
    IO.println(n == 0 ? "Unknown month" : n );
}
