class Raindrops {

    String convert(num) {
        String raindrops =  ""

        if ( isDivisibleByThree(num) ) raindrops += "Pling"
        if ( isDivisibleByFive(num) ) raindrops += "Plang"
        if ( isDivisibleBySeven(num) ) raindrops += "Plong"
        raindrops ?: num
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
}
