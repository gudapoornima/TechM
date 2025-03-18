package org.TechM;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.util.List;

public class StudentDao {
    private JdbcTemplate jdbcTemplate;

    // Setter method for JdbcTemplate
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Insert student details
    public void saveStudent(Student s) {
        String query = "Insert into student ('"+s.getId()+"','"+s.getName()+"','"+s.getAge()+"')";
        System.out.println("Student details added successfully!");
    }

    // Method to update student details
    public void updateStudent(Student s) {
    	String query = "Update into student ('"+s.getId()+"','"+s.getName()+"','"+s.getAge()+"')";
        System.out.println("Updated Student details successfully!");
   
    }

    // Method to delete a student
    public void deleteStudent(int id) {
        String query = "DELETE FROM student WHERE id = ?";
        jdbcTemplate.update(query, id);
        System.out.println("Student deleted successfully!");
    }

    // Method to get a student by id
    public Student getStudentById(int id) {
        String query = "SELECT * FROM student WHERE id = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{id}, new RowMapper<Student>() {
            @Override
            public Student mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
                return new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"));
            }
        });
    }

    // Method to get all students
    public List<Student> getAllStudents() {
        String query = "SELECT * FROM student";
        return jdbcTemplate.query(query, new RowMapper<Student>() {
            @Override
            public Student mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
                return new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"));
            }
        });
    }
}
