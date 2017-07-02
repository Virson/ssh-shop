<%--
  Created by IntelliJ IDEA.
  User: mosg
  Date: 12-2-26
  Time: 下午6:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
      <script type="text/javascript">
          //测试
          function getUser(){
              document.form_main.submit();
              return true;
          }


      </script>
  </head>
  <body>
   Struts2 + Spring3.1 + Hibernate4
  <form action="getUser" name="form_main" method="post">
      <input type="button" name="button" value="Test" onclick="getUser()">
  </form>
  </body>
</html>