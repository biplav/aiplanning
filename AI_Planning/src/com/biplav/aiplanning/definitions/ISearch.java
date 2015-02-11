package com.biplav.aiplanning.definitions;

import java.util.Collection;

public interface ISearch {

	public Collection<Node> search(IProblem problem, IStrategy strategy);
	public Node selectFrom(IStrategy strategy);
	public Collection<Node> expand(IProblem problem, Node node);
	public Collection<Node> pathTo(Node node);
	
}
