package chapter04;

public class CharArray02 {

	public static void main(String[] args) {
		
		char alphabet[] = new char[26];
		char ch = 'A'; // 65
		//System.out.println(++ch);//B
		
//		for(int i = 0 ; i < alphabet.length ; i++) {
//			alphabet[i] += ch++;
//			System.out.print(alphabet[i]+" ");
//		}
			
		for(int i = 0 ; i < alphabet.length ; i++, ch++) {
			alphabet[i] += ch;
			System.out.print(alphabet[i]+": "+(int)(alphabet[i])+" / ");
		} 
		System.out.println();
		System.out.println(alphabet);
		System.out.println(alphabet[5]+","+alphabet[7]+", "+(alphabet[5]+alphabet[7])+", "+alphabet[(5+7)]);
	}
}
