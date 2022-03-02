package aop;

public aspect RefereeAspect {
	
	pointcut check(Main m):
		target(m) &&
		call(Referee Main.turn(String));
	
	after (Main m) returning (Referee r): check(m){
		r.checkGame();
	}
	
}

