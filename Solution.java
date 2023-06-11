import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr) {
		ArrayList<Integer> li=new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.size();i++){
			if(!map.containsKey(arr.get(i))){
				li.add(arr.get(i));
				map.put(arr.get(i),1);
			}

		}
		return li;
		
	}
}

/* arr=[1,2,3,2,3,4]
Answer:-[1,2,3,4]
*/
