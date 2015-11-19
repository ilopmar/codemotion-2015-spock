package codemotion2015

import spock.lang.Specification

class E3_Groovy extends Specification {

    void 'should add an element to a list'() {
        given:
            def numbers = DataHelper.someFibonacciNumbers()

        when:
            numbers << 21 // same as: numbers.add(21)

        then:
            numbers.contains(21)
    }

    void 'should make some assertions in elements in a list'() {
        when:
            def persons = DataHelper.makePersonList()

        then:
            persons.size() == 4
            persons.name == ['Sheldon', 'Leonard', 'Rajesh', 'Howard']
            persons.name.sort() == ['Howard', 'Leonard', 'Rajesh', 'Sheldon']
            persons.lastName.collect { it.size() } == [6, 10, 12, 8]
            persons.name.min { it.length() } == 'Rajesh'
    }

    void 'should remove an element from a map'() {
        given:
            def map = DataHelper.makePersonMap()

        when:
            map.remove('name')

        then:
            map.size() == 2
            !map.keySet().contains('name')
            map.lastName == 'López'
            map.get('lastName') == 'López'
            map['lastName'] == 'López'
            map.age == 35
    }

}
