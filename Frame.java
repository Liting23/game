package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Frame extends JFrame {

	private JPanel contentPane;
	private int count = 0;//����
	//��¼��һ�εĴ�������
	int lastX = 100;
	int lastY = 100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setUndecorated(true);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 315, 196);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("G:\\\u6587\u4EF6\\JAVA\\Client\\src\\headIcon\\headIcon_0.jpg"));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				try {
					Thread.sleep(20);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				count++;//������
				//�������λ��
				int ran1=new Random().nextInt(1200);
				int ran2=new Random().nextInt(800);
				//���ô���λ��
				setLocation(ran1,ran2);
				//ˢ�´���
				contentPane.validate();
				//�˳���ʾ
				if (count == 10) {
					JOptionPane.showMessageDialog(Frame.this, "������ı�", "�ݰ�", JFrame.EXIT_ON_CLOSE);
					Frame.this.dispose();
				}
			}
			@Override
			//�����ж�
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(Frame.this, "��ϲ�������", "�ݰ�", JFrame.EXIT_ON_CLOSE);
				Frame.this.dispose();
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(113, 67, 88, 87);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("����رմ��ڹ�");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 24));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(41, 10, 274, 43);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
	}
}
