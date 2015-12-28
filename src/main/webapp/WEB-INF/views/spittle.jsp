<%--
  Created by IntelliJ IDEA.
  User: Bogdan
  Date: 12/28/2015
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
    <div class="spittleView">
        <div class="spittleMessage"><c:out value="${spittle.message}" /></div>
        <div>
            <span class="spittleTime"><c:out value="${spittle.time}" /></span>
        </div>
    </div>
</body>
</html>
