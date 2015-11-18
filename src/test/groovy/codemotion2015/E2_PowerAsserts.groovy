package codemotion2015

import spock.lang.Ignore
import spock.lang.Specification

@Ignore("Comment this annotation to check the errors")
class E2_PowerAsserts extends Specification {

    void 'should fail with string'() {
        expect:
            'Hello Codemotion!'.reverse() == 'ointmodeoC olleH'
    }

    void 'should fail with maps and lists'() {
        given:
            def data = [
                name  : 'Iván', age: 35,
                childs: [
                    [name: 'Judith', age: 8], [name: 'Adriana', age: 5]
                ]
            ]

        expect:
            data.childs.name.first() == 'Adriana'
    }

}
