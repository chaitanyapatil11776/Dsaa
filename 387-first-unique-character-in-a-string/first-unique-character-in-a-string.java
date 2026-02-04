class Solution {
    public int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    count++;

                    // 🔴 important optimization
                    if (count > 1) {
                        break;
                    }
                }
            }

            if (count == 1) {
                return i;
            }
        }

        return -1;
    }
}
