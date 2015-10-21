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
    </head>
    <body>
        <div class="factor">
            <div class="tituloDiv">
                <div>Paridad Cambiaria</di> 
            </div>
            <div id="factorbody">

                <table  class="tableclass">
                    <thead id="tituloFactor">
                        <tr >
                            <th colspan="5">Moneda</th>
                            <th>Valor</th>
                            <th>Cambio</th>
                        </tr>
                    </thead>
                    <tbody id="bodyFactor">
                        <tr class="">
                            <td>EUR&nbsp;</td>
                            <td><img src="img/bandera_EUR.png"  alt="bandera_EUR"/>
                            </td>
                            <td>&nbsp;/&nbsp;</td>
                            <td>USD&nbsp;</td>
                            <td><img src="img/bander_USD.png"  alt="bander_USD"/></td>
                            <td>&nbsp;<stron><fmt:formatNumber pattern="#,##0" value="${dolarActual.eurusdrate}" maxFractionDigits="3"/></stron></td>
                            <c:set var="dif" value="${dolarActual.eurusdrate - dolarAnterior.eurusdrate}"/>
                            <c:if test="${dolarActual.eurusdrate > dolarAnterior.eurusdrate}">
                                <td id="difcambiomasE"><strong>&nbsp<fmt:formatNumber pattern="+#,##0" value="${dif}"  maxFractionDigits="5"/> </strong></td>
                            </c:if>            
                            <c:if test="${dolarActual.eurusdrate < dolarAnterior.eurusdrate}">
                                <td id="difcambiomenosE"><strong>&nbsp<fmt:formatNumber pattern="#,##0" value="${dif}"  maxFractionDigits="5"/> </strong></td>
                            </c:if>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
