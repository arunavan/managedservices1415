package com.ms;
	import java.util.ArrayList;  
	import java.util.List;  
	  
	// ToDoBusiness is a SUT (system under test)   
	// ToDoService is a Dependency (as ToDoBusiness is dependent on it)  
	  
	public class TodoBusiness {  
	  
	    public ToDoService doService;  
	  
	    public TodoBusiness(ToDoService doService) {  
	        this.doService = doService;  
	    }  
	      
	public void deleteTodosNotRelatedToHibernate(String user) {  
	          
	        List<String> Combinedlist = doService.getTodos(user);  
	          
	        for(String todos:Combinedlist) {  
	            if(!todos.contains("Hibernate"))   
	            {  
                doService.deleteTodos(todos);  
	            }  
        }  
	    }  
	 }  
