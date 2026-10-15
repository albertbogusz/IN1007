// Give the final `price` (in pence) for each size: 'S', 'M', 'L' and 'X'. Is the missing break a bug or a
// deliberate design? Rewrite it so a small costs 200, a medium 250 and a large 300.
/*
    int price = 200;
    switch (size) {
        case 'S': price += 0;
        case 'M': price += 50;
        case 'L': price += 50;
                  break;
        default: price = 0;
    }
*/
// Bug as there are missing breaks.
// Returns 300 for 'S' and 'M'
// Returns 250 for 'L'

void main() {
    IO.println(price(IO.readln("Enter size: ").charAt(0)));
}

int price(char size) {
    return switch (size) {
        case 'S' -> 200;
        case 'M' -> 250;
        case 'L' -> 300;
        default -> 0;
    };
}
