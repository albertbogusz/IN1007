// Write a program which asks whether the customer is a student (y/n), the order total in pounds and the hour (0-23).
// Display "Meal deal applies" if the customer is a student spending at least £5, or the hour is 15 or 16.
// Otherwise, display "No meal deal":
// | Student | Total (£) | Hour | Expected          |
// |---------|-----------|------|-------------------|
// | y       | 4.50      | 15   | Meal deal applies |
// | n       | 8.00      | 12   | No meal deal      |
// | y       | 5.00      | 9    | Meal deal applies |
// | n       | 3.00      | 17   | No meal deal      |

void main() {
    var isStudent = IO.readln("Are you a student? (y/n) ").equals("y");
    var total = Double.parseDouble(IO.readln("What is your order total? (£) "));
    var hour = Integer.parseInt(IO.readln("What is the current hour? (0-23) "));

    if ((isStudent && total >= 5) || (hour >= 15 && hour < 17)) {
        IO.println("Meal deal applies!");
    } else {
        IO.println("No meal deal.");
    }
}
