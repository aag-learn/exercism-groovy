class TwoFer {

    static String twoFer(String name) {
        String oneFor = "One for"
        String oneForMe  = "one for me."

        if (name) {
            return "${oneFor} ${name}, ${oneForMe}"
        } else {
            return "${oneFor} you, ${oneForMe}"
        }
    }
}
