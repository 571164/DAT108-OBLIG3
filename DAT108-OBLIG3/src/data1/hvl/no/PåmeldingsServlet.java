package data1.hvl.no;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PåmeldingsServlet")
public class PåmeldingsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		Mer???
//				plukke opp data og feilmeldinger
//
//				forward til WEB-INF/paamelding.jsp

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		hente alle parametrene OK
//		i et Deltager- objekt i stedet for 
//
//		validere alle parametrene?
//		ValideringUtil.alleErGyldig() ?
//
//		if (!alleErGyldige || erPaameldtFraFor()) {
//
//			gjøre klar feilmelldinger ++ ???
//
//			Hovedide: Ha en klasse kalt Deltagerskjema:
//			-fornavn
//			-fornavnfeilmelding
//			-etternavn
//			-kjønn
//
//
//
//			redirect til seg selv
//
//		} else {
//
//			generere passordsalt
//			hashe inntastet passord
//			
//			Ha det om et deltagerobjekt
//
//			melde på festen  (hva gjør man ved expetion?)
//			): registrere i databasen
//
//			logge inn
//			InnloggingsUtil...
//
//			redirect til bekreftelse
//
//
//		}

	}

}
