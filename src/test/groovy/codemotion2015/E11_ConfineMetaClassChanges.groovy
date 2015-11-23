package codemotion2015

import spock.lang.Specification
import spock.util.mop.ConfineMetaClassChanges

class E11_ConfineMetaClassChanges extends Specification {

    @ConfineMetaClassChanges(String)
    void 'should have sayHi method on String'() {
        given:
            String.metaClass.sayHi = { -> "Hi ${delegate}" }

        expect:
            "Codemotion".sayHi() == 'Hi Codemotion'
    }

    void 'should not have sayHi method on String'() {
        when:
            "Codemotion".sayHi()

        then:
            thrown MissingMethodException
    }

}
