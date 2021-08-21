package JavaSessions;

public class StringPractices {

public static void main(String[] args) {
	
//	String st = "   Hi this is my java code and I am so happy  ";
//
//
//	System.out.println(st.trim());
//	
//	System.out.println(st.replaceAll("\\s",""));
//	
//	String s1 = "   Hi this is my java code and I am so happy  ";
//
//         if (s1.contains("java")) {
//		
//        	 System.out.println("Statement is correct");
//		}else
//		{
//			System.out.println("statement is in correct");
//		}
//
//         if(s1.indexOf("java")>=0)
//         {
//        	 System.out.println("The Statement is correct");
//         }
//
//         String s2="Hello";
//         String s3=" Selenium";
//         
//         System.out.println(s2.concat(s3).concat(" I am an open source"));
//
//         //Comparison
//         
//         if (s2.equals("Selenium")) {
//			System.out.println(" correct ");
//		}else
//		{
//			System.out.println("in correct ");
//
//		}
//
//   String sd="HI my id is 123456";
//
//      System.out.println( sd.substring(sd.indexOf("is")+3,sd.length()));
//
//      
//      System.out.println(sd.substring(sd.indexOf("my")+3,sd.lastIndexOf("is")));
      
 String sa=" xXseleniumxXXx javaxX        ";
 
// String Array[]=sa.split("xX");
//
//System.out.println(Array[0]);
//System.out.println(Array[1]);
//System.out.println(Array[2]);


System.out.println(sa.charAt(9));
System.out.println(sa.codePointAt(0));
System.out.println(sa.compareTo(sa));
System.out.println(sa.endsWith("xX"));
System.out.println(sa.indexOf(0));
System.out.println(sa.replace("xX",""));
System.out.println(sa.strip());
System.out.println(sa.compareToIgnoreCase("xXseleniumxXXx javaxX "));
//System.out.println(sa.charAt(9));





System.out.println(helloName("BOB"));
System.out.println(makeAbba("Hi","Bye"));
System.out.println(makeAbba("Yo","Alice"));
System.out.println(makeTags("i","Yay"));


}

public static String helloName(String name) {
	  return "Hello "+name;
	}


public static String makeAbba(String a, String b) {
	  return a+b+b+a;
}


public static String makeTags(String tag, String word) {
	  //makeTags("i", "Yay") → "<i>Yay</i>"
	  return "<"+tag+">"+word+"</"+tag+">";// works Fine
	  
	}








}
