/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadingmusic;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author SujiitraMurukeshan
 */
public class TwinkleThread2 extends Thread{
    @Override
    public void run(){
//        play("./Sounds/re.wav");
//        play("./Sounds/fa.wav");
//        play("./Sounds/la.wav");
//        play("./Sounds/do-octave.wav");
// play("./Sounds/do.wav");
// play("./Sounds/do.wav");
// play("./Sounds/sol.wav");
// play("./Sounds/sol.wav");
double dsleepTime = 1;
            play("./Sounds/la.wav",4,"L");
            play("./Sounds/la.wav",2,"I");
            //play("./Sounds/sol.wav");
            play("./Sounds/fa.wav",1,"I");
            play("./Sounds/fa.wav",3,"I");
            //play("./Sounds/mi.wav");
            //play("./Sounds/mi.wav");
            play("./Sounds/re.wav",1,"I");
            play("./Sounds/re.wav",4,"I");
            //play("./Sounds/do.wav");
            //play("./Sounds/sol.wav");
            //play("./Sounds/sol.wav");
            play("./Sounds/fa.wav",1,"I");
            play("./Sounds/fa.wav",3,"I");
            //play("./Sounds/mi.wav");
            //play("./Sounds/mi.wav");
            play("./Sounds/re.wav",3,"I");
            //play("./Sounds/sol.wav");
            //play("./Sounds/sol.wav");
            play("./Sounds/fa.wav",1,"I");
            play("./Sounds/fa.wav",3,"I");
            //play("./Sounds/mi.wav");
            //play("./Sounds/mi.wav");
            play("./Sounds/re.wav",4,"I");
            //play("./Sounds/do.wav");
            //play("./Sounds/do.wav");
            //play("./Sounds/sol.wav");
            //play("./Sounds/sol.wav");
            play("./Sounds/la.wav",1,"I");
            play("./Sounds/la.wav",2,"I");
            //play("./Sounds/sol.wav");
            play("./Sounds/fa.wav",1,"I");
            play("./Sounds/fa.wav",3,"I");
            //play("./Sounds/mi.wav");
            //play("./Sounds/mi.wav");
            play("./Sounds/re.wav",1,"I");
            play("./Sounds/re.wav",1,"I");

    }
    public synchronized void play(String filePath,double isleeptime, String sPlaytime) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            System.out.println("started Playing: "+filePath+" "+isleeptime+" "+sPlaytime);
            if(sPlaytime.equalsIgnoreCase("I"))
            {
                clip.start();
                Thread.sleep((long) (1000*isleeptime));
            }
            else
            {
                Thread.sleep((long) (1000*isleeptime));
                clip.start();
            }
            System.out.println("stopped Playing: "+filePath+" "+isleeptime+" "+sPlaytime);
        } catch (Exception e) {
            System.out.println("Error with playing sound.");
            e.printStackTrace();
        }

    }
}
