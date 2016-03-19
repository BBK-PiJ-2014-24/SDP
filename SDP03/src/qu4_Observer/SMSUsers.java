package qu4_Observer;

// This is the Oberservable Class

public class SMSUsers implements Observer {

	
	// Fields
	// ------
	private Subject subject;   // Passing the SUBJECT to the OBSERVER
	private String name; // The name of the OBSERVER
	private String msg; // Messages sent to the Observer from the subject
	
	// Constructor
	// -----------
    public SMSUsers(Subject s, String msg){
    	this.subject = s;
    	this.name = msg;
    }


	@Override
	public void update(String desc) {
		this.msg = desc;
		System.out.println(name + " received msg: " + this.msg);
	}
    

    @Override
    public void subscribe() {
    	subject.subscribeObserver(this);
    }

    @Override
    public void unSubscribe() {
    	subject.unSubscribeObserver(this);
    }


    public String getName(){
    	return this.name;
    }



}
