// Write a program which asks the user to enter two integers and displays "greater" if the first one is greater
// than the second one and "smaller or equal" otherwise. Then change it to display three different messages:
// "Greater", "Equal" or "Smaller".

void main() {
    var first = Integer.parseInt(IO.readln("Enter integer: "));
    var second = Integer.parseInt(IO.readln("Enter another integer: "));

    if (first > second) {
        IO.println("Greater");
    } else if (first == second) {
        IO.println("Equal");
    } else {
        IO.println("Smaller");
    }
}
