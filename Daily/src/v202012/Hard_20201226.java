package v202012;

/**
 * @author wrw
 * @date 2020/12/26 0:08
 * @detail 给定一个仅包含 0 和 1 、大小为 rows x cols 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。
 */
public class Hard_20201226 {
    public static int maximalRectangle(char[][] matrix) {
        int[][] left = new int[][]{};
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j< matrix[i].length; j++){
                if ('1' == matrix[i][j]){
                    left[i][j] = 1;
                }

            }
        }


        return -1;
    }
}
