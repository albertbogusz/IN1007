// Write a program which asks the user to enter their age and displays "Adult" if it is 18 or over,
// "Underage" otherwise, and "Invalid age" if it is below 0 or above 120. Test it with every value in the
// table:
// | Input | Expected    |
// |-------|-------------|
// | 25    | Adult       |
// | 18    | Adult       |
// | 17    | Underage    |
// | -3    | Invalid age |
// | 150   | Invalid age |

void main() {
    var age = Integer.parseInt(IO.readln("Enter age: "));

    if (age < 0 || age > 120) {
        IO.println("Invalid age");
    } else if (age >= 18) {
        IO.println("Adult");
    } else {
        IO.println("Underage");
    }
}
