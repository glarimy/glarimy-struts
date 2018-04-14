package com.glarimy.struts;

import java.util.Map;
import java.util.StringTokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.util.StrutsTypeConverter;

public class StringToPublisher extends StrutsTypeConverter {
	private Logger logger = LogManager.getLogger(StringToPublisher.class);

	public Object convertFromString(Map context, String[] values, Class toClass) {
		logger.debug("Converting " + values[0] + " to publisher");
		Publisher publisher = new Publisher();
		StringTokenizer st = new StringTokenizer(values[0], " ()");
		publisher.setName(st.nextToken());
		long phoneNumber = 0;
		try {
			String phoneString = st.nextToken();
			phoneNumber = Long.parseLong(phoneString);
		} catch (Exception e) {

		}

		publisher.setPhoneNumber(phoneNumber);
		logger.debug("Converted " + values[0] + " to publisher");
		return publisher;
	}

	public String convertToString(Map context, Object o) {
		logger.debug("Converting pubslisher to string");
		Publisher publisher = (Publisher) o;
		String str = publisher.getName();
		if (publisher.getPhoneNumber() != 0)
			str += " (" + publisher.getPhoneNumber() + ") ";
		logger.debug("Converted pubslisher to " + str);
		return str;
	}
}
