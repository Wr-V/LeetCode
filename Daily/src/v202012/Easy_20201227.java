package v202012;

import java.util.HashMap;
import java.util.Set;

/**
 * @author wrw
 * @date 2020/12/28 9:49
 * @detail 给定两个字符串s和t，判断它们是否是同构的。
 * <p>
 * 如果s中的字符可以被替换得到t，那么这两个字符串是同构的。
 * <p>
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 */
public class Easy_20201227 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> s2t = new HashMap<>();
        HashMap<Character, Character> t2s = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y)
                    || (t2s.containsKey(y) && t2s.get(y) != x))
                return false;
            s2t.put(x,y);
            t2s.put(y,x);
        }
        return true;
    }


}
