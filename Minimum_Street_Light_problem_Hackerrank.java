/*

Question – Minimum streets lights
Problem Statement -: Street Lights are installed at every position along a 1-D road of length n. Locations[] (an array) represents the coverage limit of these lights. The ith light has a coverage limit of locations[i] that can range from the position max((i – locations[i]), 1) to min((i + locations[i]), n ) (Closed intervals). Initially all the lights are switched off. Find the minimum number of fountains that must be switched on to cover the road.

Example

n = 3

locations[] = {0, 2, 13}then

For position 1: locations[1] = 0, max((1 – 0),

1) to mini (1+0), 3) gives range = 1 to 1

For position 2: locations[2] = 2, max((2-2),

1) to min( (2+2), 3) gives range = 1 to 3

For position 3: locations[3] = 1, max( (3-1),

1) to min( (3+1), 3) gives range = 2 to 3

For the entire length of this road to be covered, only the light at position 2 needs to be activated.

Returns:

int : the minimum number of street lights that must be activated

Constraints :

1<_n<_ 10^5
 O<_locations[i] <_ mini (n,100) (where 1 <_1<_10^5)
Sample Input For Custom Testing :

3 ->locations[] size n = 3

1 ->locations[] [1, 1, 1]

1 ->Sample Output

Sample Output :

1

*/
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Pair{
	Integer a;
	Integer b;
	Pair(){
		
	}
	Pair(Integer a,Integer b){
		this.a=a;
		this.b=b;
	}
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
	
}
class SortingPair implements Comparator<Pair>{

	@Override
	public int compare(Pair o1, Pair o2) {
		if(o1.getA()==o2.getA()) {
			if(o1.getB()<o2.getB()) {
				return 1;
			}else {
				return 0;
			}
		}
		if(o1.getA()<o2.getA()) {
			return 1;
		}else {
			return 0;
		}
	}
}
public class Application2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int location[]=new int[n];
		for(int i=0;i<n;i++) {
			location[i]=sc.nextInt();
		}
		System.out.println(solve(location,n));
	}
	private static int solve(int[] location, int n) {
		Pair range[] = new Pair[n];
		for(int i=0;i<n;i++) {
			int id=i+1;
			range[i] = new Pair();
			range[i].setA(Math.max(1, id-location[i]));
			range[i].setB(Math.min(n, id+location[i]));
		}
		Arrays.sort(range,new SortingPair());
		int i=0,ans=0;
		while(i<n) {
			Pair p=range[i];
			ans++;
			while(i+1<n && range[i].getA()==range[i+1].getA()) {
				p.b=Math.max(p.getB(), range[i+1].getB());
				i++;
			}
			while(i<n && range[i].getB()<=p.getB()) {
				i++;
			}
		}
		return ans;
	}
}
