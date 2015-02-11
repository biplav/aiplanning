package com.biplav.aiplanning.problems.monkcanibbal;

import java.util.Collection;

import com.biplav.aiplanning.definitions.IProblem;
import com.biplav.aiplanning.definitions.IState;

public class MissionaryCannibalProblem implements IProblem {

	@Override
	public IState getInitialState() {
		return new State(3, 3, 0, 0, true);
	}

	@Override
	public Boolean goalTest(IState state) {
		State mcState = (State) state;
		if(mcState.cannibals_right == 3 && mcState.missionaries_right == 3)
			return true;
		return false;
	}

	@Override
	public Collection<IState> expand(IState state) {
		return ((State)state).successor();
	}

}
