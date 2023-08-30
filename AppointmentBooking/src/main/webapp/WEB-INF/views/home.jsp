<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Appointment Booking</title>
    <style>
        body {
            background-color: #87CEEB;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }
        .form-container {
            background-color: white;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            text-align: center;
            width: 300px;
        }
        label {
            font-weight: bold;
            font-size: 18px;
            color: #333;
            display: block;
            margin-bottom: 10px;
        }
        input[type="date"] {
            padding: 10px;
            width: 100%;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }
        input[type="submit"] {
            background-color: #1E90FF;
            color: white;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #1873cc;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <form action="book" method="get">
            <label>Please select your appointment date</label>
            <input type="date" name="dd"><br>
            <input type="submit" value="Book Appointment">
        </form>
    </div>
</body>
</html>
