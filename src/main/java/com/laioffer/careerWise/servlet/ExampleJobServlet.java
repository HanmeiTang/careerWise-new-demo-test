package com.laioffer.careerWise.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laioffer.careerWise.entity.ExampleCoordinates;
import com.laioffer.careerWise.entity.ExampleJob;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ExampleJobServlet", urlPatterns = {"/example_job"})
public class ExampleJobServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        ExampleCoordinates coordinates = new ExampleCoordinates(
                37.485130, -122.148316);
        ExampleJob job = new ExampleJob(
                "Software Engineer", 123456,
                "Aug 1, 2020", false,
                coordinates);
        response.getWriter().print(mapper.writeValueAsString(job));
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
