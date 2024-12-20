import java.util.ArrayList;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al1=new ArrayList();
al1.add("Sushmitha");
al1.add(30);
al1.add("Gayee");
al1.add(20);
System.out.println(al1);
ArrayList al2=new ArrayList();
al2.add("Sushmitha");
al2.add(20);
al2.add("Good Girl");
System.out.println(al2);
ArrayList al3=new ArrayList();
al3.add(al2);//can add a complete ArrayList
al3.add(66);//added to rear
al3.add(0,5);//added at first
al3.add(2,6);//added at 2nd index
System.out.println(al3);
	}

}

