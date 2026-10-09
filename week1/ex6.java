// Write a program that asks the user to enter three integers and displays `true` if they are
// in increasing order and `false` otherwise.

void main() {
    var prev = 0;
    var increasing = true;

    for (var i = 0; i < 3; i++) {
        var num = Integer.parseInt(IO.readln("Enter integer: "));
        if (i > 0 && prev >= num) {
            increasing = false;
        }
        prev = num;
    }

    IO.println(increasing);
}
