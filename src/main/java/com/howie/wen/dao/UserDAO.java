package com.howie.wen.dao;

import com.howie.wen.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author:HowieLee
 * @Date:1/6/2019
 * @Description:com.howie.wenda.dao
 * @version:1.0
 */
@Mapper
@Component
@Repository
public interface UserDAO {
    // 注意空格
    String TABLE_NAME = "user";
    String INSET_FIELDS = " name, password, salt, head_url";
    String SELECT_FIELDS = " id, name, password, salt, head_url";

//    @Insert({"insert into ", TABLE_NAME, "(", INSET_FIELDS,
//            ") values (#{name},#{password},#{salt},#{headUrl})"})
    @Insert({"insert into user(name, password, salt, head_url) " +
            "values (#{name},#{password},#{salt},#{headUrl})"})
    int addUser(User user);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where id=#{id}"})
     User selectById(int id);

    @Update({"update ", TABLE_NAME, " set password=#{password} where id=#{id}"})
    void updatePassword(User user);

    @Delete({"delete from ", TABLE_NAME, " where id=#{id}"})
    void deleteById(int id);



}
