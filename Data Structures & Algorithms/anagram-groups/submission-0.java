class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> h=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[]a=strs[i].toCharArray();
            Arrays.sort(a);
            String s=String.valueOf(a);
            if(!h.containsKey(s)){
                h.put(s,new ArrayList<>());
            }
            h.get(s).add(strs[i]);
        }
        List<List<String>> l=new ArrayList<>();
        for(String s:h.keySet()){
            l.add(h.get(s));
        }
        return l;
    }
}
