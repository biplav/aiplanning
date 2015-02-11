package com.biplav.aiplanning.problems.monkcanibbal;

import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import com.biplav.aiplanning.definitions.IState;
import com.biplav.aiplanning.definitions.IStrategy;
import com.biplav.aiplanning.definitions.Node;

public class MissionaryCannibalStrategyDFS implements IStrategy {
	
	Set<IState> visitedStates = new HashSet<IState>();
	
	@Override
	public Collection<Node> getFringe() {
		return new LinkedList<Node>();
	}

	@Override
	public Node selectNode(Collection<Node> fringe) {
		if(fringe.isEmpty()) return null;
		Node node = ((Deque<Node>)fringe).pollFirst();
		if(visitedStates.contains(node.getState())) {
			node =  selectNode(fringe);
		}
		if(node != null) {
			visitedStates.add(node.getState());
			//System.out.println("Selected State " + node.getState());
		}
		return node;
	}

}
