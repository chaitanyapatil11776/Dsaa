class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();

        for(int i=0;i<=s2.length()-k;i++){
            String sub=s2.substring(i,i+k);
            if(isAnagram(s1,sub)){
                return true;
            }


                
            }
            return false;
        }
    

private boolean isAnagram(String a, String b) {

        int[] freq = new int[26];

        for (char ch : a.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : b.toCharArray()) {
            freq[ch - 'a']--;
        }

        for (int x : freq) {
            if (x != 0) return false;
        }

        return true;
    }

    
    }