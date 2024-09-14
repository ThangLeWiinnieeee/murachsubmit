package murach.servlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import murach.business.UserData;

public class MurachServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Default URL
        String url = "/index.html";

        // Get parameters from the form
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String dateOfBirth = req.getParameter("dateOfBirth");
        String chooseOne = req.getParameter("chooseOne");
        String contactMethod = req.getParameter("contactMethod");

        // Validate inputs (you can add more complex validation as needed)
        
            // Create SurveyData object
            UserData userData = new UserData(firstName, lastName, email, dateOfBirth, chooseOne, contactMethod);

            // Set SurveyData object in the request
            req.setAttribute("userData", userData);

            // Set URL to forward to the thanks.jsp
            url = "/thanks.jsp";
        

        // Forward to the appropriate page (thanks.jsp or index.html)
        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

}
