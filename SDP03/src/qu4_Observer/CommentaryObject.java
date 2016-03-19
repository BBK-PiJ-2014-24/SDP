package qu4_Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *  This is the implementation of the Commentary Class, which implements the Subject (Observable)
 *  Interface and the Commentary Interface as well (So commentary class combines as comment making 
 *  machine as well as a observable object)
 * @author snewnham
 *
 */

public class CommentaryObject implements Subject, Commentary {

	// Fields
	// ------
	private List<Observer> subscribers;  // List of observers
	private String title;  // Title of Sport Commentary Object
	private String msg;  // Comments to be sent
	
	// Constructor
	// -----------
    public CommentaryObject(List<Observer> subscribers, String title) {
    	this.subscribers = subscribers;
    	this.title = title;
    }

    @Override
    public void subscribeObserver(Observer observer) {
    	this.subscribers.add(observer);   // add observer to the list
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
    	this.subscribers.remove(observer);   // delete observer from the list
    }

    @Override
    public void notifyObservers() {
    	for(Observer o : this.subscribers){
    		o.update(msg);   		// For each observer in the loop, call the observer's update()
    	}							// and push the message to them!!
    }

    @Override
    public String subjectDetails() {
        return title;   
    }

	@Override
	public void setDesc(String desc) {
		this.msg = desc;
		this.notifyObservers();
	}
}
