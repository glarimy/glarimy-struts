package com.glarimy.struts;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;

public class BookList {
	private List<String> titles = new ArrayList<>();

	public List<String> getTitles() {
		return titles;
	}

	public void setTitles(List<String> titles) {
		this.titles = titles;
	}

	public String execute() {
		titles.add("First Book");
		titles.add("Second Book");
		titles.add("Third Book");
		titles.add("Fourth Book");
		return Action.SUCCESS;
	}
}
