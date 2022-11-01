package ru.narryel.hibernateinaction.domain.dto

import ru.narryel.hibernateinaction.domain.entity.Sex
import ru.narryel.hibernateinaction.domain.entity.WorkPhone

data class PersonDto(
    var id: Long?,
    var name: String,
    var surname: String,
    var age: Int,
    var sex: Sex,
    var documents: List<DocumentDto>,
    var phone: String,
    var workPhone: WorkPhoneDto,
)

data class WorkPhoneDto(
    val phone: String,
    val localCode: String,
)