package codemotion2015

import spock.lang.Specification

class E10_Old extends Specification {

    void 'should increase the size of the list when adding a number'() {
        given:
            def numbers = [1, 1, 2, 3, 5, 8, 13]

        when:
            numbers << 21

        then:
            numbers.size() == old(numbers.size()) + 1
   }
}
