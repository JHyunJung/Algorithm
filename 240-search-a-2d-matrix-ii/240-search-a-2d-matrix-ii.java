class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        Map<Integer, Integer> h = new HashMap<>();
        
        int rLen = matrix.length;
        int cLen = matrix[0].length;
        
        
        if(rLen == 1){
            for(int i=0; i<cLen; i++){
                h.put(matrix[0][i], 1);
            }
        }
        else{
        for(int i=0; i<rLen; i++){
            for(int j=0; j<cLen; j++){
                
                h.put(matrix[i][j], 1);
                
            }
        }
        }
        
        return h.containsKey(target);
    }
}