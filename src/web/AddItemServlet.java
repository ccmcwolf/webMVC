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
import bo.Item;
import model.CustomerModel;
import model.ItemModel;
import model.impl.CustomerModelImpl;
import model.impl.ItemModelImpl;

/**
 * Servlet implementation class AddCustomerServlet
 */
@WebServlet("/AddCustomerServlet")
public class AddItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/thogakade")
	private DataSource ds;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String code = request.getParameter("id");
		String description = request.getParameter("desc");
		double unitPrice = Double.parseDouble(request.getParameter("unitp"));
		int qtyOnHand = Integer.parseInt(request.getParameter("qty"));
	  
		Item item = new Item(code,  description, unitPrice,qtyOnHand);
		
		
		ItemModel model = new ItemModelImpl(ds);
		try {
			int res = model.addItem(item);
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
