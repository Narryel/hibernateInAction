package ru.narryel.hibernateinaction.domain.dao

import org.hibernate.SessionFactory
import org.springframework.stereotype.Component
import ru.narryel.hibernateinaction.domain.entity.Person

@Component
class PersonDao(
    private val sessionFactory: SessionFactory,

    ) {
    fun savePerson(person: Person): Person {
        val currentSession = sessionFactory.openSession()
        currentSession.beginTransaction()
        currentSession.persist(person)
        currentSession.transaction.commit()
        currentSession.close()

        // TODO персистнутая ли возвращаяется?
        return person
    }

    fun getPerson(personId: Long): Person {
        val session = sessionFactory.openSession()
        val person = session.get(Person::class.java, personId)
        person.documents.size
        session.close()
        return person
    }
}
