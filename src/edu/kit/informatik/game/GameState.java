package edu.kit.informatik.game;

/**
 * This class implements the current game state.
 * 
 * @author Bj�rn Holtvogt
 *
 */
public enum GameState {

	/**
	 * Game is running - state.
	 */
	RUNNING,

	/**
	 * Game ended in a draw - state.
	 */
	DRAW,

	/**
	 * Game ended with a win - state.
	 */
	WON;
}
