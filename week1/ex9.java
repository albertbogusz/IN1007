// Write a program that asks the user to enter a String and displays the longest palindrome that is a substring
// of it (or one of the longest if several). For example, if the user enters the word "aaabcbaababb", the
// program should display "aabcbaa".
//
// In the worst case, how many operations will your program do, with respect to the length of the String input
// by the user?

void main() {
    var word = IO.readln("Get longest palindrome substring: ");
    var longest = "";

    for (var i = 0; i < word.length(); i++) {
        var odd = expand(word, i, i);
        if (odd.length() > longest.length()) {
            longest = odd;
        }

        var even = expand(word, i, i + 1);
        if (even.length() > longest.length()) {
            longest = even;
        }
    }

    IO.println(longest);

    // O(n^2)
}

String expand(String str, int l, int r) {
    while (l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)) {
        l--;
        r++;
    }

    return str.substring(l + 1, r);
}
