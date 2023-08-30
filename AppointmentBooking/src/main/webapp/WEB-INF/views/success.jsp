<%@ page language="java" import="ms.*,java.*"
    contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head style="background-color: #87CEEB">
    <meta charset="UTF-8">
    <title>Appointment Confirmation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #87CEEB;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            text-align: center;
            background-color: white;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #333;
        }
        h2 {
            color: #666;
        }
        h3 {
            color: #444;
        }
    </style>
</head>
<body>
    <div class="container">
        <%-- Retrieve attributes and handle data type casting --%>
        <% Object patientObj = request.getAttribute("patient");
           Patient p = (patientObj instanceof Patient) ? (Patient) patientObj : null;
        
           Object pidObj = request.getAttribute("pid");
           int pid = (pidObj instanceof Integer) ? (Integer) pidObj : 0;
        
           Object apidObj = request.getAttribute("appid");
           String apid = (apidObj instanceof String) ? (String) apidObj : "";
        %>
        
        <h1>Appointment Successfully Booked</h1>
        <h2>Appointment Details</h2>
        
        <h2>Appointment ID:</h2><h3><%= apid %></h3>
        <h2>Appointment Date:</h2><h3><%= (p != null) ? p.getAdate() : "" %></h3>
        <h2>Appointment Time:</h2><h3><%= (p != null) ? p.getTime() : "" %></h3>
        <h2>Patient Name:</h2><h3><%= (p != null) ? p.getPtn_name() : "" %></h3>
        <h2>Patient ID:</h2><h3><%= pid %></h3>
        <h2>Patient Mobile:</h2><h3><%= (p != null) ? p.getPtn_mobile() : "" %></h3>
        <h2>Doctor ID:</h2><h3><%= (p != null) ? p.getDocid() : "" %></h3>
        <h2>Slot ID:</h2><h3><%= (p != null) ? p.getSid() : "" %></h3>
    </div>
</body>
</html>
