package indi.stream.learnmybatisplus

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@MapperScan("indi.stream.learnmybatisplus.mapper")
@SpringBootApplication
class LearnMyBatisPlusApplication

fun main(args: Array<String>) {
    runApplication<LearnMyBatisPlusApplication>(*args)
}
