package dam2.dii.p11;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/procesador2")
public class Procesador2 extends HttpServlet {											//servlet 
	private static final long serialVersionUID = 1L;
   
	
	
    public Procesador2() {
        super();           //constructor vacio
        
    }

	public void init() throws ServletException {       //incializamos
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);							//de doget a dopost directo
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");					//recoge nombre y claves del index
        String pass1 = request.getParameter("pass1");
        String pass2 = request.getParameter("pass2");
		        
        if(nombre.isEmpty() || pass1.isEmpty() || pass2.isEmpty()) {						//si esta vacio lo deja en null
        	
        	nombre = null;
        	pass1= null;
        	pass2 = null;
        	
        	request.setAttribute("mensaje", "NO PUEDE HABER CAMPOS VACIOS");				//envia mensaje al index de que no estan campos rellenados
        	request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
        else {
        
		        Usuario user = new Usuario(nombre, pass1, pass2);		//crea un obketo usuario con los atributos que se recogen desde el form del index
		        
		        user.setNombre(nombre);
		        user.setPass1(pass1);
		        user.setPass2(pass2);
		        
		        
		        if ( user.getPass1().equals(user.getPass2() ) ){					//si las claves  coinciden devuelve el objeto a la vista salida
		        	
		        	request.setAttribute("nuevo", user);
		        	request.getRequestDispatcher("salida.jsp").forward(request, response);
		        }
		        
		        else {
		        	
		        	request.setAttribute("mensaje", "NO COINCIDEN LAS CLAVES");					//si las claves no coinciden devuelve el mensaje al index
		        	request.getRequestDispatcher("index.jsp").forward(request, response);
		        }
		        
		}
	
	}

}
