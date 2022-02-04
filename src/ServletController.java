

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;


/**
 * Implementation class ServletController
 */
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String frm=request.getParameter("frm");
		//register form data
		if(frm.equals("register")){
			//get the form data
			String id=request.getParameter("regno");
			String name=request.getParameter("name");
			String age=request.getParameter("age");
			String email=request.getParameter("email");
			String number=request.getParameter("number");
			String date=request.getParameter("date");
			
			
			StudentBean b=new StudentBean();
			//Storing form data to bean
			b.setId(id);
			b.setName(name);
			b.setAge(age);
			b.setEmail(email);
			b.setNumber(number);
			b.setDate(date);
			RegisterAction ra=new RegisterAction();
			
			boolean status=ra.register(b);
			//Redirect
			if(status){
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/success.jsp");
			rd.forward(request, response);
			}else
				response.sendRedirect("unsuccess.jsp");
		}//register for if end
		else if(frm.equals("fetch")){
			String id=request.getParameter("fetch");
			
			ViewAction va=new ViewAction();
			
			StudentBean b=va.fetch(id);
			boolean f=va.f;
			
			if(f){	
				request.setAttribute("fetch", b);
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/FetchView.jsp");
				rd.forward(request, response);
			}else
				response.sendRedirect("StudentIdNotFound.jsp");
			
			
		}else if(frm.equals("fetchall")){
			
			FetchAll fa=new FetchAll();
		List<StudentBean> li=	fa.fetchAllData();
		request.setAttribute("fetchall", li);
		boolean f=fa.f;
		
		if(f){	
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/FetchAllData.jsp");
		rd.forward(request, response);
		}
		else
			response.sendRedirect("NoRecordFound.jsp");
		
		
			
		}
		else if(frm.equals("update")){

			//get updating  form data
			String id=request.getParameter("regno");
			String name=request.getParameter("name");
			String age=request.getParameter("age");
			String email=request.getParameter("email");
			String number=request.getParameter("number");
			String date=request.getParameter("date");
			
			
			StudentBean b=new StudentBean();
			//Storing form data to bean
			b.setId(id);
			b.setName(name);
			b.setAge(age);
			b.setEmail(email);
			b.setNumber(number);
			b.setDate(date);
				
			UpdateAction a=new UpdateAction();
			boolean f=a.update(b);
			
				if(f){
					response.sendRedirect("ServletController?frm=fetchall");
				}
			
		}
		else if(frm.equals("delete")){
			String id=request.getParameter("delid");
			
			DeleteAction d=new DeleteAction();
			boolean f=d.delete(id);
			if(f){
				response.sendRedirect("ServletController?frm=fetchall");
			}
		}
		else if(frm.equals("updateOnly")){
			
			FetchAll fa=new FetchAll();
		List<StudentBean> li=	fa.fetchAllData();
		request.setAttribute("fetchall", li);
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/UpdateOnly.jsp");
		rd.forward(request, response);
		}	
	
	}

}
