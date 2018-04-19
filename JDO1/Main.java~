package JDO1;
import java.util.*;
import javax.persistence.*;
public class Main {
	static EntityManagerFactory
	emf=Persistence.createEntityManagerFactory("f.odb");
	static EntityManager em=emf.createEntityManager();
	static Scanner sc=new Scanner(System.in);

	static void insert()
	{
		em.getTransaction().begin();
		System.out.println("Enter the no of records :");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the name of players :");
			String name=sc.next();
			System.out.print("Enter no matches :");
			int no_of_matches =sc.nextInt();
			
			System.out.print("Enter Runs scored :");
			int runs =sc.nextInt();
			
			Emp e=new Emp(name, no_of_matches, runs);
			em.persist(e);
			
		}
		System.out.println("Successfully inserted");
		em.getTransaction().commit();
		
	}
	static void display()
	{
		em.getTransaction().begin();
//		String q="SELECT emp from Emp emp where runs > 9000";
		//String q="SELECT emp from Emp emp order by no_of_matches desc";
		String q="SELECT emp from Emp emp where runs between 3000 and 11000";
		TypedQuery<Emp> a = em.createQuery(q,Emp.class);
		
		List<Emp> l =a.getResultList();
		for(Emp e:l)
		{
			System.out.println(e.toString());
			
		}
		
		
		em.getTransaction().commit();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//insert();
		display();
		

	}

}

/*Design an application for players management system (name, no. of matches, runs) 
 * with Persistent Objects using JDO and implement following JDOQL queries: 
 * a. All players having runs greater than 5000 
 * b. List of all players in ascending order of no. of matches 
 * c. List of players having runs in the range of 3000 to 8000 
 */
 