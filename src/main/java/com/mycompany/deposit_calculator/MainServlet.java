/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deposit_calculator;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sasha
 */
public class MainServlet extends HttpServlet { 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String req_sum = request.getParameter("dep_sum");
        String req_rate = request.getParameter("dep_rate");
        String req_term = request.getParameter("dep_term");
       try{
        double sum = Integer.parseInt(req_sum);
        int rate = Integer.parseInt(req_rate);
        int term = Integer.parseInt(req_term);
        for(int i=0;i<term;i++){
        sum+=sum*rate/100/12;
        }
         String formattedDouble = new DecimalFormat("#0.00").format(sum);      
        request.setAttribute("answer", "Сумма вклада по окончанию срока будет = " + formattedDouble);
      } catch (NumberFormatException exception) {
       request.setAttribute("answer", " Нужно написать цифрами. Попробуйте снова.");
       }
        request.getRequestDispatcher("result.jsp").forward(request, response);
        
        
    }

   
}
