package ru.narryel.hibernateinaction.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.narryel.hibernateinaction.domain.dto.PersonDto
import ru.narryel.hibernateinaction.service.PersonService
import javax.websocket.server.PathParam

@RestController
@RequestMapping("persons")
class PersonController(
    private val personService: PersonService,
) {
    @GetMapping("/{id}")
    fun getPerson(@PathParam("id") personId: Long) = personService.getPerson(personId)

    @PostMapping
    fun createPerson(@RequestBody personDto: PersonDto) = personService.createPerson(personDto)
}