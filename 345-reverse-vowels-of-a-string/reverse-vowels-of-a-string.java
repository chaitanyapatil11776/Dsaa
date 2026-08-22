class Solution {
    public String reverseVowels(String s) {
    char a[]=    s.toCharArray();
    int left=0;
    int right=s.length()-1;
    while(left<right){
        if(!pp(a[left]))left++;
        else if(!pp(a[right]))right--;
        else{

            char temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }

    }

    return new String(a);
    }

    boolean pp(char c){
        return c=='a' ||c=='e'  ||c=='i'  ||c=='o'  ||c=='u'  ||c=='A'  ||c=='E'  ||c=='I'  ||c=='O' ||c=='U';
    }

}