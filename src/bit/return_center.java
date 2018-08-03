package bit;



class tt {
	  public String solution(String s) {
	      String answer = "";
	      int a = s.length();
	      if(a % 2 == 1){
	          answer = String.valueOf(s.charAt(a/2));
	      }else{
	          answer = String.valueOf(s.charAt(a/2-1))+String.valueOf(s.charAt(a/2));
	      }
	      String oo;
	      return answer;
	  }
	  String getMiddle(String word){

	        return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
	    }
	}

public class return_center {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		tt so = new tt();
		System.out.println(so.solution("grtpgr"));
	}
}


