/*
 * The MIT License
 *
 * Copyright 2016 Thibault Debatty.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package info.debatty.java.stringsimilarity.experimental;

import info.debatty.java.stringsimilarity.interfaces.StringDistance;
import java.util.LinkedList;

/**
 * Sift4 - a general purpose string distance algorithm inspired by JaroWinkler
 * and Longest Common Subsequence.
 * Original JavaScript algorithm by siderite, java port by Nathan Fischer 2016.
 * https://siderite.dev/blog/super-fast-and-accurate-string-distance.html
 * https://blackdoor.github.io/blog/sift4-java/
 *
 * @author Thibault Debatty
 */
public class Sift4 implements StringDistance {

    private static final int DEFAULT_MAX_OFFSET = 10;

    private int max_offset = DEFAULT_MAX_OFFSET;

    /**
     * Set the maximum distance to search for character transposition.
     * Compute cost of algorithm is O(n . max_offset)
     * @param max_offset
     */
    public final void setMaxOffset(final int max_offset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sift4 - a general purpose string distance algorithm inspired by
     * JaroWinkler and Longest Common Subsequence.
     * Original JavaScript algorithm by siderite, java port by Nathan Fischer
     * 2016.
     * https://siderite.dev/blog/super-fast-and-accurate-string-distance.html
     * https://blackdoor.github.io/blog/sift4-java/
     *
     * @param s1
     * @param s2
     * @return
     */
    public final double distance(final String s1, final String s2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
