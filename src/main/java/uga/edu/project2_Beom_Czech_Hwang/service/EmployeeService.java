package uga.edu.project2_Beom_Czech_Hwang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<String> getDepartmentsWithMaxGenderSalaryRatio() {
        String sql = "YOUR_SQL_QUERY_HERE";
        return jdbcTemplate.query(sql, (rs, rowNum) -> rs.getString("COLUMN_NAME"));
    }
}
