// Give the value and the type (int or double) of each expression:
// | Expression    | Value | Type   |
// |---------------|-------|--------|
// | 17 / 5        | 3     | int    |
// | 17 % 5        | 2     | int    |
// | 17.0 / 5      | 3.4   | double |
// | 5 % 17        | 5     | int    |
// | -7 % 3        | -1    | int    |
// | 7 / 2 * 2     | 6     | int    |
// | 7 / 2.0       | 3.5   | double |
// | 1 + 2 * 3 % 4 | 3     | int    |

// A student writes the code below to average two ratings and expects 7.5. What is printed, and why?
// Fix it in two different ways.
/*
    void main() {
        int a = 7, b = 8;
        double avg = (a + b) / 2;
        System.out.println(avg);
    }
*/
// Output: `7.0`
// As integer division is performed with `a + b` and 2.

void main() {
    IO.println(way1());
    IO.println(way2());
}

// cast as double
double way1() {
    int a = 7, b = 8;
    double avg = (a + b) / 2.0;
    // or:
    // double avg = (double) (a + b) / 2;
    // or:
    // double avg = (a + b) / (double)2;

    return avg;
}

// init as double
double way2() {
    double a = 7, b = 8;
    double avg = (a + b) / 2;

    return avg;
}
