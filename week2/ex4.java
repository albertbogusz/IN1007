// Given boolean b = true, c = false; and int x = 4, y = 9;, evaluate each expression to true or false:
// A: x < y && c
// B: !(x > y) || c
// C: x == 4 || y / 0 > 1 (does this crash? why not?)
// D: b && !c && x % 2 == 0
// E: !b || (y >= 9 && x != 4)

void main() {
    boolean b = true, c = false;
    int x = 4, y = 9;

    IO.println(x < y && c); // false
    IO.println(!(x > y) || c); // true
    IO.println(x == 4 || y / 0 > 1); // true, no crash as OR lazy evals when LHS is true (RHS not evaluated)
    IO.println(b && !c && x % 2 == 0); // true
    IO.println(!b || (y >= 9 && x != 4)); // false
}
