class Solution {
    public int findOccurance(char[] ch){
        int oc = 0;
        for(int i=0; i<ch.length; i++){
            for(int j=0; j<ch.length; j++){
                if(ch[i]==ch[j]){
                    oc+=1;
                }
            }
        }
        return oc;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{

            Map<Character,Integer> chs = new HashMap();
            Map<Character,Integer> cht = new HashMap();
            for(int i=0; i<s.length(); i++){
                chs.put(s.charAt(i), chs.getOrDefault(s.charAt(i),0)+1);
                cht.put(t.charAt(i), cht.getOrDefault(t.charAt(i),0)+1);
            }
            Iterator<Map.Entry<Character, Integer>> it1 = chs.entrySet().iterator();
            Iterator<Map.Entry<Character, Integer>> it2 = cht.entrySet().iterator();
            while(it1.hasNext() && it2.hasNext()) {
                Map.Entry<Character, Integer> entry1 = it1.next();
                Map.Entry<Character, Integer> entry2 = it2.next();
                if(!entry1.getKey().equals(entry2.getKey())) {
                    return false;
                }
                if(entry1.getValue()!=entry2.getValue()){
                    return false;
                }
            }
            return true;
        }
    }
}






















