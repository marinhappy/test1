import java.util.ArrayList;
import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub2
		ArrayList<String> list=new ArrayList<String>();
		list.add("marin");
		list.add("love");
		list.add("hong");
		System.out.println(list);
		Iterator t=list.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
	}

}
