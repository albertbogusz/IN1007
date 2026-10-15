// Each snippet compiles but is wrong. Say what goes wrong for a real customer, then fix it:

void main() {
    // declarations outside of the snippets:
    int total = 0;
    boolean freeDelivery;
    double price = 0;
    int points = 0;
    String reward;


    // A: free delivery
    /*
        if (total > 20); {
            freeDelivery = true;
        }
    */
    // Remove semicolon:
    if (total > 20) {
        freeDelivery = true;
    }

    // B: member discount
    /*
        boolean isMember = false;
        if (isMember = true) {
            price = price * 0.9;
        }
    */
    // Use `==`:
    boolean isMember = false;
    if (isMember == true) {
        price = price * 0.9;
    }

    // C: loyalty reward
    /*
        if (points >= 100)
            reward = "Free drink";
            points -= 100;
    */
    // Use brackets:
    if (points >= 100) {
        reward = "Free drink";
        points -= 100;
    }
}
