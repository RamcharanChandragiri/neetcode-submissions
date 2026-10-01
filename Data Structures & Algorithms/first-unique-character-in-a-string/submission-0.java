class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;
            
            for (int j = 0; j < s.length(); j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                return i;
            }
        }
        
        return -1;
    }
}
