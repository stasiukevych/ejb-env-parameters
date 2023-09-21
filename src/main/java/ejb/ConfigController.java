package ejb;


import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("config")
public class ConfigController {

  @EJB
  private Config supplier;

  @GET
  @Path("connection")
  public Response dbConnection() {
    return Response.ok().entity(supplier.getDbConnection()).build();
  }

  @GET
  @Path("dataSource")
  public Response dataSource() {
    return Response.ok().entity(supplier.getDataSourcePath()).build();
  }

  @GET
  @Path("port")
  public Response port() {
    return Response.ok().entity(supplier.getPort()).build();
  }

  @GET
  @Path("timeout")
  public Response timeout() {
    return Response.ok().entity(supplier.getTimeout()).build();
  }

  @GET
  @Path("connectionInfo")
  public Response connectionInfo() {
    return Response.ok().entity(supplier.buildConnectionInfo()).build();
  }
}