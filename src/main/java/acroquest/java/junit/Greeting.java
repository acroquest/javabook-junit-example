package acroquest.java.junit;

/**
 * あいさつの言葉を決めるクラス。
 *
 * @author acroquest
 */
public class Greeting {
	/**
	 * あいさつの言葉を取得する。
	 *
	 * @param hour 時間
	 * @return 時間帯に応じたあいさつの言葉
	 */
    public String getMessage(int hour) {
        String message;
        if (hour >= 5 && hour < 11) {
            message = "おはようございます";
        } else if (hour >= 11 && hour < 17) {
            message = "こんにちは";
        } else {
            message = "こんばんは";
        }
        return message;
    }
}