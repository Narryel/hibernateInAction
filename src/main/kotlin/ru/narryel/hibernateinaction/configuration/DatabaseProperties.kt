package ru.narryel.hibernateinaction.configuration

import org.jetbrains.annotations.NotNull
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated

@Validated
@Component
@ConfigurationProperties(prefix = "datasource")
class DatabaseProperties {

    @NotNull
    lateinit var host: String

    @NotNull
    lateinit var port: String

    @NotNull
    lateinit var databaseName: String

    @NotNull
    lateinit var jdbcUrl: String

    @NotNull
    lateinit var username: String

    @NotNull
    lateinit var password: String
}