<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 16.11.2020
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>laba6-7</title>
    <link rel="stylesheet" href="css.css">
  </head>
  <body>
  <div>
    <form action="Servlet" method="post">
      <input type="text" name="string1" placeholder="String 1" size="10" maxlength="10"><br>
      <input type="radio" name="radio" value="+" checked>+<input type="radio" name="radio" value="-">-<br>
      <input type="text" name="string2" placeholder="String 2" size="10" maxlength="10"><br>
      <br><br>
      <button type="submit">RUN</button>
    </form>
  </div>
  </body>
</html>
