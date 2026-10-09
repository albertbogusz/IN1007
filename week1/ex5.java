// Write a program that asks the user to enter the name of a TA and their name and displays:
//
// Dear name_of_the_TA,
// I enjoy your tutorials, they are awesome!
// name_of_the_student

void main() {
    var taName = IO.readln("Who is your favourite TA? ");
    var studentName = IO.readln("What is your name? ");

    IO.println(
        "Dear %s,\nI enjoy your tutorials, they are awesome!\n%s.".formatted(taName, studentName)
    );
}
