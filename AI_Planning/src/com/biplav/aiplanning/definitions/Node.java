package com.biplav.aiplanning.definitions;

public class Node {
	
	private Node parent;
	private IState state;
	private IAction action;
	private int depth;
	
	
	public Node(Node parent, IState state, IAction action, int depth) {
		super();
		this.parent = parent;
		this.state = state;
		this.action = action;
		this.depth = depth;
	}
	
	public IState getState() {
		return state;
	}
	public void setState(IState state) {
		this.state = state;
	}
	public IAction getAction() {
		return action;
	}
	public void setAction(IAction action) {
		this.action = action;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
}
