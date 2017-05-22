package ex0206;

public class Student {
	private String name;
    private int math;
    private int  Japanese;
    private int English;
    private int total;
    private int average;


	public String getNamet() {
        return name;
     }

     public void setName(String nm){
  	   name = nm;
     }

     public int getmath(){
  	   return math;
     }

     public void setmath(int mat){
  	   math = mat;
     }

     public int getJapanese(){
    	 return Japanese;
     }

     public void setJapanese(int Jap){
    	Japanese = Jap;
     }

     public int getEnglish(){
    	 return English;
     }

     public void setEnglish(int Eng){
    	English = Eng;
     }

     public int gettotal() {
          return total;
     }

     public void settotal(){
    	 total = math + Japanese + English;
     }

     public int getaverage() {
    	 return average;
     }

     public void setaverage() {
    	 average = total ;
     }

     public void showAccount() {
          System.out.println(name + "---" + "　" +  math + "　" + English + "　" + Japanese + "　" + "合計" + total );
          System.out.println("------------------------------------------------------");
          System.out.println( "平均" + "　" +average );
     }
}



