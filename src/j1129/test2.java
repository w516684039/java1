package j1129;

public class test2 {
	public static void main(String[] args){
		String str = "abkkcdkkefkkskk";
		String key = "k";
		int count = getSubCount(str,key);
		System.out.println(count);
	}
	public static int getSubCount(String str, String key) {
		   int index = 0;
		   int count = 0;
		   while ((index = str.indexOf(key, index)) != -1) {
		     count++;
		     index = index + key.length();
		   }
		   
		   return count;
		}


}
