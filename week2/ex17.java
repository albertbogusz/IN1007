// Write a program which asks the user to enter three side lengths and displays "Not a triangle" if any
// side is 0 or less, or one side is at least as long as the other two together. Otherwise display
// "Equilateral", "Isosceles" or "Scalene". Write your own table of at least six test cases, including
// boundary cases such as 1, 2, 3:
// | Side 1 | Side2 | Side3 | Expected       |
// |--------|-------|-------|----------------|
// | 1      | 2     | 3     | Not a triangle |
// | 0      | 5     | 5     | Not a triangle |
// | -1     | 2     | 2     | Not a triangle |
// | 5      | 5     | 5     | Equilateral    |
// | 2      | 3     | 2     | Isosceles      |
// | 4      | 5     | 6     | Scalene        |

void main() {
    var side1 = Integer.parseInt(IO.readln("Enter side length: "));
    var side2 = Integer.parseInt(IO.readln("Enter side length: "));
    var side3 = Integer.parseInt(IO.readln("Enter side length: "));

    if (
        side1 <= 0 ||
        side2 <= 0 ||
        side3 <= 0 ||
        side1 >= side2 + side3 ||
        side2 >= side1 + side3 ||
        side3 >= side1 + side2
    ) {
        IO.println("Not a triangle");
    } else if (side1 == side2 && side2 == side3) {
        IO.println("Equilateral");
    } else if (side1 == side2 || side2 == side3 || side1 == side3) {
        IO.println("Isosceles");
    } else {
        IO.println("Scalene");
    }
}
