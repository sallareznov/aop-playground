package fil.iagl.opl.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public aspect ATrace {
	
	pointcut printCall(): call(void B.print(String)) || execution(public void B.print(String));
	
	pointcut bCall(): call(void B.print(String));
	pointcut bExecution(): execution(public void B.print(String));
	
	before(): bCall() {
		System.out.println("---> bCall()");
		logPointCut(thisJoinPoint);
	}
	
	before(): bExecution() {
		System.out.println("---> bExecution()");
		logPointCut(thisJoinPoint);
	}
	
	public void logPointCut(JoinPoint joinPoint) {
		System.out.println("Source : " + joinPoint.getThis());
		System.out.println("Target : " + joinPoint.getTarget());
		System.out.println("Method name : " + joinPoint.getSignature());
		System.out.println("Parameters : ");
		Arrays.stream(joinPoint.getArgs()).forEach(arg -> System.out.println(" - " + arg));
	}

}
