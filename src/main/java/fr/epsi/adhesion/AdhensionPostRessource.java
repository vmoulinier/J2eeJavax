package fr.epsi.adhesion;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/adhesionpost")
public class AdhensionPostRessource {

	  @GET
	  @Path("/get")
	  @Produces({MediaType.APPLICATION_JSON})
	  public Adhesion get() {
		  Adhesion adhesion = new Adhesion();
		  return adhesion;
	  }
	
	  @POST
	  @Path("/post")
	  @Produces({MediaType.APPLICATION_JSON})
	  public Response post(Adhesion adhesion) {
		  String result = "Test : "+ adhesion;
		  return Response.status(201).entity(result).build();

	  }
}
