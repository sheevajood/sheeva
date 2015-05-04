package com.secret;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class seceret
 */
@WebServlet("/seceret")
public class Secret extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Secret() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// reading the user input
        String numberStr = request.getParameter("num");
        if(numberStr != null){
        	int num = new Integer(numberStr);
	        SecretFactory fc = new SecretFactory();
	        //gets the interface 
			SecretInterface intf = fc.getTestInterface(num);	
			boolean additive = true;
			if(intf != null){
				//gets all the prime numbers
				List<Integer> primNumbers = new SecretManager().getPrimeNumber(num);			
				for(Integer i: primNumbers){
					for(Integer j: primNumbers){
						// check if the secret method is additive
						if(intf.secret(i + j) != intf.secret(i) + intf.secret(j)){
							additive = false;
							break;
						}
					}
				}
			}
			//set the message 
			if(additive){
				request.setAttribute("message", "The secret Function is additive");
			}else{
				request.setAttribute("message", "The secret Function is not additive");
			}
        }else{
        	request.setAttribute("message", "Number is invalid");
        }
        //forward the message to the user
		request.getRequestDispatcher("/secretResult.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
