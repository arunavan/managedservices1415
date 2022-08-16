package com.ms;

import java.util.List;

public interface ToDoService {  
	   
	    public List<String> getTodos(String user);  
	    public void deleteTodos(String doString);   
	 }  

