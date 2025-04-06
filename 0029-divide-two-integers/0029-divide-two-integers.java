class Solution {
    public int divide(int div, int divis) {
        if (div == Integer.MIN_VALUE && divis == -1) {
            return Integer.MAX_VALUE;
        }

        int res=div/divis;
        return res;
        
        
    }
}
    
