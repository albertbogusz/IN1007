// What does this program print?

void main() {
    int n = 5;
    int a = n++; // a = 5, n = 6
    int b = n--; // b = 6, n = 5
    int c = --n; // c = 4, n = 4
    int d = ++n; // d = 5, n = 5
    System.out.println(a + " " + b + " " + c + " " + d + " " + n); // `5 6 4 5 5`

    int orders = 10;
    orders = orders++;
    System.out.println(orders); // `10`
}
