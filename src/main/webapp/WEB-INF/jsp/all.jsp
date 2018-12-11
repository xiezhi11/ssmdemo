<%--
  Created by IntelliJ IDEA.
  User: xz
  Date: 2018/12/7
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    this is all jsp<br/>
    <c:forEach items="${ll}" var="dept">
        编号:${dept.deptNo}--部门:${dept.dName}--位置:${dept.loc}<br/>
    </c:forEach>

</body>
</html>
