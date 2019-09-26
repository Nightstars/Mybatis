package com.christ.spring_jdbc_mybatis.dao;

import com.christ.spring_jdbc_mybatis.pojos.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Data
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void save(User user){
        String sql="insert users(name,password,age,birthday) values(?,?,?,?)";
        jdbcTemplate.update(sql,user.getName(),user.getPassword(),user.getAge(),user.getBirthday());
    }
    public void update(User user){
        String sql="update  users set name=?,password=?,age=?,birthday=? where id =?";
        jdbcTemplate.update(sql,user.getName(),user.getPassword(),user.getAge(),user.getBirthday(),user.getId());
    }
    public void delete(int id){
        String sql="delete from users where id=?";
        jdbcTemplate.update(sql,id);
    }
    public User getUserById(int id){
        String sql="select * from users where id=?";
        User user= (User) jdbcTemplate.queryForObject(sql,new UserRowMapper(),id);
        return user;
    }
    public List getAll(){
        String sql="select * from users";
        return jdbcTemplate.query(sql,new UserRowMapper());
    }

}
class UserRowMapper implements RowMapper{
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user=new User(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getString("password"),
                resultSet.getInt("age"),
                resultSet.getDate("birthday")
        );
        return user;
    }
}
