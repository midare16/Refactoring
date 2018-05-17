
package java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List2Map {
	
	<T> void readability(List<T> ts){
		
		Map<String,List<T>> map1 = new LinkedHashMap<String, List<T>>();
		if(null != ts && ts.size() > 0)
		{
			for (T t : ts)
			{
				List<T> subts = map1.get(t.getId());
				if(null == subts)
				{
					subts = new ArrayList<T>();
				}
				subts.add(t);
				map1.put(t.getId(),subts);
			}
		}
//		***************************************************
		Map<String,List<T>> map2 = ts.stream()
				.collect(Collectors.groupingBy(T::getId));
	}
}
