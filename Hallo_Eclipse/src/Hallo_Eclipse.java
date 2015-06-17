
	import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

	public class Hallo_Eclipse {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			final Frame win = new Frame();
			win.setBounds(10, 10, 300, 200);
			win.addWindowListener(new WindowListener(){

				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowClosing(WindowEvent e) {
					// TODO Auto-generated method stub
					win.dispose();
				}

				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowOpened(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Label l = new Label();
			l.setBounds(10, 10, 200, 50);
			l.setText("Hallo Eclipse");
			win.add(l);
			win.setVisible(true);
	}
}


