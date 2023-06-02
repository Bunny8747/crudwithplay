package models;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class DeleteEmp {

	public static void delete()
	{
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		MongoDatabase database = mongoClient.getDatabase("Emp");
		MongoCollection<Document> collection = database.getCollection("EmpDetails");
		
		
		collection.deleteMany(Filters.eq("age", "23"));
	}
	
}
