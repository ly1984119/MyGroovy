package bean;

import junit.framework.Assert;
import org.junit.Test;

public class SongTest {

    @Test
    public void testToString() {
        Song sng = new Song();
        sng.setArtist("Village People");
        sng.setName("Y.M.C.A");
        sng.setGenre("Disco");

        Assert.assertEquals("Y.M.C.A, Village People, Disco", sng.toString());
    }
}