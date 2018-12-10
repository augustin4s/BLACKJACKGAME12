package Augis;

import org.junit.Assert;
import org.junit.Test;

public class DeckTest {
    private int expectedTestSum = 0;

    @Test
    public void testFunc() {
        Cards newCard = Cards.createCard(8, "Heart", "EIGHT");
        Cards newCard2 = Cards.createCard(10, "Heart", "KING");
        expectedTestSum += newCard.getValue();
        Assert.assertEquals(8, expectedTestSum);
        expectedTestSum += newCard2.getValue();
        Assert.assertEquals(18, expectedTestSum);
    }

}