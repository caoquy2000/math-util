/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

/**
 *
 * @author DELL
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long expected = 120; //tao hy vọng 120 ói về nếu
        long actual = quy.utl.MathUtility.getFactorial(5); // tao gọi hàm 5!
        System.out.println("5!? expected: " + expected + "; actual: " + actual);
        //đúng cho case tình huống đầu tiên

        expected = 720;//tao hy vọng ói về 720 nếu tao gọi
        actual = quy.utl.MathUtility.getFactorial(6); //6!
        System.out.println("6!? expected: " + expected + "; actual: " + actual);
        
        //case 3
        System.out.println("0!? expected: 1; actual: " +quy.utl.MathUtility.getFactorial(0));
        //case 4
        //tao kì vọng nhận về ngoại lệ IllegalArgumentException
        //nếu tao gọi -5!
        quy.utl.MathUtility.getFactorial(-5);
        //Thấy ngoại lệ lại mừng vì hàm chạy như thiết kế
        
        

    }

}
//cất code lên server GitHub
//cần:
//Nhớ kho trên GitHub, url:
//nhớ username và pass và email vào GitHub của mình
//Cần tool để đồng bộ code từ máy mình (local) lên sever (github, gitlab, bitbubt)
//tool có thể là : cmd, GUI (Git: Desktop, source tree), chính IDE(cmd, click)
//vì ta pro ta chơi cmd
//File đặc biệt đẻ nói với git tool rằng: ai lên server, ai ở lại local
//file này được gọi là .gitignore (thuần text)
//nó sẽ khác nhau content tùy vào IDE mình xài, ngôn ngữ lập trình mình xài.
//có 1 gã dev cực dễ thương, làm sẵn những file ứng với các IDE, NNLT rồi
//xin anh ấy đem về sài https://gitignore.io