// Complete the outputs:
// | Temp | V1 Output | V2 Output    |
// |------|-----------| -------------|
// | 5    | `Hot`     | `Hot`        |
// | 18   | `Flat `   | `Flat `      |
// | 30   | `Iced `   | `Iced Flat ` |

void main() {
    version1(5);
    version2(5);

    version1(18);
    version2(18);

    version1(30);
    version2(30);

    whatDoesThisPrint();
}

void version1(int temp) {
    if (temp > 25) System.out.print("Iced ");
    else if (temp > 15) System.out.print("Flat ");
    else System.out.print("Hot");
}

void version2(int temp) {
    if (temp > 25) System.out.print("Iced ");
    if (temp > 15) System.out.print("Flat ");
    else System.out.print("Hot");
}

void whatDoesThisPrint() {
    int x = -1, y = 5;

    // What does this print? Add braces so that "B" is printed whenever x is not positive.
    /*
        if (x > 0)
            if (y > 0)
                System.out.println("A");
        else
            System.out.println("B");
    */
    // Prints: ``

    if (x > 0) {
        if (y > 0) {
            System.out.println("A");
        }
    } else {
        System.out.println("B");
    }
}
