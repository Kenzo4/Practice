package HeadFist.MusicBox.Test;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class FinalMusicPlayer {
    static JFrame f = new JFrame("First musical clip");
    static MyDrawPanel ml;

    public static void main(String[] args) {
        FinalMusicPlayer musicPlayer = new FinalMusicPlayer();
        musicPlayer.go();
    }

    public void setUpGui(){
        ml = new MyDrawPanel();
        f.setContentPane(ml);
        f.setBounds(30,30,300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void go(){
        setUpGui();

        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(ml, new int[]{127});
            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();

            int r = 0;
            for(int  i = 0; i < 60; i += 4){
                r = (int)((Math.random() * 50) + 1);
                track.add(makeEvent(144,1,r,100,i));
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128,1,r,100,i + 2));

                sequencer.setSequence(seq);
                sequencer.start();
                sequencer.setTempoInBPM(220);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
        MidiEvent event = null;
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(comd, chan, one, two);
            event = new MidiEvent(message,tick);
        }catch (Exception e){
            e.printStackTrace();
        }
        return event;
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener{
        boolean msg = false;

        @Override
        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics g){
            if(msg){
                Graphics2D g2d = (Graphics2D) g;
                int r = (int) (Math.random() * 250);
                int gr = (int) (Math.random() * 250);
                int b = (int) (Math.random() * 250);

                g.setColor(new Color(r,gr,b));

                int height = (int) ((Math.random() * 120) + 10);
                int width = (int) ((Math.random() * 120) + 10);

                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);

                g.fillRect(x,y,height,width);
                msg = false;
            }
        }
    }
}
