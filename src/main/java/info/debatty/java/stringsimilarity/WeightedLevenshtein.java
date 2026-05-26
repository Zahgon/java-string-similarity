/*
 * The MIT License
 *
 * Copyright 2015 Thibault Debatty.
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
package info.debatty.java.stringsimilarity;

import info.debatty.java.stringsimilarity.interfaces.StringDistance;
import net.jcip.annotations.Immutable;

/**
 * Implementation of Levenshtein that allows to define different weights for
 * different character substitutions.
 *
 * @author Thibault Debatty
 */
@Immutable
public class WeightedLevenshtein implements StringDistance {

    private final CharacterSubstitutionInterface charsub;

    private final CharacterInsDelInterface charchange;

    /**
     * Instantiate with provided character substitution.
     * @param charsub The strategy to determine character substitution weights.
     */
    public WeightedLevenshtein(final CharacterSubstitutionInterface charsub) {
        this(charsub, null);
    }

    /**
     * Instantiate with provided character substitution, insertion, and
     * deletion weights.
     * @param charsub The strategy to determine character substitution weights.
     * @param charchange The strategy to determine character insertion /
     *                   deletion weights.
     */
    public WeightedLevenshtein(final CharacterSubstitutionInterface charsub, final CharacterInsDelInterface charchange) {
        this.charsub = charsub;
        this.charchange = charchange;
    }

    /**
     * Equivalent to distance(s1, s2, Double.MAX_VALUE).
     */
    public final double distance(final String s1, final String s2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Compute Levenshtein distance using provided weights for substitution.
     * @param s1 The first string to compare.
     * @param s2 The second string to compare.
     * @param limit The maximum result to compute before stopping. This
     *              means that the calculation can terminate early if you
     *              only care about strings with a certain similarity.
     *              Set this to Double.MAX_VALUE if you want to run the
     *              calculation to completion in every case.
     * @return The computed weighted Levenshtein distance.
     * @throws NullPointerException if s1 or s2 is null.
     */
    public final double distance(final String s1, final String s2, final double limit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private double insertionCost(final char c) {
        if (charchange == null) {
            return 1.0;
        } else {
            return charchange.insertionCost(c);
        }
    }

    private double deletionCost(final char c) {
        if (charchange == null) {
            return 1.0;
        } else {
            return charchange.deletionCost(c);
        }
    }
}
