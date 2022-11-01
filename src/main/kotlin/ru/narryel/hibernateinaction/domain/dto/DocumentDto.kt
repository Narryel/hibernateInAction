package ru.narryel.hibernateinaction.domain.dto

import ru.narryel.hibernateinaction.domain.entity.DocumentType

data class DocumentDto(
    val id: Long?,
    val type: DocumentType,
    val number: Int,
)
