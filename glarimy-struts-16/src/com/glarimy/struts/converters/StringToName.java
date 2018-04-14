package com.glarimy.struts.converters;

import java.util.Map;
import java.util.StringTokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.util.StrutsTypeConverter;

import com.glarimy.struts.directory.api.Name;

public class StringToName extends StrutsTypeConverter {
	private Logger logger = LogManager.getLogger(StringToName.class);

	public Object convertFromString(Map context, String[] values, Class toClass) {
		logger.debug("Converting " + values[0] + " to name");
		Name name = new Name();
		StringTokenizer st = new StringTokenizer(values[0], " ");
		if (st.hasMoreTokens()) {
			name.setFirstName(st.nextToken());
			if (st.hasMoreTokens()) {
				name.setLastName(st.nextToken());
				logger.debug("Converted " + values[0] + " to name");
			}
		}
		return name;
	}

	public String convertToString(Map context, Object o) {
		logger.debug("Converting name to string");
		Name name = (Name) o;
		String str = name.getFirstName() + " " + name.getLastName();
		logger.debug("Converted name to " + str);
		return str;
	}
}
