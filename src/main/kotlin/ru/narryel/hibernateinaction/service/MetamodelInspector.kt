package ru.narryel.hibernateinaction.service

import org.hibernate.SessionFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class MetamodelInspector(
    private val sessionFactory: SessionFactory,

    ) : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("------------------------------------------------------------")
        val metamodel = sessionFactory.metamodel
        val managedTypes = metamodel.managedTypes
        println("Hibernate found ${managedTypes.size} entities")
        println("Hibernate found entities with names ${metamodel.entities.joinToString { it.name }}")
        println("------------------------------------------------------------")
    }
}