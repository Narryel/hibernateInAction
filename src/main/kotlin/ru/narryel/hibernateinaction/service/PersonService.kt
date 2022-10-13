package ru.narryel.hibernateinaction.service

import org.hibernate.SessionFactory
import org.springframework.stereotype.Service
import ru.narryel.hibernateinaction.domain.dto.PersonDto
import ru.narryel.hibernateinaction.domain.entity.Person

@Service
class PersonService(
    private val sessionFactory: SessionFactory,
) {

    fun createPerson(personDto: PersonDto) {
        val currentSession = sessionFactory.openSession()
        currentSession.beginTransaction()
        currentSession.persist(personDto.toEntity())
        currentSession.transaction.commit()
        currentSession.close()
    }

    fun getPerson(personId: Long): Person {
        val session = sessionFactory.openSession()

        return session.get(Person::class.java, personId).also {
            session.close()
        }
    }
}

private fun PersonDto.toEntity() = Person(
    name = name,
    surname = surname,
    age = age,
    sex = sex
)
