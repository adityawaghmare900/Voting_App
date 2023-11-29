<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*"%>
<%@ page import = "java.util.Date,java.text.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>total Count</title>
</head>
<body>
  <sql:setDataSource var = "snapshot" driver = "com.mysql.cj.jdbc.Driver"
         url = "jdbc:mysql://localhost/voting_app" user = "root" password = "root"/>
         
          <sql:query dataSource = "${snapshot}" var = "result">
        Select vote,Count(*) as Count from Candidates  GROUP BY vote;
      </sql:query>
      <h3 align="center">Total Count</h3>
        <table  align="center" border = "3" width = "20%">
         <tr>
            <th>Candidates</th>
            <th>Total Votes</th>
            
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td> <c:out value = "${row.vote}"/></td>
               <td> <c:out value = "${row.Count}"/></td>
               
            </tr>
         </c:forEach>
      </table>

 

</body>
</html>