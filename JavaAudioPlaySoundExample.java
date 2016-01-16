package dungeonsanddragons;

    import java.io.*;
import sun.audio.*;

public class JavaAudioPlaySoundExample {
   

  public static void  playJavaAudioPlaySoundExample(String soundFile)
  throws Exception
  {

    String gongFile = soundFile;
    InputStream in = new FileInputStream(gongFile);
 
   
    AudioStream audioStream = new AudioStream(in);
 
    
    AudioPlayer.player.start(audioStream);
  }
}
