class Solution {
    public int maxVowels(String s, int k) {

        int vowelCount = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }
        }
        int maxVowels = vowelCount;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                vowelCount--;
            }
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }
            maxVowels = Math.max(maxVowels, vowelCount);
        }
        return maxVowels;
    }
    private boolean isVowel(char ch) {
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}
        