//启发：数组

//time:10:10
//time:11:40
//m*n的矩阵==arr1
//矩阵是2*n==indices

//遇到数组我能怎么办？？二维的还！
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
         int[][] arr1 = new int[m][n]; //全是0

         for(int i = 0; i < indices.length; i++){
                    for(int x = 0; x < n; x++){
                        arr1[indices[i][0]][x] += 1;
                    }
                    for(int y = 0; y < m; y++){
                        arr1[y][indices[i][1]] += 1;
                    }
         }       
         int sumOdd = 0;
         for(int z = 0; z < m; z++) { 
            for(int w = 0; w < n; w++) {
                sumOdd += arr1[z][w] % 2;
            }
         }
        return sumOdd; 
    }
}   
