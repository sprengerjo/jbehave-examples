package de.sprengerj.jbehave.game;

import org.jbehave.core.annotations.*;
import org.jbehave.core.embedder.Embedder;

import de.sprengerj.jbehave.game.Game;
import junit.framework.Assert;
 
public class GameStories extends Embedder{
 
    private Game game;
 
    @Given("a bowling game")
    public void anEmptyGame() {
        game = new Game();
    }
 
    @When("$rolls rolls score $score")
    public void rollMany(int rolls, int score) {
    	for (int i = 0; i < rolls; i++) {
    		game.roll(score);
		}
    }
 
    @Then("the overall score must equal $score")
    public void theScoreShouldBe(int score) {
    	Assert.assertEquals("bla bla", score, game.score());
    }
 
}