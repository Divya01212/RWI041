package com.springjdbc.dao;



import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.entity.Employee;


public class EmployeeDao implements EmployeeDaoImp {
    private JdbcTemplate jdbcTemplate;

    @Override
	public int insert(Employee employee) {
		//insert query
		String query = "insert into employee(id ,ename,city) values(?,?,?)";
		int r= this.jdbcTemplate.update(query,employee.getId(),employee.getEname(),employee.getCity());
		return r;
	}


    public int update(Employee employee) {
        String query = "UPDATE Student SET ename = ?, address = ? WHERE id = ?";
        return this.jdbcTemplate.update(query, employee.getId(), employee.getEname(), employee.getCity());
    }

    public boolean exists(int id) {
        String query = "SELECT COUNT(*) FROM Student WHERE id = ?";
        Integer count = jdbcTemplate.queryForObject(query, new Object[]{id}, Integer.class);
        return count != null && count > 0;
    }
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

   

    
}


	
	



