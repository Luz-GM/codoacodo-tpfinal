<%@ page contentType="text/html" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Buscar</title>
    <link rel="stylesheet" href="styles.css" />
  </head>
  <body>
    <section>
      <h2>Buscar por ID</h2>
      <form action="vercomprador" method="get">
        <div>
          <label>Id Comprador</label>
          <input name="id" type="text" />
        </div>
        <input type="submit" value="Ver" />
      </form>
    </section>
  </body>
</html>
