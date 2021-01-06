class TwoFer {

    static String twoFer(String name) {
        // Use the Elvis operator: http://groovy-lang.org/operators.html#_elvis_operator
        "One for ${name ?: 'you'}, one for me."
    }
}
