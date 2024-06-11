package kr.ac.kumoh.ce.s20220242.mysqldb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MysqldbApplication

fun main(args: Array<String>) {
    runApplication<MysqldbApplication>(*args)
}
