package models;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class UpdateEmp {

	public static void update()
	{
	MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	MongoDatabase database = mongoClient.getDatabase("Emp");
	MongoCollection<Document> collection = database.getCollection("EmpDetails");
	
	
	Document filter=new Document("First_Name","john");
	Document update=new Document("$set", new Document("age","30"));
	collection.updateMany(filter,update);
    

	}
}
