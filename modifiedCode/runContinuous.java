 public void runContinuous(){

 	_running = true;

 	while(_running){

 		System.out.println("Running.....");

 		try{

 			Thread.sleep(20);
 		}

 		catch(InterruptedException x){

 		}

 		backup();
 		calculateNextIteration();
 	}
 }