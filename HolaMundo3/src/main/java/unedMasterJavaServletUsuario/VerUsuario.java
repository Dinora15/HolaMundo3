package unedMasterJavaServletUsuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import unedMasterJavaUsuario.Usuario;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class VerUsuario
 */
public class VerUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession misession= (HttpSession) request.getSession();
		Usuario usuario= (Usuario) misession.getAttribute("usuario");
		PrintWriter salida= response.getWriter();
		salida.println("<html>");
		salida.println("<body>");
		salida.println("<h1 style='text-aligne:center'>Hola Mundo");
		
		salida.println("</h1>");
		salida.println("<h3 style='text-aligne:center'>Bienvenido " + usuario.getNombre() + " " + " "+ usuario.getApellido()+ "</h3>");			
			
        salida.println("<br>");
	    salida.println("Fecha y Hora actual:"+ new Date());
	    salida.println("<br>");
	    salida.println("<br>");
	    salida.println("<a href='cerrarSesion'>Cerrar Sesion</a>");
	    salida.print("</body>");
	    salida.print("</html>");
	    salida.close();
	}
	}


