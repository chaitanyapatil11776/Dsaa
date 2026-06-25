class Solution {
    public String reversePrefix(String word, char ch) {
        int index=-1;
        char c[]=word.toCharArray();
        for(int i=0;i<word.length();i++){
            if(c[i]==ch){
                index=i;
                break;
            }
        }
        if(index==-1)return word;
        int left=0;
        int right=index;
        while(left<right){
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;


        }
        return new String(c);
    }
}