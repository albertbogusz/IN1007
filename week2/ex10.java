// Write a program which asks the user to enter a bill in pence and displays it as pounds and pence,
// e.g. inputting 437 displays "£4 and 37p".

void main() {
    var pence = Integer.parseInt(IO.readln("Enter pence: "));
    IO.println("£%d and %dp".formatted(pence / 100, pence % 100));
}
