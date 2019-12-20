package WordBook_DATA;

public class User {
	String userId,userPw;
	int testword;
	User(String userId, String userPw, int testword){
		this.userId=userId; this.userPw=userPw; this.testword=testword;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return userId+"\n"+userPw+"\n"+testword+"\n";
	}
}
