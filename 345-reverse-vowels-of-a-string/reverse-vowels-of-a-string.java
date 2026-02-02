class Solution {

    private boolean vowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public String reverseVowels(String s) {

        char a[]=s.toCharArray();
                int left=0;
        int right=a.length-1;
        while(left<right){
        if(!vowel(a[left])){
            left++;
        }else if(!vowel(a[right])){
            right--;
        }else{
            char temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;

        }
        } return new String(a);
         
    }
      
    }
