package info.debatty.java.stringsimilarity;

import info.debatty.java.stringsimilarity.interfaces.NormalizedStringDistance;
import net.jcip.annotations.Immutable;

/**
 * N-Gram Similarity as defined by Kondrak, "N-Gram Similarity and Distance",
 * String Processing and Information Retrieval, Lecture Notes in Computer
 * Science Volume 3772, 2005, pp 115-126.
 *
 * The algorithm uses affixing with special character '\n' to increase the
 * weight of first characters. The normalization is achieved by dividing the
 * total similarity score the original length of the longest word.
 *
 * http://webdocs.cs.ualberta.ca/~kondrak/papers/spire05.pdf
 */
@Immutable
public class NGram implements NormalizedStringDistance {

    private static final int DEFAULT_N = 2;

    private final int n;

    /**
     * Instantiate with given value for n-gram length.
     * @param n
     */
    public NGram(final int n) {
        this.n = n;
    }

    /**
     * Instantiate with default value for n-gram length (2).
     */
    public NGram() {
        this.n = DEFAULT_N;
    }

    /**
     * Compute n-gram distance.
     * @param s0 The first string to compare.
     * @param s1 The second string to compare.
     * @return The computed n-gram distance in the range [0, 1]
     * @throws NullPointerException if s0 or s1 is null.
     */
    public final double distance(final String s0, final String s1) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
