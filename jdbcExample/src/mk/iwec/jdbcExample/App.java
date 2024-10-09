package mk.iwec.jdbcExample;

public class App {

	public static void main(String[] args) {
		Database db = new Database();
		//db.insert
		db.insert();
		db.select();
		db.update();
		db.delete();
		System.out.println("After delete:");
		
		//db.close();
		
	//db.insertPS 
	db.updatePS(3,"Ivan","Ivanov");
	db.deletePS(4);
	db.select();
	db.close();
	}

}
