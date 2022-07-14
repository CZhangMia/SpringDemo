package com.example.demo1.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo1.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository("oracle")
public class FakeEmployeeDataAccessService implements EmployeeDao{
	private static List<Employee> DB = new ArrayList<>();
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Employee> run(String... args) throws Exception {
        String sql = "SELECT * FROM PERMIT_USERS";
//        System.out.println(sql);
        List<Employee> emps = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int row) throws SQLException {
//            	System.out.println(rs.getString("USER_NAME") + " " + rs.getString("PWD") + " " + rs.getString("STATUS") + " " + rs.getString("NAME") + " " + rs.getInt("ACCESS_LEVEL") + " " + rs.getString("EMAIL") + " " + rs.getString("TEAM"));
            	Employee emp = new Employee(rs.getString("USER_NAME"), rs.getString("PWD"), rs.getString("STATUS"), rs.getString("NAME"), rs.getInt("ACCESS_LEVEL"), rs.getString("EMAIL"),rs.getString("TEAM"));
                
                return emp;
            }
        });
        
//        emps.forEach(System.out :: println);
        return emps;
    }
	
//	@Override
//	public int insertEmployee(S id, Employee em)
//	{
//		DB.add(new Employee(id, em.getName()));
//		return 1;
//	}
	
	@Override
	public List<Employee> selectAllEmployee() {
		System.out.println("I am here ad dao");
		List<Employee> res = new ArrayList<>();
		try {
			 res =  run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(res.size());
		return res;
	}

//	@Override
//	public Optional<Employee> selectEmployeeById(UUID id) {
//		return DB.stream()
//				.filter(employee -> employee.getNumber().equals(id))
//				.findFirst();
//	}
//
//	@Override
//	public int deleteEmployeeById(UUID id) {
//		Optional<Employee> emp = selectEmployeeById(id);
//		if (!emp.isPresent())
//		{
//			return 0;
//		}
//		DB.remove(emp.get());
//		return 1;
//	}
//
//	@Override
//	public int updateEmployeeById(UUID id, Employee emp) {
//		return selectEmployeeById(id)
//				.map(p -> {
//					int indexOfEmployee = DB.indexOf(p);
//					if (indexOfEmployee >= 0)
//					{
//						DB.set(indexOfEmployee, new Employee(id, emp.getName()));
//						return 1;
//					}
//					return 0;
//				})
//				.orElse(0);
//	}

}
