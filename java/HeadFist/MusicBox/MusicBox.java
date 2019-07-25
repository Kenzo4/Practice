package HeadFist.MusicBox;

import javax.sound.midi.*;

public class MusicBox {
    public static void main(String[] args){
        try {
            MusicBox box = new MusicBox();
            box.play(80, 20);
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            box.play(instrument, note);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }
    }
    public void play(int instrument, int note){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            ShortMessage first = new ShortMessage();
            first.setMessage(192,1,instrument,0);
            MidiEvent changeInstrument = new MidiEvent(first,1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,note,100);
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,note,100);
            MidiEvent noteOff = new MidiEvent(b,16);
            track.add(noteOff);
            sequencer.setSequence(sequence);
            sequencer.start();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
