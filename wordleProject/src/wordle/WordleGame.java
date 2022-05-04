package wordle;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WordleGame implements ActionListener {

	private JFrame gameFrame;
	private WordPanel[] wordPanelArray = new WordPanel[6];
	private UserPanel userPanel;
	private String wordleString;
	private int count = 0;

	// 창생성
	public WordleGame() {
		gameFrame = new JFrame("Wordle Game");
		gameFrame.setSize(300, 300);
		gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		gameFrame.setLayout(new GridLayout(7, 1));
		gameFrame.setVisible(true);
		gameFrame.setLocationRelativeTo(null);

		for (int i = 0; i < 6; i++) {
			wordPanelArray[i] = new WordPanel();
			gameFrame.add(wordPanelArray[i]);
		}
		userPanel = new UserPanel();
		userPanel.getOkButton().addActionListener(this);
		gameFrame.add(userPanel);
		gameFrame.revalidate();

		wordleString = getWordleString();
		System.out.println("Word for the day : " + wordleString);
	}

	// 승패 확인
	@Override
	public void actionPerformed(ActionEvent e) {
		String userWord = this.userPanel.getUserInput().getText();
		
		// 승리
		if (userWord.length() > 4) {
			if (isWordleWordEqualTo(userWord.trim().toUpperCase())) {
				clearAllPanels();
				JOptionPane.showMessageDialog(null, "You Win!!!", "Congrats", JOptionPane.INFORMATION_MESSAGE);
				gameFrame.dispose();
				return;
			}
		}
		
		// 패배
		if (count > 5) {
			JOptionPane.showMessageDialog(null, "You Lost.Better luck next time.", "Oops",
					JOptionPane.INFORMATION_MESSAGE);
			gameFrame.dispose();
			return;
		}
		count++;
	}

	private void clearAllPanels() {
		for (int i = 0; i <= count; i++) {
			wordPanelArray[i].clearWordPanel();
		}
	}

	// 정답과 맞는지 확인
	private boolean isWordleWordEqualTo(String userWord) {
		List<String> wordleWordsList = Arrays.asList(wordleString.split(""));
		String[] userWordsArray = userWord.split("");
		List<Boolean> wordMatchesList = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			if (wordleWordsList.contains(userWordsArray[i])) { // 정답에 있는 알파벳, 같은 위치에 위치할 때
				if (wordleWordsList.get(i).equals(userWordsArray[i])) {
					getActivePanel().setPanelText(userWordsArray[i], i, Color.GREEN);
					wordMatchesList.add(true);
				} else { // 정답에 있는 알파벳
					getActivePanel().setPanelText(userWordsArray[i], i, Color.YELLOW);
					wordMatchesList.add(false);
				}
			} else { // 정답에 없는 알파벳
				getActivePanel().setPanelText(userWordsArray[i], i, Color.GRAY);
				wordMatchesList.add(false);
			}
		}
		return !wordMatchesList.contains(false);
	}

	public WordPanel getActivePanel() {
		return this.wordPanelArray[count];
	}

	// words 파일 불러오기
	public String getWordleString() {
		Path path = Paths.get("..\\\\wordleProject\\\\assets\\\\Words.txt");
		List<String> wordList = new ArrayList<>();
		try {
			wordList = Files.readAllLines(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Random random = new Random();
		int position = random.nextInt(wordList.size());
		return wordList.get(position).trim().toUpperCase();
	}

}
