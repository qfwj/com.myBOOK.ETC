import java.util.EnumMap;
import java.util.Map;

/**
* @Project: EffectiveJava
* @Title: EnumMap33.java
* @Description: TODO
* @author: zhongbo
* @date :2016年2月23日 上午8:59:47
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

/**
* @ClassName: EnumMap33
* @Description: TODO
* @author: zhongbo
* @date: 2016年2月23日上午8:59:47
* @remark: 
*/

enum Phase{
	SOLID,LIQUID,GAS;
	enum Transaction{
		A1,A2,A3,A4;
	}
	
}
public class EnumMap33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Phase,Map<Phase,Phase.Transaction>> TT = new EnumMap<Phase,Map<Phase,Phase.Transaction>>(Phase.class);
	}

}




