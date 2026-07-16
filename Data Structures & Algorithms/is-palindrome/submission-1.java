class Solution {
    public boolean isPalindrome(String s) {
        String r=isChar(s).toLowerCase();
        System.out.println(r);
        int p1=0,p2=r.length()-1;
        while(p1<=p2){
            if(r.charAt(p1)==r.charAt(p2)){
                p1++;
                p2--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static String isChar(String a){
        String r="";
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z') || (c>='0' && c<='9')){
                r+=c;
            }
        }
        return r;
    }
}
