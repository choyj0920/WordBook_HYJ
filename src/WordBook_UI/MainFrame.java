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
	//무조건 있어야 할 변수들	
	Dimension screensize;//스크린 크기 담을 변수
	Container container;
	Toolkit kit;
	JPanel[] panel= new JPanel[5];
	
			
	
	
	//JComboBox
	MainFrame(String title){
		super(title);//생성자 멤버 변수 설정
		kit=Toolkit.getDefaultToolkit();//툴
		screensize=kit.getScreenSize(); //화면 크기 저장
		container=getContentPane(); //컨테이너 가져오기
	
		init();
		
		//창 띄우기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(screensize.width/4,screensize.height/2);
		setVisible(true);
	}
	public void init() {
		//체크 박스 예제 ,라디오 박스 예제
		
		
	}
	
	@Override //체크 박스 용 아이템 리스너
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
			//img 연결
			img=kit.getImage(filename);
			
		}
		@Override //자기 자신을 그리는 함수-컴포넌트가 자기를 그리는 함수
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			if(img !=null) {
				g.drawImage(img,0, 0, screensize.width/4,screensize.height/4,this);
			}
		}
	}
	public static void main(String[] args) {
		MainFrame myframe=new MainFrame("단어장");
	}
}
