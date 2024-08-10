package indi.stream.learnmybatisplus

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import indi.stream.learnmybatisplus.mapper.PersonMapper
import indi.stream.learnmybatisplus.pojo.Person
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class LearnMyBatisPlusApplicationTests {

    @Autowired
    lateinit var personMapper: PersonMapper

    @Test
    fun selectAll() {
        val persons = personMapper.selectList(null)
        persons.forEach { println(it) }
    }

    @Test
    fun insert() {
        val person = Person("Alice", 18,1)
        personMapper.updateById(person)
    }

    @Test
    fun selectByWrapper() {
        val person = personMapper.selectList(QueryWrapper<Person>().eq("age", 18))
        println(person)
    }

    @Test
    fun selectByMap() {
        val person = personMapper.selectByMap(mapOf("age" to 18))
        println(person)
    }

    @Test
    fun deleteByMap() {
        val result = personMapper.deleteByMap(mapOf("age" to 18))
        println(result)
    }
}
