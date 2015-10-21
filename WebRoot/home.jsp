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
<!--        <meta http-equiv="refresh" content="600; url =${pageContext.request.contextPath}/ServletControlador?accion=actualizar"/>-->
        <meta http-equiv="refresh" content="480; url =paginaalterna1.jsp"/>
        <script type="text/javascript" src="js/fechahora.js"></script>
        <script type="text/javascript" src="js/connection.js">
            
        </script>

        <title>Indicadores Econ&oacute;micos | Moneda Frontera</title>
    </head>
    <body>
    <body>
        <div class="container">
            <table border="0">
                <tbody>
                    <tr class="rowHead"><!--head de la tabla-->
                        <td class="colleft" >
                            <div id="logo">
                                <img src="img/Moneda_Blanco.png"  alt="Moneda_Blanco"/>
                            </div>
                        </td>
                        <td class="colmedio"></td>
                        <td class="colrightHora">
                            <script type="text/javascript" language="JavaScript">
                                document.write(diasSemana[f.getDay()] + ", " + f.getDate() + " de " + meses[f.getMonth()] + " de " + f.getFullYear() +" ")
                            </script>
                            &nbsp;
                            <span style="font-size: 22px">
                                <script>
                                    inicio();
                                </script>
                            </span>
                        </td>
                    </tr>
                    <tr class="rowheadMedio"><!--fila intermedia-->
                        <td colspan="3"></td>
                    </tr>
                    <tr class="rowTickerDolar"><!--ticker Dolar Paralelo-->
                        <td colspan="3">
                            <div>
                                <jsp:include page="tickerdolar.jsp"/>
                            </div>
                        </td>
                    </tr>
                    <tr class="rowIntermedio">
                        <td colspan="3"></td>
                    </tr>
                    <tr class="rowDolarParalelo"><!--Valor y Grafica Dolar paralelo-->
                        <td>
                            <div>
                                <jsp:include page="dolarparalelo.jsp"/>
                            </div>
                        </td>
                        <td></td>
                        <td><!--Graficos estadisticos del dolar--> 
                            <jsp:include page="dolarcolombia.jsp"/>
                        </td>
                    </tr>
                    <tr class="rowIntermedio">
                        <td colspan="3"></td>
                    </tr>
                    <tr class="rowDolarCol">
                        <td>
                            <jsp:include page="factordecambio.jsp"/>
                        </td>
                        <td></td>
                        <td>
                            <jsp:include  page="preciobolivar.jsp"/>
                        </td>
                    </tr>
                    <tr class="rowIntermedio">
                        <td colspan="3">
                        </td>
                    </tr>
                    <tr class="rowTickerEuro"><!--ticker Euro otros valores-->
                        <td colspan="3">
                            <div>
                                <%--<c:import url="tickerotrastasas.jsp" />--%>
                                <%--<jsp:include page="tickerotrastasas.jsp"/>--%>
                            </div>
                        </td>
                    </tr>
                    <tr><!--footer-->
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </div> <!--end div container-->
    </body>
</html>
