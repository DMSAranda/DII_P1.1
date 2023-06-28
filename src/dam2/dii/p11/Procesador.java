package dam2.dii.p11;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/procesador")
public class Procesador extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	
    public Procesador() {
        super();
        
    }

	public void init() throws ServletException {
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
        String pass1 = request.getParameter("pass1");
        String pass2 = request.getParameter("pass2");
        															//igual que el procesador2 pero en este caso envia a dos vistas diferentes
        Usuario user = new Usuario(nombre, pass1, pass2);
        
        user.setNombre(nombre);
        user.setPass1(pass1);
        user.setPass2(pass2);
        
        
        if ( user.getPass1().equals(user.getPass2() ) ){
        	
        	request.setAttribute("nuevo", user);
        	request.getRequestDispatcher("salida.jsp").forward(request, response);
        }
        
        else {
        	
        	request.setAttribute("nuevo", user);
        	request.getRequestDispatcher("salida2.jsp").forward(request, response);  
        	
        	
        }
	
	}

}
