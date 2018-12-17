/*Given an array of strings, group anagrams together.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Solution {

  public List<List<String>> groupAnagrams(String[] strs) {
    Hashtable<String, List<String>> ht = new Hashtable<>();
    for (String s : strs) {
      char[] temp = s.toCharArray();
      Arrays.sort(temp);
      String _s = String.valueOf(temp);
      ht.putIfAbsent(_s, new ArrayList<>());
      ht.get(_s).add(s);
    }
    return new ArrayList<>(ht.values());
  }

}
