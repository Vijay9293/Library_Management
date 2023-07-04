package jdbcPrograms;


public class MainClassCollege
{
	
	public static void main(String[] args)
	  
	{
		College c =Departement.getCollege();
		c.addStudent();
		c.updateStudent();
		c.deleteStudent();
		c.selectStudent();
	}
	
}
