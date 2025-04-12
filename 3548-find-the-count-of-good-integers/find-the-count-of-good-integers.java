import java.util.*;

class Solution {
  public long countGoodIntegers(int n, int k) {
    // Half length of the palindromic number
    final int halfLength = (n + 1) / 2;

    // Minimum and maximum value for the first half (no leading zero)
    final int minHalf = (int) Math.pow(10, halfLength - 1);
    final int maxHalf = (int) Math.pow(10, halfLength);

    long ans = 0;
    Set<String> seen = new HashSet<>();

    // Precompute factorials up to n
    long[] factorial = new long[n + 1];
    factorial[0] = 1;
    for (int i = 1; i <= n; i++) {
      factorial[i] = factorial[i - 1] * i;
    }

    // Loop through all possible first halves
    for (int num = minHalf; num < maxHalf; ++num) {
      String firstHalf = String.valueOf(num);

      // Build the full palindrome
      String secondHalf = new StringBuilder(firstHalf).reverse().toString();
      String palindrome = firstHalf + secondHalf.substring(n % 2);  // skip center digit if odd length

      long val = Long.parseLong(palindrome);
      if (val % k != 0) continue;  // Not divisible by k → skip

      // Sort digits to get the canonical form (to avoid duplicate permutations)
      char[] sortedDigits = palindrome.toCharArray();
      Arrays.sort(sortedDigits);
      String sortedKey = new String(sortedDigits);

      // Skip if we've already counted this digit signature
      if (seen.contains(sortedKey)) continue;
      seen.add(sortedKey);

      // Count digit frequency
      int[] digitCount = new int[10];
      for (char c : palindrome.toCharArray())
        digitCount[c - '0']++;

      // First digit can't be zero → we must place a non-zero digit first
      int validFirstDigitCount = 0;
      for (int d = 1; d < 10; d++) {
        if (digitCount[d] > 0) {
          // Choose this digit as first, reduce its count temporarily
          digitCount[d]--;
          long perm = factorial[n - 1];  // remaining (n-1) positions

          // Divide by factorials of digit frequencies
          for (int count : digitCount) {
            if (count > 1)
              perm /= factorial[count];
          }

          validFirstDigitCount += perm;

          // Restore count
          digitCount[d]++;
        }
      }

      ans += validFirstDigitCount;
    }

    return ans;
  }
}
