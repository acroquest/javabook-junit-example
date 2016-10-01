
package acroquest.java.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GreetingTest {
    private Greeting target = new Greeting();

    @Test
    public void getMessage_朝開始() {
        // 実行
        String message = this.target.getMessage(5);
        
        // 検証
        assertThat(message, is("おはようございます"));
    }
    
    @Test
    public void getMessage_昼開始() {
        // 実行
        String message = this.target.getMessage(11);

        // 検証
        assertThat(message, is("こんにちは"));
    }
        
    @Test
    public void getMessage_夜開始() {
        // 実行
        String message = this.target.getMessage(17);
        
        // 検証
        assertThat(message, is("こんばんは"));
    }
}