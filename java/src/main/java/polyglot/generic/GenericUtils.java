package polyglot.generic;

import java.lang.reflect.Method;

public final class GenericUtils{


	/**
	 * This static method uses generics to create a generic way
	 * of copying properties from one object to another
	 *
	 * @param from
	 * @return an instance of the generic type
	 *
	 **/
	public static <T> T copyPropertiesFrom(T from) throws Exception {
		Class<?> clazz = from.getClass();
		Method[] methods = clazz.getDeclaredMethods();
		T newObject = (T) clazz.newInstance();

		for(Method method: methods){
			String methodName = method.getName();
			if (methodName.startsWith("set")){
				method.invoke(
					newObject,
					clazz.getDeclaredMethod(
						methodName.replace("set","get")
					).invoke(from)
				);
			}
		}

		return newObject;
	}


}
