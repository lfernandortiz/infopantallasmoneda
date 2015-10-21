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
        <link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
    </head>
    <body>
        <div class="trmbody">

            <div id="trmleft">
                <div class="tituloDiv">
                    <div class="title">Euro Paralelo</div>
                </div>
                <div id="trminfo">   
                    <div id="tableeuro">
                        <table class="euro" border="0">
                            <tbody>
                                <c:forEach var="tasaeuro" items="${clavesEuroActual}" varStatus="row">
                                    <c:set var="euroActual" value="${mapaEuroActual[tasaeuro]}"/>
                                    <c:set var="euroAnterior" value="${mapaEuroAnterior[tasaeuro]}"/>
                                    <c:set var="dif" value="${euroActual - euroAnterior}"/>
                                    <tr class="${ (row.count % 2) == 0 ? "row2" : "row1" }">
                                        <td id="nombretasa">${tasaeuro}</td>
                                        <td id="valortasa">
                                            <fmt:formatNumber pattern="#,##0.00" value="${euroActual}"  maxFractionDigits="2"  />  
                                        </td>
                                        <td id="simbolo">
                                            <c:choose>               
                                                <c:when test="${euroActual == euroAnterior }">
                                                    <img class="imgRate" src="img/rate_igual.png" width="20" height="20"/>
                                                </c:when>
                                                <c:when test="${euroActual > euroAnterior }">
                                                    <img class="imgRate" src="img/rate_sube_a.png" width="20" height="20"/>
                                                </c:when>
                                                <c:when test="${euroActual < euroAnterior }">
                                                    <img class="imgRate" src="img/rate_baja_a.png" width="20" height="20"/>
                                                </c:when>
                                            </c:choose>
                                        </td>
                                        <td id="difEuroMas">
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
                                </c:forEach>
                            </tbody>
                        </table>
                    </div><!--end div tabla-->
                    <div id="footer">
                        (<strong>*</strong>) Impl&iacute;cito = Liquidez Monetaria / Reservas Internacionales (datos BVC)
                    </div>
                </div>
            </div><!--end Euro Today-->
            <div id="trmright">
                <div class="tituloDiv">
                    <div class="title">TRM Colombia</div>
                </div>
                <div id="trminfo">   
                    <div id="trmcol">
                        <c:set var="trmAct" value="${trmActualValor.trm}"/>
                        <c:set var="trmAnt" value="${trmAnteriorValor.trm}"/>
                        <c:set var="difTrm" value="${trmAct - trmAnt}"/>
                        <table border="0" width="100%">
                            <tbody>
                                <tr>
                                    <c:if test="${trmAct != null}">
                                        <td id="dolartrm" colspan="3">
                                            <fmt:formatNumber pattern="#,##0.00" value="${trmAct}"  maxFractionDigits="2"  />                                            
                                        </td>
                                    </c:if>

                                    <c:if test="${trmAct == null}">
                                        <td id="dolartrm2" colspan="3">
                                            <img class="imgWarnin" src="img/warning.png" width="40" height="40"/>
                                            <span id="error">${mensajeErrorDolar}</span>
                                        </td>
                                    </c:if>
                                </tr>
                                <tr>
                                    <td id="rateimg" colspan="2">
                                        <c:choose>               
                                            <c:when test="${trmAct == trmAnt }">
                                                <img class="imgRate" src="img/rate_igual.png" width="40" height="40"/>
                                            </c:when>
                                            <c:when test="${trmAct > trmAnt}">
                                                <img class="imgRate" src="img/rate_sube_grande_a.png" width="40" height="40"/>
                                            </c:when>
                                            <c:when test="${trmAct < trmAnt }">
                                                <img class="imgRate" src="img/rate_baja_grande_a.png" width="40" height="40"/>
                                            </c:when>
                                        </c:choose>
                                    </td>
                                    <td id="trmdif">
                                        <c:if test="${difTrm !=0 && difTrm != null && trmAct != null}">
                                            <c:if test="${difTrm < 0}">
                                                <fmt:formatNumber pattern="#,##0.00" value="${difTrm * (-1)}"  maxFractionDigits="3"  />   
                                            </c:if>
                                            <c:if test="${difTrm > 0}">
                                                <fmt:formatNumber pattern="#,##0.00" value="${difTrm}"  maxFractionDigits="3"  />   
                                            </c:if>
                                        </c:if>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>            
        </div><!--end div home-->
    </div>
</body>
</html>
