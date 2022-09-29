package ex17_04_Runnable_Interface_annonymous;
public class SmallLetters implements Runnable {
	public void run() {
        for (char ch = 'a'; ch <= 'z'; ch++)
            System.out.print(ch);
    }
}
