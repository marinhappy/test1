import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> col=new HashSet<String>();
		Collection t=new HashSet();
		col.add("book");
		col.add("love");
		Iterator tor=col.iterator();
		while(tor.hasNext()) {
			System.out.println(tor.next());
		}
	}

}
