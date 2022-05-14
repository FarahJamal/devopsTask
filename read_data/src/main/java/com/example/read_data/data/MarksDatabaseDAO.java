package com.example.read_data.data;

import com.example.read_data.model.Marks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Repository
@Profile("database")
public class MarksDatabaseDAO implements MarksDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MarksDatabaseDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public Marks add(Marks marks) {
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        final String sql = "INSERT INTO marks (student_roll, course_id,mark,course_name,instructor)  VALUES(?,?,?,?,?);";
        try {
            jdbcTemplate.update((Connection conn) -> {
                PreparedStatement statement = conn.prepareStatement(
                        sql,
                        Statement.RETURN_GENERATED_KEYS);

                statement.setLong(1, marks.getStudentRoll());
                statement.setLong(2, marks.getCourse_id());
                statement.setInt(3, marks.getMark());
                statement.setString(4,marks.getCourseName());
                statement.setString(5,marks.getInstructor());


                return statement;

            }, keyHolder);
        } catch (Exception ex) {
            System.out.println("error " + ex.getMessage());

        }

        return marks;
    }
    @Override
    public List<Marks> getMarkByCourse(String courseName) {
        final String sql = "SELECT * FROM marks WHERE course_name=?";

        return jdbcTemplate.query(sql, new MarksDatabaseDAO.MarksMapper(), courseName);    }


    private static final class MarksMapper implements RowMapper<Marks> {

        @Override
        public Marks mapRow(ResultSet rs, int index) throws SQLException {
            Marks td = new Marks();
            td.setCourseName(rs.getString("course_name"));
            td.setStudentRoll(rs.getLong("student_roll"));
            td.setInstructor(rs.getString("instructor"));
            td.setCourse_id(rs.getLong("course_id"));
            td.setMark(rs.getInt("mark"));
            return td;
        }
    }
}
