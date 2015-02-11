package com.biplav.aiplanning.definitions;

import java.util.Collection;

public interface IProblem {

	public IState getInitialState();
	public Boolean goalTest(IState state);
	public Collection<IState> expand(IState state);
}
