import java.util.ArrayList;
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al1=new ArrayList();
al1.add("Hello");
al1.add(20);
al1.add(true);

for(Object obj:al1) {//applicable only for classes that allow index based accessing
System.out.println(obj);
}
	}
} 
