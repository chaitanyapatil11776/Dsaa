class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character>low=new HashSet<>();
        HashSet<Character>upp=new HashSet<>();
        for(char c:word.toCharArray()){
            if(Character.isLowerCase(c)){
                low.add(c);
            }else{
                upp.add(c);
            }

        }
        int count=0;

        for(char c:low){
            if(upp.contains(Character.toUpperCase(c))){
                count++;
            }
        }
        return count;
    }
}