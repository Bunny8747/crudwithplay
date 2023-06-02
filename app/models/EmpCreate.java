package models;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class EmpCreate {
	public static void create()
	{
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		MongoDatabase database = mongoClient.getDatabase("Emp");
		MongoCollection<Document> collection = database.getCollection("EmpDetails");

		List<Document> l1 = new ArrayList<Document>();
		l1.add(new Document("First_Name","john").append("Last_Name","smith").append("age", "22").append("city", "kolar"));
		
		l1.add(new Document("First_Name","bunny").append("Last_Name","gowda").append("age", "23").append("city", "kgfr"));
		l1.add(new Document("First_Name","kajal").append("Last_Name","shree").append("age", "22").append("city", "banglore"));
collection.insertMany(l1);

		
	
	}
}
