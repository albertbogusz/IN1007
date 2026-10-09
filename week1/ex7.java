// Write a program that can read the value of [2][0] of the following 2D array:
// | 10 | 20 |
// | 30 | 40 |
// | 50 | 60 |
// Also observe the error when you try to read the value from [3][0].

void main() {
    int[][] array = { { 10, 20 }, { 30, 40 }, { 50, 60 } };

    IO.println(array[2][0]);

    // Printing `array[3][0]` gives `java.lang.ArrayIndexOutOfBoundsException`.
}
