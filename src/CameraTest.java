import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CameraTest {
    @Test
    public void testCameraSingola(){
        CameraSingola camera = new CameraSingola(101, "singola", 80.00);
        assertEquals(80.00, camera.calcolaCosto(), 0.01);
    }


        @Test
        public void testSuite(){
           Suite  camera = new Suite (102, "suite", 200.00, 90.00);
            assertEquals(290.00, camera.calcolaCosto(), 0.01);
        }
    @Test
    public void testCameraDoppia(){
       CameraDoppia camera = new CameraDoppia(103, "cameraDoppia", 120.00,30.00,true);
        assertEquals(150, camera.calcolaCosto(), 0.01);
    }



    }




