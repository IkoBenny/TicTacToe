package aop;

public class Referee {
	Board b;
	boolean gameOver = false; 
	
	public Referee(Board b) {
		this.b = b;
	}
	
	public void checkGame() {
		if(isFarLeftVeritcal() || isMiddleVeritcal() || isRightVertical() || isTopHorizontal() || isMiddleHorizontal() || isBottomHorizontal()
				|| isForwardDiagonal() || isBackwardDiagonal() || b.boardFilled()) {
			gameOver = true;
			System.out.println("Game is over.");
		}
			
		}

	public Board getB() {
		return b;
	}

	public boolean isFarLeftVeritcal() {
		if (b.getTopLeft().equals(b.getX()) && b.getMiddleLeft().equals(b.getX())
				&& b.getMiddleLeft().equals((b.getX())))
			return true;
		else if (b.getTopLeft().equals(b.getO()) && b.getMiddleLeft().equals(b.getO())
				&& b.getMiddleLeft().equals((b.getO())))
			return true;
		else
			return false;
	}

	public boolean isMiddleVeritcal() {
		if(b.getTopMiddle().equals(b.getO()) && b.getMiddle().equals(b.getO()) && b.getBottomMiddle().equals(b.getO()))
			return true;
		else if(b.getTopMiddle().equals(b.getX()) && b.getMiddle().equals(b.getX()) && b.getBottomMiddle().equals(b.getX()))
			return true;
		else
			return false;
	}

	public boolean isRightVertical() {
		if(b.getTopRight().equals(b.getX()) && b.getMiddleRight().equals(b.getX()) && b.getBottomRight().equals(b.getX()))
			return true;
		else if(b.getTopRight().equals(b.getO()) && b.getMiddleRight().equals(b.getO()) && b.getBottomRight().equals(b.getO()))
			return true;
		else
			return false;
	}

	public boolean isTopHorizontal() {
		if(b.getTopLeft().equals(b.getO()) && b.getTopMiddle().equals(b.getO()) && b.getTopRight().equals(b.getO()))
			return true;
		else if(b.getTopLeft().equals(b.getX()) && b.getTopMiddle().equals(b.getX()) && b.getTopRight().equals(b.getX()))
			return true;
		else
			return false;
	}

	public boolean isMiddleHorizontal() {
		if (b.getMiddleLeft().equals(b.getX()) && b.getMiddle().equals(b.getX()) && b.getMiddleRight().equals(b.getX()))
			return true;
		else if (b.getMiddleLeft().equals(b.getO()) && b.getMiddle().equals(b.getO())
				&& b.getMiddleRight().equals(b.getO()))
			return true;
		else
			return false;
	}

	public boolean isBottomHorizontal() {
		if(b.getBottomLeft().equals(b.getX()) && b.getBottomMiddle().equals(b.getX()) && b.getBottomRight().equals(b.getX()))
			return true;
		if(b.getBottomLeft().equals(b.getO()) && b.getBottomMiddle().equals(b.getO()) && b.getBottomRight().equals(b.getO()))
			return true;
		else
			return false;
	}

	public boolean isForwardDiagonal() {
		if(b.getTopLeft().equals(b.getX()) && b.getMiddle().equals(b.getX()) && b.getBottomRight().equals(b.getX()))
			return true;
		else if(b.getTopLeft().equals(b.getX()) && b.getMiddle().equals(b.getX()) && b.getBottomRight().equals(b.getX()))
			return true;
		else
			return false;
	}

	public boolean isBackwardDiagonal() {
		if(b.getBottomLeft().equals(b.getX()) && b.getMiddle().equals(b.getX()) && b.getTopRight().equals(b.getX()))
			return true;
		else if(b.getBottomLeft().equals(b.getX()) && b.getMiddle().equals(b.getX()) && b.getTopRight().equals(b.getX()))
			return true;
		else
			return false;
	}
	
	public void callGame() {
		if(isFarLeftVeritcal() || isBackwardDiagonal() || isForwardDiagonal() 
				|| isBottomHorizontal() || isMiddleHorizontal() || isTopHorizontal() || isRightVertical() || isMiddleVeritcal())
			gameOver = true;
		else if(b.boardFilled())
			gameOver = true;
	}
	
}
