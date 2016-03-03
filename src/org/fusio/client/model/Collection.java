package org.fusio.client.model;

import java.util.List;

import com.google.api.client.util.Key;

public class Collection
{
	@Key
	private List<Todo> entry;

	public List<Todo> getEntry()
	{
		return entry;
	}

	public void setEntry(List<Todo> entry)
	{
		this.entry = entry;
	}
}
