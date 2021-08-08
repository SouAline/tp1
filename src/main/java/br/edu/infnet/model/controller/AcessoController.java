package br.edu.infnet.model.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Aluno;

public class AcessoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AcessoController() {
        super();
            }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("login.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email= request.getParameter("email");
		String senha= request.getParameter("senha");
		
		if(email.equals(senha)) {
			request.getRequestDispatcher("home.html").forward(request, response);
		}{
			
			PrintWriter out= response.getWriter();
			out.println(
			
					"<html>" +
					"<head>" +
					"<meta charset= \"ISO-8859-1\">" + 
					"<title>TP1</title>" +
					"<link rel=\"stylesheet\" href=\"css/meuestilo.css\">" + 
					"</head>" +
					"<body>" +
					"\r\n" +
					"<a href='aluno'>Voltar</a>\r\n" +
					"<h2>Autenticação inválida para o usuário " + email + "!!</h2>" +
					"</body>" +
					"</html>");
		}

	}

}
