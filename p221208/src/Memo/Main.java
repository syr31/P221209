package Memo;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Main {
	public static void main(String[] args) {
		Frame f = new Frame("제목 없음 - Windows 메모장");
		f.setSize(200, 300);

		MenuBar mb = new MenuBar();
		Menu mFile1 = new Menu("파일(F)");
		MenuItem miNew = new MenuItem("새로 만들기(N)");
		MenuItem miOpen1 = new MenuItem("새 창(W)");
		MenuItem miOpen2 = new MenuItem("열기(O)");
		MenuItem miOpen3 = new MenuItem("저장(S)");
		MenuItem miOpen4 = new MenuItem("다른 이름으로 저장(A)");
		MenuItem miOpen5 = new MenuItem("페이지 설정(U)");
		MenuItem miOpen6 = new MenuItem("인쇄(P)");
		MenuItem miOpen7 = new MenuItem("끝내기(X)");

		Menu mOthers = new Menu("확대하기/축소하기");
		MenuItem miExit = new MenuItem("Exit");

		mFile1.add(miNew);
		mFile1.add(miOpen1);
		mFile1.add(miOpen2);
		mFile1.add(miOpen3);
		mFile1.add(miOpen4);
		mFile1.add(miOpen5);
		mFile1.add(miOpen6);
		mFile1.add(miOpen7);
		mFile1.add(mOthers);
		mFile1.addSeparator();
		mFile1.add(miExit);
		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print Setup...");
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);

		Menu mEdit = new Menu("편집(E)");
		MenuItem mEOpen1 = new MenuItem("실행 취소(U)");
		MenuItem mEOpen2 = new MenuItem("잘라내기(T)");
		MenuItem mEOpen3 = new MenuItem("복사(C)");
		MenuItem mEOpen4 = new MenuItem("붙여넣기(P)");
		MenuItem mEOpen5 = new MenuItem("삭제(L)");
		MenuItem mEOpen6 = new MenuItem("Bing으로 검색(S)");
		MenuItem mEOpen7 = new MenuItem("찾기(F)");
		MenuItem mEOpen8 = new MenuItem("다음 찾기(N)");
		MenuItem mEOpen9 = new MenuItem("이전 찾기(V)");
		MenuItem mEOpen10 = new MenuItem("바꾸기(R)");
		MenuItem mEOpen11 = new MenuItem("이동(G)");
		MenuItem mEOpen12 = new MenuItem("모두 선택(A)");
		MenuItem mEOpen13 = new MenuItem("시간/날짜(D)");

		Menu mView = new Menu("서식(O)");
		MenuItem mVOpen1 = new MenuItem("자동 줄 바꿈(W)");
		MenuItem mVOpen2 = new MenuItem("글꼴(F)");

		Menu mLook = new Menu("보기(V)");
		MenuItem mLOpen1 = new MenuItem("확대하기/축소하기");
		MenuItem mLOpen2 = new MenuItem("상태 표시줄(S)");

		Menu mHelp = new Menu("도움말(H)");
		MenuItem mHOpen1 = new MenuItem("도움말 보기(H)");
		MenuItem mHOpen2 = new MenuItem("피드백 보내기(F)");
		MenuItem mHOpen3 = new MenuItem("메모장 정보(A)");

		mEdit.add(mEOpen1);
		mEdit.add(mEOpen2);
		mEdit.add(mEOpen3);
		mEdit.add(mEOpen4);
		mEdit.add(mEOpen5);
		mEdit.add(mEOpen6);
		mEdit.add(mEOpen7);
		mEdit.add(mEOpen8);
		mEdit.add(mEOpen9);
		mEdit.add(mEOpen10);
		mEdit.add(mEOpen11);
		mEdit.add(mEOpen12);
		mEdit.add(mEOpen13);

		mView.add(mVOpen1);
		mView.add(mVOpen2);

		mLook.add(mLOpen1);
		mLook.add(mLOpen2);

		mHelp.add(mHOpen1);
		mHelp.add(mHOpen2);
		mHelp.add(mHOpen3);

		mb.add(mFile1);
		mb.add(mEdit);
		mb.add(mView);
		mb.setHelpMenu(mHelp);
		mb.add(mLook);

		f.setMenuBar(mb);
		f.setVisible(true);
	}

}
