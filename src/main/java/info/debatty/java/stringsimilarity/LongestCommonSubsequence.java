package info.debatty.java.stringsimilarity;

import info.debatty.java.stringsimilarity.interfaces.StringDistance;
import net.jcip.annotations.Immutable;

/**
 * The longest common subsequence (LCS) problem consists in finding the longest
 * subsequence common to two (or more) sequences. It differs from problems of
 * finding common substrings: unlike substrings, subsequences are not required
 * to occupy consecutive positions within the original sequences.
 *
 * It is used by the diff utility, by Git for reconciling multiple changes, etc.
 *
 * The LCS distance between Strings X (length n) and Y (length m) is n + m - 2
 * |LCS(X, Y)| min = 0 max = n + m
 *
 * LCS distance is equivalent to Levenshtein distance, when only insertion and
 * deletion is allowed (no substitution), or when the cost of the substitution
 * is the double of the cost of an insertion or deletion.
 *
 * ! This class currently implements the dynamic programming approach, which has
 * a space requirement O(m * n)!
 *
 * @author Thibault Debatty
 */
@Immutable
public class LongestCommonSubsequence implements StringDistance {

    /**
     * Return the LCS distance between strings s1 and s2, computed as |s1| +
     * |s2| - 2 * |LCS(s1, s2)|.
     *
     * @param s1 The first string to compare.
     * @param s2 The second string to compare.
     * @return the LCS distance between strings s1 and s2, computed as |s1| +
     * |s2| - 2 * |LCS(s1, s2)|
     * @throws NullPointerException if s1 or s2 is null.
     */
    public final double distance(final String s1, final String s2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return the length of Longest Common Subsequence (LCS) between strings s1
     * and s2.
     *
     * @param s1 The first string to compare.
     * @param s2 The second string to compare.
     * @return the length of LCS(s1, s2)
     * @throws NullPointerException if s1 or s2 is null.
     */
    public final int length(final String s1, final String s2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
