package indi.stream.learnmybatisplus.pojo

import com.baomidou.mybatisplus.annotation.TableName
import com.baomidou.mybatisplus.extension.activerecord.Model

@TableName("persons")
class Person(
    var name: String,
    var age: Int,
): Model<Person>()
