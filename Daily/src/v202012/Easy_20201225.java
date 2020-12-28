package v202012;

import java.util.Arrays;

/**
 * @author wrw
 * @date 2020/12/25 8:04
 * @detail 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
 * 对每个孩子 i，都有一个胃口值g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j]。如果 s[j]>= g[i]，
 * 我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
 */
public class Easy_20201225 {
    /**
     * 贪心算法
     *
     * @param g 胃口
     * @param s 饼干尺寸
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int num = 0;
        for (int i = 0; i < g.length; i++) {
            if (g[num] <= s[i]) {
                num++;
                break;
            }
        }
        return num;
    }
}
