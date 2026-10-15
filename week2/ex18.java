// Rewrite the core of ex8.java (ignoring invalid ages) as one statement, with no if, using `condition ? x : y`.

void main() {
    IO.println(Integer.parseInt(IO.readln("Enter age: ")) >= 18 ? "Adult." : "Underage.");
}
