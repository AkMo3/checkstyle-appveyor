/*
NoWhitespaceBefore
allowLineBreaks = (default)false
tokens = (default)COMMA, SEMI, POST_INC, POST_DEC, ELLIPSIS, LABELED_STAT


*/

package com.puppycrawl.tools.checkstyle.checks.whitespace
.nowhitespacebefore; // violation

import java.util.function.Supplier;

public class InputNoWhitespaceBeforeAtStartOfTheLine {
    public static class A {
        private A() {
        }
    }

    public <V> void methodName(V value) {
        Supplier<?> t =
A ::new;
    }
}
