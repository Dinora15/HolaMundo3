package unedMasterJavaServletUsuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ErrorSesion
 */
public class ErrorSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorSesion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter salida=response.getWriter();
		salida.println("<html>");
		salida.println("<body>");
		salida.println("<h1 style='text-aligne:center'>Error en inicio de Sesion");
		salida.println("</h1>");
		salida.println("<br>");
		salida.println("<a href='index.html'>Iniciar</a>");
		
		salida.println("</body>");
		salida.println("</html>");
	}
	}


