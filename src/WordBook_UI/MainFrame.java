package WordBook_UI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class MainFrame extends JFrame implements ActionListener,ItemListener{
	//������ �־�� �� ������	
	Dimension screensize;//��ũ�� ũ�� ���� ����
	Container container;
	Toolkit kit;
	JPanel[] panel= new JPanel[5];
	
			
	
	
	//JComboBox
	MainFrame(String title){
		super(title);//������ ��� ���� ����
		kit=Toolkit.getDefaultToolkit();//��
		screensize=kit.getScreenSize(); //ȭ�� ũ�� ����
		container=getContentPane(); //�����̳� ��������
	
		init();
		
		//â ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(screensize.width/4,screensize.height/2);
		setVisible(true);
	}
	public void init() {
		//üũ �ڽ� ���� ,���� �ڽ� ����
		
		
	}
	
	@Override //üũ �ڽ� �� ������ ������
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub 
		if(e.getStateChange()==ItemEvent.SELECTED) {
			
		}
		else {}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	class MyPanel extends JPanel{		
		Image img;
		MyPanel(String filename){
			//img ����
			img=kit.getImage(filename);
			
		}
		@Override //�ڱ� �ڽ��� �׸��� �Լ�-������Ʈ�� �ڱ⸦ �׸��� �Լ�
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			if(img !=null) {
				g.drawImage(img,0, 0, screensize.width/4,screensize.height/4,this);
			}
		}
	}
	public static void main(String[] args) {
		MainFrame myframe=new MainFrame("�ܾ���");
	}
}