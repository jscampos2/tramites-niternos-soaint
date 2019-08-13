package com.myspace.soaint.listenet
;
import org.kie.api.event.process.*;

public class ProcessEventListener implements org.kie.api.event.process.ProcessEventListener {

	@Override
	public void beforeProcessStarted(ProcessStartedEvent event) {
		// TODO Auto-generated method stub
	System.out.println("beforeProcessStarted:"+ event);	
	}

	@Override
	public void afterProcessStarted(ProcessStartedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterProcessStarted:"+ event);
	}

	@Override
	public void beforeProcessCompleted(ProcessCompletedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeProcessCompleted:"+ event);
	}

	@Override
	public void afterProcessCompleted(ProcessCompletedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterProcessCompleted:"+ event);
	}

	@Override
	public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeNodeTriggered:"+ event);
	}

	@Override
	public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterNodeTriggered:"+ event);
	}

	@Override
	public void beforeNodeLeft(ProcessNodeLeftEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeNodeLeft:"+ event);
	}

	@Override
	public void afterNodeLeft(ProcessNodeLeftEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterNodeLeft:"+ event);
	}

	@Override
	public void beforeVariableChanged(ProcessVariableChangedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeVariableChanged:"+ event);
	}

	@Override
	public void afterVariableChanged(ProcessVariableChangedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterVariableChanged:"+ event);
	}

}
