package qu8_Facade;
/**
 * Facade Strategy to Simplify the Interface of a busy API
 * @author snewnham
 *
 */


public class ScheduleServerFacade {

	private ScheduleServer scheduleServer;
	
	
    public ScheduleServerFacade(ScheduleServer scheduleServer) {
       // throw new UnsupportedOperationException()
    		this.scheduleServer = scheduleServer;
    }

    
    // Wrap the starter
    public void startServer() {
    	scheduleServer.startBooting();
    	scheduleServer.readSystemConfigFile();
    	scheduleServer.init();
    	scheduleServer.initializeContext();
    	scheduleServer.initializeListeners();
    	scheduleServer.createSystemObjects();
    	System.out.println("Start working......");
    	System.out.println("After work done.........");
        //throw new UnsupportedOperationException();
    }

    public void stopServer() {
    	scheduleServer.releaseProcesses();
    	scheduleServer.destory();
    	scheduleServer.destroySystemObjects();
    	scheduleServer.destoryListeners();
    	scheduleServer.destoryContext();
    	scheduleServer.shutdown();
    	
    	// throw new UnsupportedOperationException();
    }
}