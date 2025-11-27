package ownUtil;

public interface Observable {

	public void addObserver(Observer abs);
	
	public void removeObserver(Observer abs);
	
	public void notifyObservers();
}
