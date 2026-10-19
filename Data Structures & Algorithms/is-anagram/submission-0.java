class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> occ = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            int x = occ.getOrDefault(s.charAt(i),0);
            occ.put(s.charAt(i), x+1);
        }

        for(int i = 0; i < t.length(); i++){
            int x = occ.getOrDefault(t.charAt(i),0);
            if(x <= 0) return false;
            occ.put(t.charAt(i), x-1);
        }

        for(Map.Entry ele : occ.entrySet()){
            int x = (int)ele.getValue();
            if(x !=0) return false;
        }
        return true;

    }
}
