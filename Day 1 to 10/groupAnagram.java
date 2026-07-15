import java.util.*;

public class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l1 = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String s = getSort(str);
            map.computeIfAbsent(s, k -> new ArrayList<>()).add(str);
        }

        for (List<String> list : map.values()) {
            l1.add(list);
        }

        return l1;
    }

    // here i am going to make key->value pair
    private String getSort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}