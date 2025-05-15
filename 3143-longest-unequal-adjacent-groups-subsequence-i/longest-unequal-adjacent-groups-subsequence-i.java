import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> getLongestSubsequence(String[] words, int[] groups) {
    List<String> ans = new ArrayList<>();
    int previousGroupId = -1;

    for (int i = 0; i < words.length; ++i) {
      if (groups[i] != previousGroupId) {
        ans.add(words[i]);
        previousGroupId = groups[i];
      }
    }

    return ans;
  }
}
