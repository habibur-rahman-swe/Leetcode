// Last updated: 10/20/2025, 11:40:24 AM
class Solution {
    int index = 0;

    public boolean parseBoolExpr(String expression) {
        return evaluate(expression);
    }

    private boolean evaluate(String expr) {
        char currChar = expr.charAt(index++);
        // base case true(t) or false(f)
        if (currChar == 't') return true;
        if (currChar == 'f') return false;

        if (currChar == '!') {
            index++; // skip '('
            boolean result = !evaluate(expr);
            index++; // skip ')'
            return result;
        }

        // handle and '&(...)' and or '|(...)'
        List<Boolean> values = new ArrayList<>();
        index++; // skip '('
        while (expr.charAt(index) != ')') {
            if (expr.charAt(index) != ',') {
                values.add(evaluate(expr)); // collect results of subexpressions
            } else {
                index++; // skip ','
            }
        }
        index++; // skip ')'

        // manual and operation: returns false if any value is false
        if (currChar == '&') {
            for (Boolean v : values) {
                if (!v) return false;
            }
            return true;
        }

        // manual or operation: returns true if any value is true
        if (currChar == '|') {
            for (Boolean v : values) {
                if (v) return true;
            }
            return false;
        }
        return false;
    }
}