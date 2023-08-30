<%@ page language="java" import="java.util.*,ms.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: #87CEEB">
	<center>
		<h1>MS Appointments</h1>
		<%
			ArrayList<Doctor> aa = (ArrayList<Doctor>) request.getAttribute("doctors");
		ArrayList<Slot> sa = (ArrayList<Slot>) request.getAttribute("slots");
		String dd=(String)request.getAttribute("date");
		%><table border="1">
			<tr>
				<th>slot id</th>
				<th>doc id</th>
				<th>doc name</th>
				<th>qual</th>
				<th>date</th>
				<th>time</th>
			<tbody>
				<%
					for (int i = 0; i < sa.size(); i++) {
					for (int j = 0; j < aa.size(); j++) {
						Slot s1 = sa.get(i);
						Doctor d1 = aa.get(j);
						if (s1.getS_did() == d1.getD_id() && s1.getS_date().equals(dd)) {
				%><tr>
					<td><%=s1.getS_id()%></td>
					<td><%=d1.getD_id()%></td>
					<td><%=d1.getD_name()%></td>
					<td><%=d1.getD_qual()%></td>
					<td><%=s1.getS_date()%></td>
					<td><%=s1.getS_time()%></td>
				</tr>
				<%
					}
				}
				}
				%>
			</tbody>
			</tr>
		</table></br>
		<form action="process" method="get">
			<label>name:<input type="text" name="ptn_name"></label></br>
			</br> <label>age:<input type="text" name="ptn_age"></label></br>
			</br> <label>gender:<input type="text" name="ptn_gender"></label></br>
			</br> <label>mobile:<input type="text" name="ptn_mobile"></label></br>
			</br> <label>doctor id:<input type="text" name="docid"></label></br>
			</br> <label>slot id:<input type="text" name="sid"></label></br>
			</br> <label>time:<input type="text" name="time"></label></br>
			</br>  <label>date:<input type="text" name="adate"></label></br></br>
			<input type="submit" value="submit" >
		</form>
</body>
</html>