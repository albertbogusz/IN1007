// Write a program which asks the user to enter a mark and displays the grade: `A+` for 80+, `A` for 70+,
// `B` for 60+, `C` for 50+, `D` for 40+, `F` otherwise, and `Invalid mark` for outside of 0-100.
// | Input | Expected     |
// |-------|--------------|
// | 85    | A+           |
// | 80    | A+           |
// | 79    | A            |
// | 40    | D            |
// | 39    | F            |
// | 101   | Invalid mark |

void main() {
    var mark = Integer.parseInt(IO.readln("Enter a mark: "));

    if (mark < 0 || mark > 100) {
        IO.println("Invalid mark");
    } else if (mark >= 80) {
        IO.println("A+");
    } else if (mark >= 70) {
        IO.println("A");
    } else if (mark >= 60) {
        IO.println("B");
    } else if (mark >= 50) {
        IO.println("C");
    } else if (mark >= 40) {
        IO.println("D");
    } else {
        IO.println("F");
    }
}
