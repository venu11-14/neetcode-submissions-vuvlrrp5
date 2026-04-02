class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> chs = new HashMap<>();
        Map<Character, Integer> cht = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            chs.put(s.charAt(i), chs.getOrDefault(s.charAt(i), 0) + 1);
            cht.put(t.charAt(i), cht.getOrDefault(t.charAt(i), 0) + 1);
        }

        return chs.equals(cht);
    }
}