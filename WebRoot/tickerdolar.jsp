<%-- Prevencion del cache --%>
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
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script type="text/javascript" src="js/jquery.webticker.js"/></script>
    <link rel="stylesheet" href="css/webticker.css" type="text/css" media="screen"></link>
    <link rel="stylesheet" href="css/tickerlayout.css" type="text/css" media="screen"></link>
    <script type="text/javascript">
        $(function(){
            $("#webticker").webTicker({speed:100});
        });
    </script>
</head>
<body>
    <div class="banner">
        <span class="titulos">Precios del D&oacute;lar Paralelo</span>
        <ul id="webticker" >
            <!--en la sesion hay 4 objeto, dos mapas que contienen las tasas 
            del dolar actual y anterior y dos conjuntos que son la llaves de 
            estos mapas; estos son iterados para obtener sus valores-->
            <c:forEach var="tasadolar" items="${clavesDolarActual}" varStatus="row">
                <c:set var="dolarAc" value="${mapaDolarActual[tasadolar]}"/>
                <c:set var="dolarAn" value="${mapaDolarAnterior[tasadolar]}"/>
                <c:set var="dif" value="${dolarAc - dolarAn}"/>
                <li><!--el formato es el de esta primera tabla y elemento de lista-->
                    <table border="0">
                        <tbody>
                            <tr>
                                <td colspan="5" style="text-align: left">
                                    ${tasadolar} &nbsp;
                                    <fmt:formatNumber pattern="#,##0.00" value="${dolarAc}"  maxFractionDigits="2"  />  
                                    <%--<c:out value="${dolarAc}"/>--%>
                                </td>
                            </tr>
                            <tr>
                                <td style="font-size: 16px; width: 100%; text-align: left">Tasa</td>
                                <td><!--el choose (switch) evalua la imagen de la tasa a desplegar -->
                                    <c:choose>
                                        <c:when test="${dolarAc == dolarAn }">
                                            <img class="imgRate" src="img/rate_igual.png" width="23" height="24"/>
                                        </c:when>
                                        <c:when test="${dolarAc > dolarAn }">
                                            <img class="imgRate" src="img/rate_sube_a.png" width="23" height="24"/>
                                        </c:when>
                                        <c:when test="${dolarAc < dolarAn }">
                                            <img class="imgRate" src="img/rate_baja_a.png" width="23" height="24"/>
                                        </c:when>
                                    </c:choose>
                                </td>
                                <td class="valores"><!--el valor de la diferencia entre la tasa anterior y actual-->
                                    <c:if test="${dif !=0 }">
                                        <c:if test="${dif < 0}">
                                            <fmt:formatNumber pattern="#,##0.00" value="${dif * (-1)}"  maxFractionDigits="2"  />   
                                        </c:if>
                                        <c:if test="${dif > 0}">
                                            <fmt:formatNumber pattern="#,##0.00" value="${dif}"  maxFractionDigits="2"  />   
                                        </c:if>
                                    </c:if> 
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </li>
            </c:forEach>
        </ul>
    </div>
</body>
</html>
