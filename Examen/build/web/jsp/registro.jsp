<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuarios</title>
    </head>
    <body>
        <h1>Registro de Usuarios</h1>
        <form method="POST" action='RegistroServlet'>
            <BR>
            <BR>
            <center>
                Llene los campos que se piden y pulse el bot&oacute;n de enviar al teminar<BR>
                <BR>Nombre:<input type=text name=NOMBRE>
                <BR><BR>Apellido Materno:<input type=text name=APATERNO>
                <BR><BR>Apellido Paterno<input type=text name=AMATERNO>
                <BR><BR>Escuela:<input type=text name=ESCUELA>
                <BR><BR>Materia Favorita<input type=text name=MFAVORITA>
                <BR><BR>Deporte Favorito<input type=text name=DFAVORITO>
                <BR><BR><input type=submit value="Enviar Nombre">
            </center>
        </form>
    </body>
</html>
