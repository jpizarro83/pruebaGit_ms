@RestController
public class testController{
    @GetMapping(value = "/healthcheck2", produces = "application/json; charset=utf-8")
	public String getHealthCheck()	{
		return "{ \"todoOk employee - memoria\" : true }";
	}
}