import java.util.Arrays;

/**
 * @author wrw
 * @date 2020/12/25 10:17
 * @detail 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 */
public class Offer11 {
    /**
     * 二分法
     *
     * @param numbers 旋转数组
     * @return 最小数
     */
    public static int minArray(int[] numbers) {
        if (numbers.length < 1) return -1;//空数组
        int start = 0;
        int end = numbers.length - 1;
        int mid;
        while (start < end) {
            mid = start + ((end - start) >> 1);
            if (numbers[mid] > numbers[end])
                start = mid + 1;
            else if (numbers[mid] < numbers[end])
                end = mid;
            else
                end--;
        }
        return numbers[start];
    }
}
