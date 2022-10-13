package ru.narryel.hibernateinaction.domain.dto

import ru.narryel.hibernateinaction.domain.entity.Sex

data class PersonDto(
    var id: Long?,
    var name: String,
    var surname: String,
    var age: Int,
    var sex: Sex,
)
