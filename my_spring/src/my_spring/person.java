/**
* @Project: my_spring
* @Title: person.java
* @Description: TODO
* @author: zhongbo
* @date :2015年11月4日 上午10:49:24
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package my_spring;
/**
* @ClassName: person
* @Description: TODO
* @author: zhongbo
* @date: 2015年11月4日上午10:49:24
* @remark: 
*/

public class person {
	
 private stoneAxe axe;
 private steelstone steel;
 person(steelstone steel){
	 this.steel = steel;
 }
 
 public void useAxe(){
	 axe.use();
	 steel.chop();
 }

public stoneAxe getAxe() {
	return axe;
}

public void setAxe(stoneAxe axe) {
	this.axe = axe;
}
}




