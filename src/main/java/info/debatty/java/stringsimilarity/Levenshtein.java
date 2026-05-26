package info.debatty.java.stringsimilarity;

import info.debatty.java.stringsimilarity.interfaces.MetricStringDistance;
import net.jcip.annotations.Immutable;

/**
 * The Levenshtein distance between two words is the minimum number of
 * single-character edits (insertions, deletions or substitutions) required to
 * change one string into the other.
 *
 * @author Thibault Debatty
 */
@Immutable
public class Levenshtein implements MetricStringDistance {

    /**
     * Equivalent to distance(s1, s2, Integer.MAX_VALUE).
     */
    public final double distance(final String s1, final String s2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * The Levenshtein distance, or edit distance, between two words is the
     * minimum number of single-character edits (insertions, deletions or
     * substitutions) required to change one word into the other.
     *
     * http://en.wikipedia.org/wiki/Levenshtein_distance
     *
     * It is always at least the difference of the sizes of the two strings.
     * It is at most the length of the longer string.
     * It is zero if and only if the strings are equal.
     * If the strings are the same size, the Hamming distance is an upper bound
     * on the Levenshtein distance.
     * The Levenshtein distance verifies the triangle inequality (the distance
     * between two strings is no greater than the sum Levenshtein distances from
     * a third string).
     *
     * Implementation uses dynamic programming (Wagner–Fischer algorithm), with
     * only 2 rows of data. The space requirement is thus O(m) and the algorithm
     * runs in O(mn).
     *
     * @param s1 The first string to compare.
     * @param s2 The second string to compare.
     * @param limit The maximum result to compute before stopping. This
     *              means that the calculation can terminate early if you
     *              only care about strings with a certain similarity.
     *              Set this to Integer.MAX_VALUE if you want to run the
     *              calculation to completion in every case.
     * @return The computed Levenshtein distance.
     * @throws NullPointerException if s1 or s2 is null.
     */
    public final double distance(final String s1, final String s2, final int limit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
