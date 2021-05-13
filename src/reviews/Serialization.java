package reviews;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Studentinfo implements Serializable {
    
	String name;
    int id;
    static String contact;
    Studentinfo(String n, int i, String c)
    {
    this.name = n;
    this.id = i;
    this.contact = c;
    }
}


public class Serialization {

	public static void main(String[] args) {
		
		try
        {
            Studentinfo si = new Studentinfo("Adithya", 11, "8074425828");
            
            FileOutputStream fos = new FileOutputStream("student.txt");
            
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(si);
            
            oos.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
            
            
        }

	}

}
