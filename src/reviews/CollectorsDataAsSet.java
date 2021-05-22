package reviews;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Attendance{    
	   int id;     
	   String name;  
	   int age;           
	   
	   public Attendance(int id, String name, int age) {   
		   
	       this.id = id;         
	       this.name = name;       
	       this.age = age;      
	   } 
	}  

public class CollectorsDataAsSet {

	public static void main(String[] args) {

		 List<Attendance> studentlist = new ArrayList<Attendance>();       
	           
	      studentlist.add(new Attendance(11,"Bharath",22));         
	      studentlist.add(new Attendance(22,"Adithya",18));         
	      studentlist.add(new Attendance(33,"Kareem",22));         
	      studentlist.add(new Attendance(44,"Sumanth",23));         
	                      
	           
	      Set<Attendance> students = studentlist.stream().filter(n-> n.id>22).collect(Collectors.toSet());
	           
	      for(Attendance stu : students) { 
	    	  
	         System.out.println(stu.id+" "+stu.name+" "+stu.age); 
	      }           

	}

}
