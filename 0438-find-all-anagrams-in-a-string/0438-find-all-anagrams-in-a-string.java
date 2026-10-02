class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) {
            return result;
        }
        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < k; i++) {
            windowFreq[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pFreq, windowFreq)) {
            result.add(0);
        }

        for (int i = k; i < s.length(); i++) {

            windowFreq[s.charAt(i - k) - 'a']--;

            windowFreq[s.charAt(i) - 'a']++;

            if (Arrays.equals(pFreq, windowFreq)) {
                result.add(i - k + 1);
            }
        }
        return result;

        
    }
}