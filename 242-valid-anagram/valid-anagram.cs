public class Solution {
    public bool IsAnagram(string s, string t) {
        if (s.Length != t.Length)
            return false;

        char[] x = s.ToCharArray();
        char[] y = t.ToCharArray();

        Array.Sort(x);
        Array.Sort(y);

        for (int i = 0; i < x.Length; i++)
        {
            if (x[i] != y[i])
                return false;
        }

        return true;
    }
}