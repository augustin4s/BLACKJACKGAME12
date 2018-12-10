package Augis;

import org.junit.Assert;
import org.junit.Test;

import static Augis.Main.newDeck;

public class readFileFillDeckTest {

    @Test
    public void readFileFillDeckTest(){
        FromFile f = new FromFile();
        f.openReadClose();
        int expected = 52;
        Assert.assertEquals(newDeck.newDeck.size(), expected);
    }
}