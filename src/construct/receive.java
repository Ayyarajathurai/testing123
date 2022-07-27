package construct;

public class receive extends sent {

	@Override
	public void sent() {
		// TODO Auto-generated method stub
		System.out.println("sendr");
	}
public static void main(String[] args) {
receive r=new receive();
r.sent();
r.server();
}
}
