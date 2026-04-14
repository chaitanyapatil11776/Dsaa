class Solution {

    boolean check(int[] v) {
        for(int x : v) {
            if(x == 0) return false;
        }
        return true;
    }

    public int countVowelSubstrings(String word) {
        int total = 0;

        for(int i = 0; i < word.length(); i++) {
            int[] vowel = new int[5]; // a,e,i,o,u

            for(int j = i; j < word.length(); j++) {
                char ch = word.charAt(j);

                if(ch=='a') vowel[0]++;
                else if(ch=='e') vowel[1]++;
                else if(ch=='i') vowel[2]++;
                else if(ch=='o') vowel[3]++;
                else if(ch=='u') vowel[4]++;
                else break; // stop if consonant

                if(check(vowel)) total++;
            }
        }

        return total;
    }
}