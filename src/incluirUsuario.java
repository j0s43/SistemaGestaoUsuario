

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;

/**
 * Servlet implementation class incluirUsuario
 */
@WebServlet("/incluirUsuario")
public class incluirUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public incluirUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		 Usuario usuario= new Usuario (request.getParameter("nome"),
							           request.getParameter("sobrenome"), 
							           request.getParameter("CPF"), 
							           request.getParameter("bday"), 
							           request.getParameter("email"), 
							           request.getParameter("gender"));
		 
		 out.println("<html>"
				 	+"<head></head>"
				 +"<body>"
				 	+"<h1>" + usuario.getNome() + " " + usuario.getSobrenome() + " Seu cadastro foi realizado com succeso!</h1></br>"
				 			+ "<a href=\"formulario.html\">Cadastra novo Usuario</a>"
				 +"</body>"
		 		+ "</html>");
	}

}
