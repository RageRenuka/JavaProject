<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Rental | Home</title>
<div>

</div>
<head>
    <meta charset="utf-8">
    <title >Car Rental Invoice</title>
    
    <style>
    .invoice-box {
        max-width: 1000px;
        margin: auto;
        padding: 30px;
        border: 1px solid #eee;
        box-shadow: 0 0 10px rgba(0, 0, 0, .15);
        font-size: 16px;
        line-height: 24px;
        font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif;
        color: #555;
    }
    
    .invoice-box table {
        width: 100%;
        line-height: inherit;
        text-align: left;
    }
    
    .invoice-box table td {
        padding: 5px;
        vertical-align: top;
    }
    
    .invoice-box table tr td:nth-child(2) {
        text-align: right;
    }
    
    .invoice-box table tr.top table td {
        padding-bottom: 20px;
    }
    
    .invoice-box table tr.top table td.title {
        font-size: 45px;
        line-height: 45px;
        color: #333;
    }
    
    .invoice-box table tr.information table td {
        padding-bottom: 40px;
    }
    
    .invoice-box table tr.heading td {
        background: #eee;
        border-bottom: 1px solid #ddd;
        font-weight: bold;
    }
    
    .invoice-box table tr.details td {
        padding-bottom: 20px;
    }
    
    .invoice-box table tr.item td{
        border-bottom: 1px solid #eee;
    }
    
    .invoice-box table tr.item.last td {
        border-bottom: none;
    }
    
    .invoice-box table tr.total td:nth-child(2) {
        border-top: 2px solid #eee;
        font-weight: bold;
    }
    
    @media only screen and (max-width: 600px) {
        .invoice-box table tr.top table td {
            width: 100%;
            display: block;
            text-align: center;
        }
        
        .invoice-box table tr.information table td {
            width: 100%;
            display: block;
            text-align: center;
        }
    }
    
    /** RTL **/
    .rtl {
        direction: rtl;
        font-family: Tahoma, 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif;
    }
    
    .rtl table {
        text-align: right;
    }
    
    .rtl table tr td:nth-child(2) {
        text-align: left;
    }
    </style>
</head>
<%@page import="java.util.*" %>
    <%@ page import="java.util.Random"%>
<body>

    <div class="invoice-box">
    <form action="User Booking Details.jsp" method="post">
        <table cellpadding="0" cellspacing="0">
            <tr class="top">
                <td colspan="2">
                    <table>
                        <tr>
                            <td class="title">
                           <h1  style="color:blue;font-size: 40px;margin-left: 390px;"><font face="Algerian">CAR RENTAL</font><br>
                           <h1  style="color:blue;font-size: 20px;margin-left: 430px;">Invoice No:<%=session.getAttribute("bill")%></h1><br>
                             
                            
                            <td><input type="submit" name="print" value="Print" readonly><br>
                            
                            </td>
                           
                               <br><h1  style="color:green;font-size:20px;margin-left: 550px;">
                                <span style="color:red;font-size:20px" >Booking Date:</span><% Date d=new Date(); out.println(d.toString()); %></b>
                               </h1>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            
            <tr class="information">
                <td colspan="2">
                    <table>
                        <tr>
                            <td> 
                                Full Name:<%= session.getAttribute("username")%><br>
								Car Number:<%= session.getAttribute("carno")%><br>
								Amount:/-<%= session.getAttribute("amount")%>
                              
                            </td>
                            
                            <td>
                                From Date:<%=session.getAttribute("from") %><br>
                                To Date:<%=session.getAttribute("to") %>
                             
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
			
			<tr class="information">
                <td colspan="2">
                    <table>
                        	<td>
							</td>
                            
                            <td>
                                Received Signature
                             
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            
                  </table><input type="submit" value="Ok">
                  </form>
    </div>
    </body>
</html>