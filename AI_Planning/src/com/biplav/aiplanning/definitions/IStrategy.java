package com.biplav.aiplanning.definitions;

import java.util.Collection;

public interface IStrategy {
	
	public Collection<Node> getFringe();
	public Node selectNode(Collection<Node> fringe);
}
