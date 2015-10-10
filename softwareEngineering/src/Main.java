

import java.util.*;

public class Main
{

	public static void main(String [] args)
	{
		Office officeInstance = Office.getOffice();
		officeInstance.makePersons();
		
		System.out.println(officeInstance.getPersonList().get(0).distance(officeInstance.getPersonList().get(2)));
		
		/*
		 * Office tested and works
		 * 
		 */
		/*
		Person a = new Person("a", "N,N");
		Person b = new Person("b", "N,Y");
		Person c = new Person("c", "Y,N");
		Person d = new Person("d", "Y,Y");
		Person e = new Person("e", "Y,N");
		Person f = new Person("f", "N,Y");
		
		ArrayList<Person> people= new ArrayList<>();
		people.add(a);
		people.add(b);
		
		people.add(c);
		people.add(d);
		people.add(e);
		people.add(f);
		
		a.addPreference(b);
		a.addPreference(d);
		a.addPreference(f);
		a.addPreference(c);
		a.addPreference(e);
		
		b.addPreference(d);
		b.addPreference(e);
		b.addPreference(f);
		b.addPreference(a);
		b.addPreference(c);
		
		c.addPreference(d);
		c.addPreference(e);
		c.addPreference(f);
		c.addPreference(a);
		c.addPreference(b);
		
		d.addPreference(f);
		d.addPreference(c);
		d.addPreference(a);
		d.addPreference(e);
		d.addPreference(b);
		
		e.addPreference(f);
		e.addPreference(c);
		e.addPreference(d);
		e.addPreference(b);
		e.addPreference(a);
		
		f.addPreference(a);
		f.addPreference(b);
		f.addPreference(d);
		f.addPreference(c);
		f.addPreference(e);

/*		
		Person a = new Person("a");
		Person b = new Person("b");
		Person c = new Person("c");
		Person m = new Person("m");
		
		ArrayList<Person> people= new ArrayList<>();
		people.add(a);
		people.add(b);
		people.add(c);
		people.add(m);
		
		a.addPreference(b);
		a.addPreference(c);
		a.addPreference(m);
		
		b.addPreference(c);
		b.addPreference(a);
		b.addPreference(m);
		
		c.addPreference(a);
		c.addPreference(b);
		c.addPreference(m);
		
		m.addPreference(a);
		m.addPreference(b);
		m.addPreference(c);
		*/
		/*
		
		Person a = new Person("a");
		Person b = new Person("b");
		Person c = new Person("c");
		Person d = new Person("d");
		
		Person[] arrPeople = {a,b,c,d};
		
		ArrayList<Person> people= new ArrayList<>();
		people.addAll(Arrays.asList(arrPeople));
		
		Person[] prefA = {b,c,d}; 
		Person[] prefB = {a,d,c};
		Person[] prefC = {d,a,b};
		Person[] prefD = {c,b,a};
		
		a.addPreference(prefA);
		b.addPreference(prefB);
		c.addPreference(prefC);
		d.addPreference(prefD);

		*/
		///////////////////////////////////////////////////////////////////////////////////
		/*
		
		PreferenceMatrix p = new PreferenceMatrix(people);
		
		p.Stage1();
		p.displayMatrix();
		System.out.println("================================");
		p.Stage2();
		p.displayMatrix();
		p.Stage3();
        System.out.println("================================");
		p.displayMatrix();
		System.out.println("================================");
		p.displayFinalResult();
		*/
    }
	
}
