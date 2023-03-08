package gerenciador;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaEmpresas")

public class ListaEmpresaServlet {
	private static final long serialVersionUID =1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
	Banco banco = new Banco();
	List<Empresa> lista =banco.getEmpresa();
	PrintWriter out =response.getWriter();
	out.println("<html><body>");
	out.println("<url>");
	for(Empresa empresa:lista) {
		out.println("<li>"+empresa.getNome()+"</li>");
	}
	out.println("</url>");
	out.println("</body></html>");
	}
}
