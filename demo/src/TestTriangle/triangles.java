package TestTriangle;


public class triangles {

    
	public static String take(int money) {
		int accept[]= {0,1,2,3,5,6,7,8,10,11,12,13,20,21,22,23,25,26,27,28,30,31,32,33,50,51,52,53,55,56,57,58,60,61,62,63,70,71,72,73,75,76,77,78,80,81,82,83};
		int len=accept.length;
		for(int i=0;i<len;i++) {
			if(money==accept[i]) {
				return "true";
			}
		}
		return "false";
	}
    
}
