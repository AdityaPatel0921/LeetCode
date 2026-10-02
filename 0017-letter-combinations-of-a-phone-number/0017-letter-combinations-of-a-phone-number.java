class Solution {
    public List<String> letterCombinations(String digits) {
         List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        String[] mapping = {
            "",  "", "abc", "def", "ghi", "jkl", "mno","pqrs","tuv","wxyz"  
        };

        backtrack(digits, 0, "", mapping, result);
        return result;
    }
    private void backtrack(
            String digits,
            int index,
            String current,
            String[] mapping,
            List<String> result) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        char digit = digits.charAt(index);
        String letters = mapping[digit - '0'];
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            backtrack(
                digits,
                index + 1,
                current + letter,
                mapping,
                result
            );        
        }
        }
    }






    