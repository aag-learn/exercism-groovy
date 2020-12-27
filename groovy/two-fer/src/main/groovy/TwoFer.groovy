class TwoFer {

    static String twoFer(String name) {
        String oneFor = "One for"
        String oneForMe  = "one for me."
        if (name == "" || name == null) {
            return "${oneFor} you, ${oneForMe}"
        } else {
            return "${oneFor} ${name}, ${oneForMe}"
        }
    }
}
