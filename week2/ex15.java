// A drink costs £4.00. Customers under 16 get 50% off; otherwise, customers with a student ID get
// 20% off (only the single best percentage discount applies). On Wednesday (day 3) everyone gets a
// further £0.50 off.
//
// Write a program which asks for the age, student ID (y/n) and day (1-7), then displays the price of the drink:
// | Age | Student ID | Day | Expected |
// |-----|------------|-----|----------|
// | 14  | n          | 1   | £2.00    |
// | 20  | y          | 3   | £2.70    |
// | 40  | n          | 6   | £4.00    |
// | 15  | y          | 3   | £1.50    |
// | 30  | y          | 5   | £3.20    |

void main() {
    var age = Integer.parseInt(IO.readln("What is your age? "));
    var hasID = IO.readln("Do you have your Student ID? (y/n) ").equals("y");
    var day = Integer.parseInt(IO.readln("What is the day of the week? (1-7) "));

    var cost = 4.0;

    if (age < 16) {
        cost *= 0.5;
    } else if (hasID) {
        cost *= 0.8;
    }

    if (day == 3) {
        cost -= 0.5;
    }

    IO.println("£%.2f".formatted(cost));
}
