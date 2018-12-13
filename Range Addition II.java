class Solution {
    //max will be the one in which all ops have been performed
    public int maxCount(int m, int n, int[][] ops) {
        for(int[] op:ops){
            m= Math.min(m,op[0]);
            n= Math.min(n,op[1]);
        }
        return m*n;
        
    }
}
