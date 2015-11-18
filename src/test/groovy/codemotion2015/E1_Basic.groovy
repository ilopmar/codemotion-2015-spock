package codemotion2015

import spock.lang.Specification

class E1_Basic extends Specification {

    void 'should reverse a string'() {
        given: 'a string'
            def myString = 'Hello Codemotion!'

        when: 'reversing it'
            def reversed = myString.reverse()

        then: 'it is reversed'
            reversed == '!noitomedoC olleH'
    }

    void 'should reverse a string (II)'() {
        expect:
            'Hello Codemotion!'.reverse() == '!noitomedoC olleH'
    }

}
