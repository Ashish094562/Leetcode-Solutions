class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;
        while(i>=0 || j>=0){
            i = nextValid(s,i);
            j= nextValid(t,j);
            if(i>=0 && j>=0){
                if(s.charAt(i) != t.charAt(j)) return false;
            }
            
            else{
                if(i>=0 || j>=0) return false;
            }
            i--;
            j--;
        }
        return true;

    }
    int nextValid(String a,int i){
        int skip =0;
        while(i>=0){
            if(a.charAt(i) == '#'){
                skip++;
                
            }
            else if(skip >0){
                skip--;
                
            }
            else{
                break;
            }
            i--;
        }
        return i;
    }
    
}