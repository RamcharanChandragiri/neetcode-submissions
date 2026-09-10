class Solution {
    public boolean isPalindrome(String s) {
        String re=s.replaceAll("[^a-zA-Z0-9]","");
        int i=0;
        int j=re.length()-1;
        while(i<j){
         if (Character.toLowerCase(re.charAt(i)) ==
                Character.toLowerCase(re.charAt(j))){
            i++;
            j--;
        }
        else return false;
        }
        return true;
    }
    
}
