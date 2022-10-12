package com.servlets.mvc.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.servltes.mvc.model.AverageCalculator;

/**
 * Servlet implementation class AverageController //Controller
 */
@WebServlet("/averageController")
public class AverageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));

		AverageCalculator model = new AverageCalculator();
		int result = model.calculate(num1, num2);

		request.setAttribute("result", result);

		// Final step
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);

//		doGet(request, response);
	}

}
