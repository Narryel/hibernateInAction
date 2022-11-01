package ru.narryel.hibernateinaction.domain.entity

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Embeddable
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

    //TODO override toString to prevent stack overflow
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String,
    var surname: String,
    var age: Int,
    @Enumerated(EnumType.STRING)
    var sex: Sex,

    @OneToMany(mappedBy = "person")
    val documents: MutableList<Document>,

    val phone: String,
    val workPhone: WorkPhone,
)

@Embeddable
@AttributeOverrides(
    AttributeOverride(name = "phone", column = Column(name = "work_phone"))
)
data class WorkPhone(
    val phone: String,
    @Column(name = "local_code")
    val localCode: String,
)

@Embeddable
data class Address(
    private val city: String,
    private val street: String,
    private val houseNum: Int,
)

enum class Sex {
    M, F
}

