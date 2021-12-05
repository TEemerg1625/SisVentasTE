<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <h1>Vienvenido al Sistema</h1>
        <nav class="navbar navbar-expand-lg navbar-light bg-info">
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
        
      <li class="nav-item">
        <a Style="margin-left: 10px; border: none" class="btn btn-outline-light" href="#">Home</a>
      </li>
      <li class="nav-item">
          <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Producto&accion=Listar" target="myFrame">Producto</a>
      </li>
      <li class="nav-item">
        <a  style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Empleado&accion=Listar" target="myFrame">Empleado</a>
      </li>
      <li class="nav-item">
        <a  style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Cliente&accion=Listar" target="myFrame">Clientes</a>
      </li>
     
      <li class="nav-item">
          <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=NuevaVenta&accion=default" target="myFrame" >NuevaVenta</a>
          
      </li>
      
    </ul>
      
      <div class="dropdown">
        <button style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
           ${usuario.getNom()}
      </button>
     <div class="dropdown-menu text-center">
      <a class="dropdown-item" href="#">
          <img src="img/user.jpg" alt="60" width="60" />
          
     </a>
    <a class="dropdown-item" href="#">${usuario.getUser()}</a>
    <a class="dropdown-item" href="#">usuario@gmail.com</a>
    <div class="dropdown-divider"></div>
    <form action="Validar" method="POST" >
        <button name="accion" value="Salir" class="dropdown-item" >Salir</button>
       </form>
  </div>
 </div>
</div>
</nav>
    
    <div class="m-4" style="height: 530%">
        <iframe name="myFrame" style="height: 700px ; width: 100% ; border: none"></iframe>
    </div>
    
    
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>
