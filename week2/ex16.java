// Write a program which asks the user to enter a month (1 to 12) and a year, and displays the number of days
// in that month. Use a switch with stacked cases, and a leap-year condition for February: divisible by 4 but
// not by 100, unless also divisible by 400:
// | Input  | Output        |
// |--------|---------------|
// | 2/2024 | 29            |
// | 2/2023 | 28            |
// | 2/1900 | 28            |
// | 2/2000 | 29            |
// | 4/2025 | 30            |
// | 13/2025| Invalid month |

void main() {
    var month = Integer.parseInt(IO.readln("Enter a month (1-12): "));
    var year = Integer.parseInt(IO.readln("Enter a year: "));

    var days = switch (month) {
        case 1, 3, 5, 7, 8, 10, 12 -> 31;
        case 4, 6, 9, 11 -> 30;
        case 2 -> (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 29 : 28;
        default -> 0;
    };

    IO.println(days == 0 ? "Invalid month." : days);
}
