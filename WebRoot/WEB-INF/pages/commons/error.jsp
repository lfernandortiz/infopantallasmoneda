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
        <link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
        <link rel="shortcut icon" href="img/favicon_.ico"/>
        <!--hace un request via get al Servlet Controlador consumir los Web Services, 
        los persista, y genere los objetos de sesion-->
        <%-- <meta http-equiv="refresh" content="3; url =${pageContext.request.contextPath}/ServletControlador?accion=actualizar"/> --%>
        <script type="text/javascript" src="js/fechahora.js"></script>
        <script type="text/javascript">
        </script>
        <title>Indicadores Econ&oacute;micos | Moneda Frontera</title>
    </head>    
    <body>
        <div class="homediv">
            <img src="img/imgErrorSuperFinanciera.png"   alt="Moneda_Blanco_ini"/>
        </div>
    <body>

    </body>
</html>
