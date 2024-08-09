package indi.stream.learnmybatisplus.pojo

import com.baomidou.mybatisplus.extension.activerecord.Model

class Person(
    var name: String,
    var age: Int,
): Model<Person>()
