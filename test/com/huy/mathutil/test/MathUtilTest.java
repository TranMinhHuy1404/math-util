/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huy.mathutil.test;

import com.huy.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class MathUtilTest {
    
    //các hàm đẻ test các class bên code chính sẽ đặt ở đây
    //ko đặt trong main() nữa
    //tách riêng code để test và code chính ra 2 nơi khác nhau
    
    //Test case #1: check getF() with valid argument
    //n = 0 (0!), expected = 1, actual = ? đoán xem
    @Test //annotation, bộ thư viện quy ước pải viết điều này
    //máy áo JVM biết pải làm j ??? -> biến hàm dưới thành main()
    public void testFactorialGivenValidArgumentReturnsWell(){
        
        long expected = 1; //hy vọng 0! = 1
        long acutal = MathUtil.getFactorial(0);
        
        assertEquals(expected, acutal);
    }
    
    //Test case #2: check getF() with valid argument
    //n = 6 (6!), expected = 720, actual = ? đoán xem
    @Test //annotation, bộ thư viện quy ước pải viết điều này
    //máy áo JVM biết pải làm j ??? -> biến hàm dưới thành main()
    public void testFactorialGivenValidArgumentN6ReturnsWell(){
        
        long expected = 720; //hy vọng 6! = 720
        long acutal = MathUtil.getFactorial(6);
        
        assertEquals(expected, acutal);
    }
    
    //Case #3: ngoija lệ thì test làm sao ???
    //ngoại lệ ko pải là giá trị để so sánh
    //nó chỉ có ở hình dạng là: m xh hay ko mà thôi
    //ko thể xài hàm assertEquals(cần value để so sánh)
    //nếu đưa n = -5, số âm, thì ta sẽ nhận về ngoại lệ
    //thiết kế đúng của hàm, đưa âm, vượt 20, nhận về ngoại lệ
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenInvalidArgumentThrowsException(){
        MathUtil.getFactorial(-5);
    }
    //chạy như thiết kế thì pải là màu xanh cho dù exception
    //nhưng là exception đc phép xuất hiện
    
}
