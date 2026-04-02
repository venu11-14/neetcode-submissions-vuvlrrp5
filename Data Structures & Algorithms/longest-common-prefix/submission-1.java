class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp = "";
        int c = 0;
        String x = "";
        for(int i=0; i<strs.length; i++){
            for(int j=0; j<strs.length; j++){
                if(strs[i].length()<strs[j].length()){
                    temp = strs[i];
                }
            }
        }
        for(int i=0; i<temp.length(); i++){
            for(int j=0; j<strs.length; j++){
                if(temp.charAt(i)==strs[j].charAt(i)){
                    c+=1;
                }
            }
            if(c==strs.length){
                x+=temp.charAt(i);
                c = 0;
            }
        }
        return x.length()==0 ? "":x;
    }
}




