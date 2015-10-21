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
        <div class="bolivar">
            <div class="tituloDiv">
                <div>
                    <!--<img src="img/Venezuela.png" width="35" height="24" alt="Venezuela"/>&nbsp;-->
                    Bol&iacute;var venta</di> 
                </div>
                <div id="factorbodybolivar">
                    <table border="0" class="tableclassbolivar">
                        <thead id="tituloBolivar">
                            <tr>
                                <th  colspan="4">Dep&oacute;sitos</th>
                                <th  colspan="4">Transferencia</th>
                                <th  colspan="3">Electr&oacute;nico</th>
                            </tr>
                        </thead>
                        <tbody id="bodyFactor">
                            <c:set var="difDepo" value="${bsfActualDepo.preciobolivar - bsfAnteriorDepo.preciobolivar}"/>
                            <c:set var="difTrasfer" value="${bsfActualTrans.preciobolivar - bsfAnteriorTrans.preciobolivar}"/>
                            <c:set var="difElec" value="${bsfActualElec.preciobolivar - bsfAnteriorElec.preciobolivar}"/>
                            <tr id="tablebolivar">
                                <td class="preciobolivar">${bsfActualDepo.preciobolivar}</td>
                                <td id="rateimgBol">
                                    <c:choose>               
                                        <c:when test="${bsfActualDepo.preciobolivar == bsfAnteriorDepo.preciobolivar}">
                                            <img class="imgRateBo" src="img/rate_igual.png" width="28" height="28"/>
                                        </c:when>
                                        <c:when test="${bsfActualDepo.preciobolivar > bsfAnteriorDepo.preciobolivar}">
                                            <img class="imgRateBo" src="img/rate_sube_a.png" width="28" height="28"/>
                                        </c:when>
                                        <c:when test="${bsfActualDepo.preciobolivar < bsfAnteriorDepo.preciobolivar}">
                                            <img class="imgRateBo" src="img/rate_baja_a.png" width="28" height="28"/>
                                        </c:when>
                                    </c:choose>
                                </td>
                                <td id="difBolivar">
                                    <c:if test="${difDepo !=0 && bsfActualDepo.preciobolivar != null}">
                                        <c:if test="${difDepo < 0}">
                                            <fmt:formatNumber pattern="#,##0" value="${difDepo * (-1)}"  maxFractionDigits="2"  />   
                                        </c:if>
                                        <c:if test="${difDepo > 0}">
                                            <fmt:formatNumber pattern="#,##0" value="${difDepo}"  maxFractionDigits="2"  />   
                                        </c:if>
                                    </c:if>
                                </td>
                                <td class="divtable2">&nbsp;</td><!--columna separacion-->
                                <td class="preciobolivar">${bsfActualTrans.preciobolivar}</td>
                                <td id="rateimgBol">
                                    <c:choose>               
                                        <c:when test="${bsfActualTrans.preciobolivar == bsfAnteriorTrans.preciobolivar}">
                                            <img class="imgRateBo" src="img/rate_igual.png" width="28" height="28"/>
                                        </c:when>
                                        <c:when test="${bsfActualTrans.preciobolivar > bsfAnteriorTrans.preciobolivar}">
                                            <img class="imgRateBo" src="img/rate_sube_a.png" width="28" height="28"/>
                                        </c:when>
                                        <c:when test="${bsfActualTrans.preciobolivar < bsfAnteriorTrans.preciobolivar}">
                                            <img class="imgRateBo" src="img/rate_baja_a.png" width="28" height="28"/>
                                        </c:when>
                                    </c:choose>
                                </td>
                                <td id="difBolivar">
                                    <c:if test="${difTrasfer !=0 && bsfActualTrans.preciobolivar != null }">
                                        <c:if test="${difTrasfer < 0}">
                                            <fmt:formatNumber pattern="#,##0" value="${difTrasfer * (-1)}"  maxFractionDigits="2"  />   
                                        </c:if>
                                        <c:if test="${difTrasfer > 0}">
                                            <fmt:formatNumber pattern="#,##0" value="${difTrasfer}"  maxFractionDigits="2"  />   
                                        </c:if>
                                    </c:if>
                                </td>
                               <td class="divtable2">&nbsp;</td><!--columna separacion-->
                                <td class="preciobolivar">
                                    <fmt:formatNumber pattern="#,##0" value="${bsfActualElec.preciobolivar}"  maxFractionDigits="0"  />
                                </td>
                                <td id="rateimgBol">
                                    <c:choose>               
                                        <c:when test="${bsfActualElec.preciobolivar == bsfAnteriorElec.preciobolivar}">
                                            <img class="imgRateBo" src="img/rate_igual.png" width="28" height="28"/>
                                        </c:when>
                                        <c:when test="${bsfActualElec.preciobolivar > bsfAnteriorElec.preciobolivar}">
                                            <img class="imgRateBo" src="img/rate_sube_a.png" width="28" height="28"/>
                                        </c:when>
                                        <c:when test="${bsfActualElec.preciobolivar < bsfAnteriorElec.preciobolivar}">
                                            <img class="imgRateBo" src="img/rate_baja_a.png" width="28" height="28"/>
                                        </c:when>
                                    </c:choose>
                                </td>
                                <td id="difBolivar">
                                    <c:if test="${difElec !=0 && bsfActualElec.preciobolivar != null }">
                                        <c:if test="${difElec < 0}">
                                            <fmt:formatNumber pattern="#,##0" value="${difElec * (-1)}"  maxFractionDigits="2"  />   
                                        </c:if>
                                        <c:if test="${difElec > 0}">
                                            <fmt:formatNumber pattern="#,##0" value="${difElec}"  maxFractionDigits="2"  />   
                                        </c:if>
                                    </c:if>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
    </body>
</html>
