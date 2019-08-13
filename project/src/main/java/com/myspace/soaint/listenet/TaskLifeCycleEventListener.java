package com.myspace.soaint.listenet;

import org.kie.api.task.*;

public class TaskLifeCycleEventListener implements org.kie.api.task.TaskLifeCycleEventListener {

	@Override
	public void beforeTaskActivatedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskActivatedEventd:"+ event);
	}

	@Override
	public void beforeTaskClaimedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskClaimedEvent:"+ event);
	}

	@Override
	public void beforeTaskSkippedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskSkippedEvent:"+ event);
	}

	@Override
	public void beforeTaskStartedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskStartedEvent:"+ event);
	}

	@Override
	public void beforeTaskStoppedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskStoppedEvent:"+ event);
	}

	@Override
	public void beforeTaskCompletedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskCompletedEvent:"+ event);
	}

	@Override
	public void beforeTaskFailedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskFailedEvent:"+ event);
	}

	@Override
	public void beforeTaskAddedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskAddedEvent:"+ event);
	}

	@Override
	public void beforeTaskExitedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskExitedEvent:"+ event);
	}

	@Override
	public void beforeTaskReleasedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskReleasedEvent:"+ event);
	}

	@Override
	public void beforeTaskResumedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskResumedEvent:"+ event);
	}

	@Override
	public void beforeTaskSuspendedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskSuspendedEvent:"+ event);
	}

	@Override
	public void beforeTaskForwardedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskForwardedEvent:"+ event);
	}

	@Override
	public void beforeTaskDelegatedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskDelegatedEvent:"+ event);
	}

	@Override
	public void beforeTaskNominatedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("beforeTaskNominatedEvent:"+ event);
	}

	@Override
	public void afterTaskActivatedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskActivatedEvent:"+ event);
	}

	@Override
	public void afterTaskClaimedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskClaimedEvent:"+ event);
	}

	@Override
	public void afterTaskSkippedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskSkippedEvent:"+ event);
	}

	@Override
	public void afterTaskStartedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskStartedEvent:"+ event);
	}

	@Override
	public void afterTaskStoppedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskStoppedEvent:"+ event);
	}

	@Override
	public void afterTaskCompletedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskCompletedEvent:"+ event);
	}

	@Override
	public void afterTaskFailedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskFailedEvent:"+ event);
	}

	@Override
	public void afterTaskAddedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskAddedEvent:"+ event);
	}

	@Override
	public void afterTaskExitedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskExitedEvent:"+ event);
	}

	@Override
	public void afterTaskReleasedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskReleasedEvent:"+ event);
	}

	@Override
	public void afterTaskResumedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskResumedEvent:"+ event);
	}

	@Override
	public void afterTaskSuspendedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskSuspendedEvent:"+ event);
	}

	@Override
	public void afterTaskForwardedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskForwardedEvent:"+ event);
	}

	@Override
	public void afterTaskDelegatedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskDelegatedEvent:"+ event);
	}

	@Override
	public void afterTaskNominatedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.println("afterTaskNominatedEvent:"+ event);
	}

}
