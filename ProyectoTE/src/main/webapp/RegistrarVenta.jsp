

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Registrar Ventas</h1>
        
        <div class="d-flex">
            <div class="col-sm-4" >
                  <div class="card" >
                      <form action="Controlador?menu=NuevaVenta" method="POST">
                      <div class="card-body">
                          
                        
                          <div class="form-group" >
                              <label>Datos Cliente</label>
                          </div>
                          <div class="form-group d-flex">
                              <div class="col-sm-6 d-flex" >
                                  <input type="text" name="codigocliente"  value="${c.getDni()}" class="form-control" placeholder="Codigo" >
                                 <input type="submit" name="accion" value="BuscarCliente" class="btn btn-outline-info">
                               </div>                             
                              <div class="col-sm-6">
                                  <input type="text" name="nombrescliente" value="${c.getNom()}"  placeholder="Datos Cliente" class="form-control" >
                              </div>
                             </div> 
                          
                          <div class="form-group" >
                         <label  >Datos Producto</label>
                          </div>
                          <div class="form-group d-flex" >
                              <div class="col-sm-6 d-flex" >
                                  <input type="text" name="codigoproducto" class="form-control" placeholder="Codigo" >
                                 <input type="submit" name="accion" value="Buscar" class="btn btn-outline-info">
                               </div>                             
                              <div class="col-sm-6">
                                  <input type="text" name="nombrecliente" placeholder="Datos Producto" class="form-control">
                              </div>
                          </div>
                          
                          
                          <div class="form-group d-flex" >
                              <div class="col-sm-6 d-flex" >
                                  <input type="text" name="precio" class="form-control" placeholder="s/.0.00" >
                              </div>  
                              <div class="col-sm-3">
                                  <input type="number" name="cant" placeholder="" class="form-control" >
                              </div> 
                              <div class="col-sm-3">
                                  <input type="text" name="stock" placeholder="Stock" class="form-control" >
                              </div>
                          </div> 
                          <div class="form-group">
                              <input type="submit" name="accion" value="Agregar" class="btn btn-outline-info" >
                          </div>
                      </div>
                          </form>
                  </div>
            </div>
            <div class="col-sm-7">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex col-sm-6 ml-auto">
                    <label>NumeroSerie:</label>
                    <input type="text" name="NroSerie" class="form-control">     
                </div>
                        <br>
                        <table class="table talbe-hover " border="1">
                            <thead>
                                <tr>
                                    <th>Nro</th>
                                    <th>Codigo</th>
                                    <th>Descripcion</th>
                                    <th>Precio</th>
                                    <th>Cantidad</th>
                                    <th>SubTotal</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                            </tbody>
                        </table>
                 </div>
                    <div class="card-footer">
                        <input type="submit" name="accion" value="Generar Venta" class="btn btn-success">
                       <input type="submit" name="accion" value="Cancelar" class="btn btn-danger">
                    </div>
                </div>
            </div>
          </div>




        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
