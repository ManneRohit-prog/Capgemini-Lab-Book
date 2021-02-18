package pack;
import java.util.*;
public class Lab67 {
	public static int[] getSorted(int[] a) {
	List<Integer> li = new ArrayList<Integer>();
	for(int i: a) {
	String str = String.valueOf(i);
	StringBuffer sb=new StringBuffer(str);
	sb.reverse();
	str = sb.toString();
	i = Integer.parseInt(str);
	li.add(i);
	}
	Collections.sort(li);
	for (int i=0;i<li.size();i++)
	a[i] = li.get(i);
	return a;
	}
	public static void main(String[] args) {
	int a[] = {26,32,76,62,80};
	int[] arr=getSorted(a);
	for(int i:arr)
	System.out.println(i);
	}
	}