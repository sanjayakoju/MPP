package assignment.lab9Part1Prob1.business;


import java.util.List;


public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	
}