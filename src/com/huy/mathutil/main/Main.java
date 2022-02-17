/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huy.mathutil.main;

import com.huy.mathutil.core.MathUtil;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        //test thử hàm tính giai thừa chạy đúng hay ko
        //kiểm thử là so sánh expect & actual
        //ta pải tưởng tượng xem ng dùng/ng khác dùng app/code
        //như thế nào, ta dùng trc họ
        //ta pải tưởng tượng ra các tình huống họ xài - TEST CASES
        
        //CASE #1: check the getF() with valid argument (n = 0..20)
        //n = 0 -> expected = 1 0! pải trả về 1, tao kì vọng như thế
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //so sánh giữa expected & actual
        System.out.println("check 0!; expected: " + expected + 
                "; actual: " + actual);
        //CASE #2:
        //n = 6 -> expected = 720, 6! = 720 là đúng, kì vọng
        expected = 720;
        actual = MathUtil.getFactorial(0);
        //so sánh giữa expected & actual
        System.out.println("check 0!; expected: " + expected + 
                "; actual: " + actual);
        
        //CASE #..1,2,...20! VALID ARGUMENT
        
        //CASE #x check getF() with invalid argument
        //expected = ??? cái j đây khi mình muốn tính -5!
        //hy vọng của ta là thấy đc ngoại lệ, IllegalArgumentException
        //sure -5! pải xuất hiện ngoại lệ
        //nếu getF(-5) mà ném ra ngoại lệ, ta mừng rớt nc mắt
        System.out.println("Check if an exception is thrown");
        MathUtil.getFactorial(-5);
    }
}
