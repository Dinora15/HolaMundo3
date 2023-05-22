package unedMasterJavaServletUsuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import unedMasterJavaUsuario.Usuario;

import java.io.IOException;
import unedMasterJavaUsuario.Usuario;
/**
 * Servlet implementation class ServletUsuario
 */
@WebServlet("/usuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre = request.getParameter("nombre").toString();
		String apellido = request.getParameter("apellido").toString();
		
		if(nombre.equalsIgnoreCase("dinora")) {
			if(apellido.equalsIgnoreCase("olivares")) {
				
				Usuario usuario=new Usuario(nombre,apellido);
				
				HttpSession misession=request.getSession();
				misession.setAttribute("usuario", usuario);
				
				request.getRequestDispatcher("VerUsuario").forward(request, response);	
	
			}else {
				request.getRequestDispatcher("ErrorSesion").forward(request, response);
				}
			}else {
				request.getRequestDispatcher("ErrorSesion").forward(request, response);
				}
	}
	}


