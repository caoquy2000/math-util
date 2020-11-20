/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quy.utl.test;

import org.junit.Test;
import static org.junit.Assert.*;
import quy.utl.MathUtility;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {
    
    @Test // biến hàm ở trong class này thành public static void main
    //Nhờ bộ thư viện JUnit.
    //Tại sao cần vậy vì mặc định app từ main() chuẩn
    //Trong khi đó mình cần test thử hàm thoy, ko can thiệp main()
    //Vậy mình cần main() khác, @Test giúp điều đó
    //Nhưng vì có nhiều main() CPU bị bối rối khi nhấn F6
    //F6 dành cho main() default
    //Shift F6 dành cho bên này
    
    //Cú pháp đặt tên hàm dùng để test hàm khác của dân QC
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
    }
    
}
