package com.project.management.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("status")
	private String status;
	@JsonProperty("type")
	private String type;
	@JsonProperty("priority")
	private String priority;
	@JsonProperty("expectedDaystoComplete")
	private int expectedDaystoComplete;
	@JsonProperty("resourceName")
	private String resourceName;
	@JsonProperty("projectName")
	private String projectName;
	
	
}
