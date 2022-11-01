package ru.narryel.hibernateinaction.service

import org.springframework.stereotype.Service
import ru.narryel.hibernateinaction.domain.dao.PersonDao
import ru.narryel.hibernateinaction.domain.dto.PersonDto
import ru.narryel.hibernateinaction.mapper.PersonMapper

@Service
class PersonService(
    private val mapper: PersonMapper,
    private val personDao: PersonDao,
) {

    fun createPerson(personDto: PersonDto) {
        personDao.savePerson(mapper.toEntity(personDto))
    }

    fun getPerson(personId: Long): PersonDto = mapper.toDto(personDao.getPerson(personId))
}
