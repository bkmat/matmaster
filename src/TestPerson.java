import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.google.common.base.Optional;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;


public class TestPerson {

	HashMap<String, String> hmap = new HashMap<String, String>();

	public static void main(String[] args) {	
		Person p =  new Person();
		p.setFirstName("brajen ");
		p.setLastName("mathema");
		
		
		if(Optional.fromNullable(p.getAge()).isPresent()){
			p.setAge("17");
		}
		
		Optional<Person> optPerson = Optional.of(p);
		System.out.println("person first a>> "+optPerson.get().getFirstName().isEmpty());
		System.out.println("person mid name>> "+optPerson.get().getMiddleName());
		System.out.println("person last name>> "+optPerson.get().getLastName());
		System.out.println("person age>> "+optPerson.get().getAge());
		
		remove_null_from_list_guava_collections2(p);
				
	}
	
	public static void remove_null_from_list_guava_collections2 (Person p) {

	    List<Person> strings = Lists.newArrayList(p);
	    
	    Collection<Person> filterStrings = Collections2.filter(strings, Predicates.notNull());
	    System.out.println("filterStrings >> "+filterStrings);
	}
}
