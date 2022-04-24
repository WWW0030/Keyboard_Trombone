
import java.util.*; 
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KeyboardTrombone extends java.applet.Applet implements KeyListener {
	int pos = 0, scale = -1;
	AudioClip Bb, BbD, C, CD, Eb, EbD, F, G;
	public void init() {
		
		
		Bb = getAudioClip(getCodeBase(), "Bb.wav");
		BbD = getAudioClip(getCodeBase(), "BbD.wav");
		C = getAudioClip(getCodeBase(), "C.wav");
		CD = getAudioClip(getCodeBase(), "CD.wav");
		Eb = getAudioClip(getCodeBase(), "Eb.wav");
		EbD = getAudioClip(getCodeBase(), "EbD.wav");
		F = getAudioClip(getCodeBase(), "F.wav");
		G = getAudioClip(getCodeBase(), "G.wav");
		addKeyListener(this);
	}
	public void keyPressed (KeyEvent e) {
		char c = e.getKeyChar();
		if (c=='1') {
			pos = 6;
			noteplay(pos, scale);
		}
		if (c=='2') {
			pos = 5;
			noteplay(pos, scale);
		}
		if (c=='3') {
			pos = 4;
			noteplay(pos, scale);
		}
		if (c=='4') {
			pos = 3;
			noteplay(pos, scale);
		}
		if (c=='5') {
			pos = 2;
			noteplay(pos, scale);
		}
		if (c=='6') {
			pos = 1;
			noteplay(pos, scale);
		}
		if (c=='m') {
			scale = 1;
		}
		if (c=='k') {
			scale = 2;
		}
		if (c=='o') {
			scale = 3;
		}
		if (c=='n') {
			scale = 4;
		}
		if (c=='j') {
			scale = 5;
		}
	}
	public void keyReleased (KeyEvent e) {}
	public void keyTyped (KeyEvent e) {}
	public void paint(Graphics g) {

	}
	public void run() {
		noteplay();
				try {
			Thread.sleep(200);
		} catch (Exception e) {}
	}
	public void noteplay(pos, scale) {
		if(pos==1) {
			
		}
		else if (pos==2) {
			
		}
		else if (pos==3) {
			
		}
		else if (pos==4) {
			
		}
		else if (pos==5) {
			
		}
		else if (pos==6) {
			
		}
	}
}