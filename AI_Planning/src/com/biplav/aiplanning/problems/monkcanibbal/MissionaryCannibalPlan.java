package com.biplav.aiplanning.problems.monkcanibbal;

import java.util.Collection;
import java.util.Date;
import java.util.Deque;

import com.biplav.aiplanning.definitions.Node;
import com.biplav.aiplanning.definitions.TreeSearch;

public class MissionaryCannibalPlan {

	public static void main(String[] args) {
		executeForBFS();
		executeForDFS();
	}

	private static void executeForBFS() {
		TreeSearch tsBFS = new TreeSearch();
		MissionaryCannibalStrategyBFS strategyBFS = new MissionaryCannibalStrategyBFS();
		MissionaryCannibalProblem problemBFS = new MissionaryCannibalProblem();
		long nowBFS = (new Date()).getTime();
		Collection<Node> solutionBFS = tsBFS.search(problemBFS, strategyBFS);
		printSolution(solutionBFS);
		System.out.println("Time consumed is " + ((new Date()).getTime() - nowBFS));
	}

	private static void executeForDFS() {
		TreeSearch tsDFS = new TreeSearch();
		MissionaryCannibalStrategyDFS strategyDFS = new MissionaryCannibalStrategyDFS();
		MissionaryCannibalProblem problemDFS = new MissionaryCannibalProblem();
		long now = (new Date()).getTime();
		Collection<Node> solutionDFS = tsDFS.search(problemDFS, strategyDFS);
		printSolution(solutionDFS);
		System.out.println("Time consumed is " + ((new Date()).getTime() - now));
	}

	private static void printSolution(Collection<Node> solution) {
		if(solution == null) {
			System.out.println("Failed to plan!");
		} else {
			while(!solution.isEmpty()) {
				Node node = ((Deque<Node>)solution).pop();
				System.out.println(node.getDepth() + ":"+node.getState());
			}
		}
	}
}
