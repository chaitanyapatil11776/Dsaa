class Solution {
    public int compress(char[] chars) {
        int i=0;
        for(int j=1,count=1;j<=chars.length ;j++,count++){
            if(j==chars.length || chars[j]!=chars[j-1]){
                chars[i]=chars[j-1];
                i++;

                if(count>=2){
                    String s=count+"";
                    for(char c:s.toCharArray()){
                        chars[i]=c;
                        i++;
                    }
                }
                count=0;
            }
        }
        return i;

    }
}