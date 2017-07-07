package com.thesis.repository.coordinator;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FetchInfo<K> implements Serializable {
	private static final long serialVersionUID = 1L;
	private Class<K> entity = null;
	private List<Criterion> criterions = null;
	private Order order = null;
	private int firstResult = 0;
	private int maxResult = 0;
	private String unitName = "";
	private Map<String, String> alias = new HashMap<String, String>();

	public FetchInfo(Class<K> entityClass) {
		this(entityClass, null, -1, -1, "", null);
	}

	public FetchInfo(Class<K> entityClass, List<Criterion> criterions) {
		this(entityClass, null, -1, -1, "", criterions);
	}

	public FetchInfo(Class<K> entityClass, Order order, int firstResult, int maxResult, String unitName, List<Criterion> criterions) {
		this.entity = entityClass;
		this.order = order;
		this.firstResult = firstResult;
		this.maxResult = maxResult;
		this.unitName = unitName;
		this.criterions = criterions;
	}

	public void addAlias(String name, String value) {
		this.alias.put(name, value);
	}

	public void addCriterion(Criterion criterion) {
		if (this.criterions == null)
			this.criterions = new ArrayList<Criterion>();
		this.criterions.add(criterion);
	}

	public Map<String, String> getAlias() {
		return this.alias;
	}

	public List<Criterion> getCriterions() {
		return this.criterions;
	}

	public Class<K> getEntityClass() {
		return this.entity;
	}

	public int getFirstResult() {
		return this.firstResult;
	}

	public int getMaxResult() {
		return this.maxResult;
	}

	public Order getOrder() {
		return this.order;
	}

	public String getUnitName() {
		return this.unitName;
	}

	public void setAlias(Map<String, String> alias) {
		this.alias = alias;
	}

	public void setEntityClass(Class<K> entityClass) {
		this.entity = entityClass;
	}

	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
	}

	public void setMaxResult(int maxResult) {
		this.maxResult = maxResult;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
}