package be.vdab.servlets.docenten;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.vdab.services.DocentService;

@WebServlet("/docenten/zoeken.htm")
public class ZoekenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "/WEB-INF/JSP/docenten/zoeken.jsp";
	public static final String REDIRECT_URL = "%s/docenten/zoeken.htm?id=%d";
	private final transient DocentService docentService = new DocentService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getQueryString() != null) {
			try {
				request.setAttribute("docent", docentService.read(Long.parseLong(request.getParameter("id"))));
			} catch (NumberFormatException ex) {
				request.setAttribute("fouten", Collections.singletonMap("id", "tik een getal"));
				// singletonMap maakt intern een Map met één entry (key=id,
				// value=tik een getal) en geeft die Map terug als returnwaarde
			}
		}
		request.getRequestDispatcher(VIEW).forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long id = Long.parseLong(request.getParameter("id"));
		String bijnaam = request.getParameter("bijnaam");
		if (bijnaam == null || bijnaam.isEmpty()) {
			request.setAttribute("fouten", Collections.singletonMap("bijnaam", "verplicht"));
			request.setAttribute("docent", docentService.read(id));
			request.getRequestDispatcher(VIEW).forward(request, response);
		} else {
			docentService.bijnaamToevoegen(id, bijnaam);
			response.sendRedirect(
					response.encodeRedirectURL(String.format(REDIRECT_URL, request.getContextPath(), id)));
		}
	}
}
