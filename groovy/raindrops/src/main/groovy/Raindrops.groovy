class Raindrops {

    String convert(num) {
        String ret =  ""

        if ( !isDivisableByThreeFiveOrSeven(num) ) {
            ret+= num.toString()
        } else {
            if ( isDivisibleByThree(num) ) ret += "Pling"
        }

        ret
    }

    private

    Boolean isDivisibleByThree(num) {
        num % 3 == 0
    }
    Boolean isDivisableByThreeFiveOrSeven(num) {
        isDivisibleByThree(num) || num % 5 == 0 || num % 7 == 0
    }
}
