

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
          <%! String Usuario, Contraseña;%>
        <style type="text/css">
        body { background:yellowgreen;}
        </style>  
    </head>
    <body>
          <% Usuario= request.getParameter("Usuario");
           Contraseña= request.getParameter("Contraseña");%>
           
    <center>  <h1>Bienvenido <%=Usuario%> </h1>
       <h2><a href= "CPU.html">1.Unidad central de proceso o CPU</a> <br>
           <a href= "Memoria.html">2.Memorias </a> <br>
           <a href= "Teclado.html">3.El teclado </a> <br>
           <a href= "Monitor.html">4.El Monitor </a> <br>
       </h2>
       <img src="Computadora.jpg">
    </center>
    </body>
</html>
