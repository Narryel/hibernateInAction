package ru.narryel.hibernateinaction.domain.entity

import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "persons")
data class Person(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String,
    var surname: String,
    var age: Int,
    @Enumerated(EnumType.STRING)
    var sex: Sex,

    @OneToMany(mappedBy="person")
    val documents: MutableList<Document>
)

enum class Sex {
    M, F
}

