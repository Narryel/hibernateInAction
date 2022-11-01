package ru.narryel.hibernateinaction.domain.entity

import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "documents")
data class Document(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Enumerated(EnumType.STRING)
    val type: DocumentType,

    val number: Int,

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    val person: Person?,
)

enum class DocumentType {
    PASSPORT, DRIVER_LICENCE
}
