// EmployeeService.java

package uga.edu.project2_Beom_Czech_Hwang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;

import uga.edu.project2_Beom_Czech_Hwang.model.Query1;
import uga.edu.project2_Beom_Czech_Hwang.model.Query2;
import uga.edu.project2_Beom_Czech_Hwang.model.Query3;

import java.util.List;

@Service
public class EmployeeService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    // Query1
    public List<Query1> getQuery1Results() throws IOException {
        String sql = new String(StreamUtils.copyToByteArray(
                new ClassPathResource("problem1.sql").getInputStream()), StandardCharsets.UTF_8);

        return jdbcTemplate.query(sql, (rs, rowNum) -> new Query1(
            rs.getString("dept_name"),
            rs.getDouble("ratio")
        ));
    }
    // Query2
    public List<Query2> getQuery2Results() throws IOException {
        String sql = new String(StreamUtils.copyToByteArray(
                new ClassPathResource("problem2.sql").getInputStream()), StandardCharsets.UTF_8);

        return jdbcTemplate.query(sql, (rs, rowNum) -> new Query2(
            rs.getString("full_name"),
            rs.getString("dept_name"),
            rs.getInt("how_long")
        ));
    }
    // Query3
    public List<Query3> getQuery3Results() throws IOException {
        String sql = new String(StreamUtils.copyToByteArray(
                new ClassPathResource("problem3.sql").getInputStream()), StandardCharsets.UTF_8);

        return jdbcTemplate.query(sql, (rs, rowNum) -> new Query3(
            rs.getString("dept_no"),
            rs.getString("dept_name"),
            rs.getInt("decade_start"),
            rs.getInt("number_of_employees"),
            rs.getDouble("average_salary")
        ));
    }
}
