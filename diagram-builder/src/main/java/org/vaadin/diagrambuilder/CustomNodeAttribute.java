package org.vaadin.diagrambuilder;

/**
 * Created by bsasschetti on 03/05/18.
 */
public class CustomNodeAttribute {
	private String name;
	private String defaultValue;

	public CustomNodeAttribute(String name) {
		this(name, "");
	}

	public CustomNodeAttribute(String name, String defaultValue) {
		this.name = name;
		this.defaultValue = defaultValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
}