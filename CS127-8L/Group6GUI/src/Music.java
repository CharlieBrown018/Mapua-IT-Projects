/**
 *
 * @author katri
 */
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JComponent;

public class Music {
    
        static String filePath = "src/Music/sunmoon.wav";
        public static String songtitle = "fairy";
    
	static AudioInputStream AIS;
	static Clip C;
	public static void playmusic() {
				Music();
				try {
	        		C.open(AIS); //Clip opens AudioInputStream
	        		C.start(); //Start playing audio
	        		//C.loop(Clip.LOOP_CONTINUOUSLY); //Loops the audio 
				}
				catch (Exception e) {
					System.out.println("Cannot play music.");
				}
	}
	public static void stopmusic() {
	        try {
	        	C.stop();
	        	C.close();
	        }
	        catch (Exception e) {
	        	System.out.println("Cannot Stop Music");
	        }
	}
	public static void Music() {
                if (MusicFrame.counter == 0){
                    filePath = "src/Music/sunmoon.wav";
                    songtitle = "Sun & Moon";
                }
                else if (MusicFrame.counter == 1){
                    filePath = "src/Music/girlInRed.wav";
                    songtitle = "Girl in Red";
                }
                else if (MusicFrame.counter == 2){
                    filePath = "src/Music/goldenHour.wav";
                    songtitle = "Golden Hour";
                }
            
		String path = new File("").getPath() + filePath;
                
		File sound = new File(path);
		try {
		AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
		AIS = ais;
    	Clip c = AudioSystem.getClip();
    	C = c;
		}
		catch (Exception e) { 
	        	System.out.println("Music not found.");
		}
	}
}
