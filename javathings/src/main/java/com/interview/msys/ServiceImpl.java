package com.interview.msys;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServiceImpl implements Service {
	
	
	class Helper extends Thread{
		private Element element;
		private String extrinsicVal;
		
		Helper(Element element,String contextVal){
			this.element=element;
			this.extrinsicVal=contextVal;
		}
		
		public void run() {
			try {
				element.printVal(extrinsicVal);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void processRequest(int numofInstances, String elementType) {
       //Step 1. Instantiation
	  // since the objects are similar using flyweight pattern, create only one object per type .in our case string
	  // and the value is extrinsic to the object so as to not to run into out of memory error.
        ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		for(int i=1;i<=numofInstances;i++) {
			//Create instance
			Element element = ElementFactory.getElemantInstance("String");//return only one instance from cache unless type is diff
			Helper helper = new Helper(element,String.valueOf(i));
			executorService.submit(helper);
		}
		executorService.shutdown();
	}

}
