import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:narendra_kadali@hotmail.com">Narendra</a>
 *
 *
 * @version
 * @since Aug 27, 2011 5:21:49 AM
 */
public class TestReflection {
	/**
	 *
	 * @param valueObj
	 * @return
	 * @since Aug 27, 2011 5:27:19 AM
	 * @author Narendra
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	public static Map getFieldNamesAndValues(final Object valueObj)
			throws IllegalArgumentException, IllegalAccessException {
		Class c1 = valueObj.getClass();
		System.out.println("Class name got is:: " + c1.getName());

		Map fieldMap = new HashMap();
		Field[] valueObjFields = c1.getDeclaredFields();

		// compare values now
		for (int i = 0; i < valueObjFields.length; i++) {

			String fieldName = valueObjFields[i].getName();

			System.out.println("Getting Field Values for Field:: "
					+ valueObjFields[i].getName());
			valueObjFields[i].setAccessible(true);

			Object newObj = valueObjFields[i].get(valueObj);

			System.out.println("Value of field" + fieldName + "newObj:: "
					+ newObj);
			fieldMap.put(fieldName, newObj);

		}
		System.out.println("End - getFieldNamesAndValues");
		return fieldMap;
	}

	public static void main(String args[]) {
		Person p =  new Person();
		try {
			System.out.println(getFieldNamesAndValues(p));
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
