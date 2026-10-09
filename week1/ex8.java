// Write a program that asks the user to enter a word and displays `true` if it is a palindrome
// and `false` otherwise.
//
// A palindrome is a word which reads the same backward or forward, e.g. "abcba" is a palindrome.
// The same definition works for integers, e.g. 13422431 is a palindrome.

void main() {
    var word = IO.readln("Check if palindrome: ");

    var isPalindrome = true;

    for (var i = 0; i < word.length() / 2; i++) {
        if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
            isPalindrome = false;
            break;
        }
    }

    IO.println(isPalindrome);
}
