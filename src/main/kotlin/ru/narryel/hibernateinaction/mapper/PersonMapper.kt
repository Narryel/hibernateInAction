package ru.narryel.hibernateinaction.mapper

import org.mapstruct.Mapper
import ru.narryel.hibernateinaction.domain.dto.PersonDto
import ru.narryel.hibernateinaction.domain.dto.WorkPhoneDto
import ru.narryel.hibernateinaction.domain.entity.Person
import ru.narryel.hibernateinaction.domain.entity.WorkPhone

@Mapper(componentModel = "spring")
abstract class PersonMapper {

    abstract fun toEntity(dto: PersonDto): Person

    abstract fun toDto(entity: Person): PersonDto

    abstract fun toDto(workPhone: WorkPhone): WorkPhoneDto
}