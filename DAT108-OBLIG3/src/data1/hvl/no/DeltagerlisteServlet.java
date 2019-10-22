package data1.hvl.no;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeltagerlisteServlet")
public class DeltagerlisteServlet extends HttpServlet {
	
//	@EJB
//	DeltagerEAO deltagerEAO;
	
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		TODO sjekk om innlogget
//		if !(InnloggingUtil.erInnlogget()) {
//
//			redirect til /innlogging med feilmelding
//
//		} else {
//
//		deltagerEAO.hentUtAlleDeltagerne
//
//		TODO sortering?
//		
//
//		TODO formatering?
//
//
//
//		ta vare på deltagerliste i request-scope
//
//		// Vise frem data fra databasen
//		forward til WEB-INF/deltagerliste.jsp
//
//		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
