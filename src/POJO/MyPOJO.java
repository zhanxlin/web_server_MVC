package POJO;

public class MyPOJO {
	public boolean login(String id,String password) {
		if(id.equals("admin")&&password.equals("123456")) {
			return true;
		}
		else {
			return false;
		}
	}
}