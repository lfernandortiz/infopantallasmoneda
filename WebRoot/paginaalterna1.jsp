<%
    response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); //impide el almacenamiento en caché en el servidor proxy
    response.setHeader("Cache-Control", "no-store");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="img/favicon_.ico"/>
        <meta http-equiv="refresh" content="120; url =${pageContext.request.contextPath}/ServletControlador?accion=actualizar"/>
        <!--<meta http-equiv="refresh" content="180; url =paginaalterna2.jsp"/>-->
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <c:import  url = "https://dolartoday.com/"  />
            <!--<img src="https://cloud-1400767117-cache.cdn-cachefront.net/custom/rate2.jpg"/>-->
        </div>
    </body>
</html>
