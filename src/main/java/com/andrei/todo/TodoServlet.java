package com.andrei.todo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andrei.login.LoginService;
import com.andrei.todo.Todo;
import com.andrei.todo.TodoService;


@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet {
	
	private TodoService todoService = new TodoService();
	 
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

		    	   req.setAttribute("todos",todoService.retrieveTodos());
		    	   
		    	   req.getRequestDispatcher("/WEB-INF/view/todo.jsp").forward(req, resp);
		       
		    }
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		    	   
		    	  Todo todo = new Todo( req.getParameter("todo"));
		    	  
		    	  todoService.addTodo(todo);
		    	
		    	  resp.sendRedirect("/todo.do");
		       
		    }

	

}
