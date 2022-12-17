package javafullcoursepart2;

public class countercharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder("Kishore-babu 1s @ Go@d Boy");
		System.out.println(s);
		int uppercase=0,lowercase=0,space=0,number=0,vowels=0;
		for (int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)>=97 && s.charAt(i)<=122 ) {
				lowercase++;
			}
			if(s.charAt(i)>=65 && s.charAt(i)<=90 ) {
				uppercase++;
			}
			if(s.charAt(i)==32 ) {
				space++;
			}
			if(s.charAt(i)>=48 && s.charAt(i)<=57 ) {
				number++;
			}
			
			if(s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||
					s.charAt(i)=='U' || s.charAt(i)=='a' ||s.charAt(i)=='e' ||
					s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'       ) {
				vowels++;
			}
			
			
		}
		System.out.println("LOWERCASE :"+ lowercase);
		System.out.println("UPPERCASE :"+ uppercase);
		System.out.println("SPACE :"+ space);
		System.out.println("NUMBER :"+ number);
		System.out.println("VOWELS :"+ vowels);

		System.out.println("SPECIAL CHARACTERS :"+ (s.length()-(uppercase+lowercase+number+space)));



	}

}
