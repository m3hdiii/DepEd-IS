package com.thesis.repository.coordinator;

import org.hibernate.sql.JoinType;

public class Alias {
	private String name;
	private String value;
	private JoinType joinType = JoinType.INNER_JOIN;

	public Alias(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public Alias(String name, String value, JoinType joinType) {
		this.name = name;
		this.value = value;
		this.joinType = joinType;
	}

	public JoinType getJoinType() {
		return this.joinType;
	}

	public String getName() {
		return this.name;
	}

	public String getValue() {
		return this.value;
	}

	public void setJoinType(JoinType joinType) {
		this.joinType = joinType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}
}