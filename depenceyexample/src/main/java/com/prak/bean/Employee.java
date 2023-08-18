package com.prak.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.*;
@Component

@ConfigurationProperties(prefix = "com.prak")
public class Employee
{
	
private int id;

public Map<String, String> getM() {
	return m;
}

public void setM(Map<String, String> m) {
	this.m = m;
}

private Map<String,String> m;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	return String.format("Employee [id=%s, m=%s]", id, m);
}

}
