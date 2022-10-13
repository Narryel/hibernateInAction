package ru.narryel.hibernateinaction.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.datasource.DriverManagerDataSource
import org.springframework.orm.hibernate5.HibernateTransactionManager
import org.springframework.orm.hibernate5.LocalSessionFactoryBean
import ru.narryel.hibernateinaction.domain.entity.EntityPackageMarker
import java.util.Properties
import javax.sql.DataSource

@Configuration
class DatasourceConfiguration {

    @Bean
    fun datasource(properties: DatabaseProperties): DataSource = DriverManagerDataSource(
        properties.jdbcUrl,
        properties.username,
        properties.password
    )

    @Bean
    fun sessionFactory(dataSource: DataSource) = LocalSessionFactoryBean().apply {
        hibernateProperties = hibernateProperties()
        setDataSource(dataSource)
        setPackagesToScan(EntityPackageMarker::class.java.packageName)
    }

    @Bean
    fun hibernateTransactionManager(sessionFactory: LocalSessionFactoryBean) = HibernateTransactionManager().apply {
        this.sessionFactory = sessionFactory.`object`
    }

    fun hibernateProperties() = Properties().apply {
        put("hibernate.show_sql", true)
        put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL9Dialect")
        put("hibernate.hbm2ddl.auto", "create-drop")
    }
}