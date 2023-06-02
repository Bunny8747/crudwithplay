package models;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class ReadEmp {

	
	public static void read()
	{
	MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	MongoDatabase database = mongoClient.getDatabase("Emp");
	MongoCollection<Document> collection = database.getCollection("EmpDetails");
	//find operation to read multiple documents
	MongoCursor<Document> cursor = collection.find().iterator();
	//iterate over the cursor to access each document
	while(cursor.hasNext())
	{
		Document document = cursor.next();
		//to get in jsonformat
		System.out.println(document.toJson());
	}
}
}
