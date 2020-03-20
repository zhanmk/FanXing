import java.util.ArrayList;
import java.util.List;


class Food {}

class Fruit extends Food {}

class Apple extends Fruit {}

class Pear extends Fruit {}

class RedApple extends Apple {}

public class Test {
	private static int count = 1000;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<? extends Employee> list = new ArrayList<>();
		
		List<? extends Employee> list1 = new ArrayList<Employee>();
		List<? extends Employee> list2 = new ArrayList<Manager>();
		List<? extends Employee> list3 = new ArrayList<President>();
		
		
//		list.add(new President("1", "100"));
		list.add(null);//只能添加null元素
		
		//list.get(index)取出来的值，只能给Employee及其父类
//		President president =  list.get(0);
		Employee employee = list.get(0);
		Object object = list.get(0);
		Human human = list.get(0);
		
		List<? super Fruit> list11 = new ArrayList<>();
		List<? super Fruit> list12 = new ArrayList<Fruit>();
		List<? super Fruit> list13 = new ArrayList<Food>();
		List<? super Fruit> list14 = new ArrayList<Object>();
		
		list11.add(new Fruit());
//		list11.add(new Food());//不能往里添加Fruit的超类，因为编译器不知道list的内容到底是Fruit的哪个超类(Food或Object)
		list11.add(new Apple());//只能添加Fruit的子类
		list11.add(new Pear());//只能添加Fruit的子类
		list11.add(new RedApple());//Fruit的子类有Apple，Apple的子类有RedApple
		
		
		Object object2 = list11.get(0); //只能取出Object类型的元素
		
		Comparable<Integer> comparable = Test::test;
		System.out.println(comparable.compareTo(1000));
		
		
		List<Fruit> listF = new ArrayList<>();
		listF.add(new Apple());
//		listF.add(new Food());//error
		
	}
	
	public static int test(int a) {
		if(a > count) {
			return 1;
		}
		return 0;
	}
	
}
