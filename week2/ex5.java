// Write one Java boolean expression for each rule. Choose sensible variable names and types.

void main() {
    IO.println(breakfastServed(8)); // true
    IO.println(breakfastServed(6)); // false

    IO.println(freeDelivery(20, false)); // true
    IO.println(freeDelivery(10, true)); // true
    IO.println(freeDelivery(10, false)); // false

    IO.println(mealDeal(5, 14, true)); // true
    IO.println(mealDeal(5, 16, false)); // true
    IO.println(mealDeal(5, 17, false)); // false

    IO.println(childrensMenu(8)); // true
    IO.println(childrensMenu(13)); // false
}

// A: Breakfast is served when hour is from 7 to 10 inclusive.
boolean breakfastServed(int hour) {
    return hour >= 7 && hour <= 10;
}

// B: Free delivery if the total is over £20, or if a premium member spends at least £10.
boolean freeDelivery(double total, boolean isPremium) {
    return total >= 20 || isPremium && total >= 10;
}

// C: The meal deal applies to students spending at least £5, and to everyone during happy hour (15:00 to 16:59).
boolean mealDeal(double total, double hour, boolean isStudent) {
    return hour >= 15 && hour < 17 || isStudent && total >= 5;
}

// D: A student writes if (7 <= age <= 12) for the children's menu. Why does Java reject it? Rewrite it.
boolean childrensMenu(int age) {
    return age >= 7 && age <= 12; // `&&` operator needed for joint conditions
}
