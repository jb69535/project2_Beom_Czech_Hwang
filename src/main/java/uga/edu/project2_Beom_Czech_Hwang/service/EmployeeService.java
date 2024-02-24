// EmployeeService.java

package uga.edu.project2_Beom_Czech_Hwang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;

import uga.edu.project2_Beom_Czech_Hwang.model.DepartmentRatio;

import java.util.List;

@Service
public class EmployeeService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<DepartmentRatio> getQuery1Results() throws IOException {
        String sql = new String(StreamUtils.copyToByteArray(
                new ClassPathResource("problem1.sql").getInputStream()), StandardCharsets.UTF_8);

        return jdbcTemplate.query(sql, (rs, rowNum) -> new DepartmentRatio(
            rs.getString("dept_name"),
            rs.getDouble("ratio")
        ));
    }
}
