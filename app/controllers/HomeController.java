package controllers;
import com.fasterxml.jackson.databind.JsonNode;

import models.DeleteEmp;
import models.EmpCreate;
import models.ReadEmp;
import models.UpdateEmp;
import play.*;
import play.libs.Json;
import play.mvc.*;

import views.html.*;



import play.mvc.Controller;
import play.mvc.Result;  
import play.*;
import play.mvc.*;

import views.html.*;

public class HomeController extends Controller {

	public Result index() {
        return ok("hello world");
    }
    public Result fetch() {
    	EmpCreate.create();
    	return ok("Employee details inserted");
    }
    
    public Result up()
    {
    	UpdateEmp.update();
    	return ok("Successfully updated");    	
    }
    
   
    public Result remove()
    {

    	DeleteEmp.delete();
    	return ok("Successfully updated");    	
    }
    
    public Result read()
    {

    	ReadEmp.read();
    	return ok("successfull");    	
    }
    
}
