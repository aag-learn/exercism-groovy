class Raindrops {

    String convert(num) {
        String ret =  ""

        if ( !isDivisableByThreeFiveOrSeven(num) ) {
            ret+= num.toString()
        } else {
            if ( isDivisibleByThree(num) ) ret += "Pling"
            if ( isDivisibleByFive(num) ) ret += "Plang"
            if ( isDivisibleBySeven(num) ) ret += "Plong"
        }

        ret
    }

    private

    Boolean isDivisibleByThree(num) {
        num % 3 == 0
    }
    Boolean isDivisibleByFive(num) {
        num % 5 == 0
    }
    Boolean isDivisibleBySeven(num) {
        num % 7 == 0
    }
    Boolean isDivisableByThreeFiveOrSeven(num) {
        isDivisibleByThree(num) || num % 5 == 0 || num % 7 == 0
    }
}
