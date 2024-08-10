package indi.stream.learnmybatisplus.pojo

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import com.baomidou.mybatisplus.extension.activerecord.Model
import indi.stream.learnmybatisplus.annotation.NoArg

@NoArg
@TableName("persons")
data class Person(
    var name: String,
    var age: Int,
    @TableId(type = IdType.AUTO)
    var id: Int = 0,
) : Model<Person>() {
}
