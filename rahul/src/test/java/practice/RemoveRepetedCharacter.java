package practice;


public class RemoveRepetedCharacter {
	public static void main(String[] args) {
		String str= "rahulkumar";
		char[] arr = str.toCharArray();
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean repeated= false;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					repeated= true;
					break;
				}
				
			}
			if (!repeated) {
				sb.append(arr[i]);
			}
			
		}
		System.out.println(sb);
	
		

}
}
