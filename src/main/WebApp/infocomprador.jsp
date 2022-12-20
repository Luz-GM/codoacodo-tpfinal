<%@ page contentType="text/html" pageEncoding="utf-8" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Informacion Registro</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <section>
    <h2>Info de Comprador ID ${c.getId()}</h2>
    <p>Nombre: ${c.getNombre()}</p>
    <p>Apellido: ${c.getApellido()}</p>
    <p>Email: ${c.getEmail()}</p>
    </section>
</body>
</html>