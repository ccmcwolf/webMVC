package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import bo.Customer;
import model.CustomerModel;
import model.impl.CustomerModelImpl;

/**
 * Servlet implementation class AddCustomerServlet
 */
@WebServlet("/AddCustomerServlet")
public class AddCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/thogakade")
	private DataSource ds;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String name = request.getParameter("nm");
		String address = request.getParameter("address");
		
		Customer c = new Customer(id, name, address);
		
		CustomerModel model = new CustomerModelImpl(ds);
		try {
			int res = model.addCustomer(c);
			if (res != 0) {
				out.print("Success");
			} else {
				
			}
		} catch (SQLException ex) {
			out.print("Error");
			throw new ServletException(ex);
		} catch (Exception ex) {
			out.print("Error");
			throw new ServletException(ex);
		} finally {
			out.close();
		}
		
	}

}
