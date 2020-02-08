package com.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Beans.Products;


public class productDao {
	JdbcTemplate template;  
	
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	
	public List<Products> getEmployees(){  
	    return template.query("select * from user_data.usr_data",new RowMapper<Products>(){  
	        public Products mapRow(ResultSet rs, int row) throws SQLException {  
	        	Products e=new Products();  
	            e.setId(rs.getInt(1));  
	            e.setName(rs.getString(2));  
	            e.setPass(rs.getString(3));
	            e.setEmail(rs.getString(4));
	            return e;  
	        }  
	    });  
	}  

}
