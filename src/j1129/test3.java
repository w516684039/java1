package j1129;

public class test3 {
	public enum EnumGender{
		MALE,FEMALE;
	}
	public static void main(String[] args){
		EnumGender enumGender = EnumGender.MALE;
		if(enumGender == EnumGender.FEMALE){
			System.out.println("==");
		}
		if(enumGender.equals(EnumGender.FEMALE)){
			System.out.println("==");
		}
		switch(enumGender){
		case FEMALE:
			System.out.println("famale");
			break ;
		case MALE:
			System.out.println("male");
			break ;
		default:
			break;
		}
	}

}
