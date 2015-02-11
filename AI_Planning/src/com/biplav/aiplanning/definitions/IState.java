package com.biplav.aiplanning.definitions;

import java.util.Collection;

public interface IState {
	
	public Collection<IState> successor();

}
