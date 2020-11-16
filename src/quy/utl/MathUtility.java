/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quy.utl;

/**
 *
 * @author DELL
 */
public class MathUtility {
    //minh se lam class nay fake y chang class Math cua JDK
    //Math.PI .abs() .sqrt() .pow() .sin()
    //cai gi ma la do sai chung , ko luu tru rieng le infor ta se coi static
    public static final double PI = 3.1415;
    //xai: MathUtility.PI y chang Math.PI
    
    
    // ham tinh n! = 1.2.3.4.5.... n
    //nphai >= 0, 0! = 1! = 1; quy uoc
    //ta chi tinh n! tu 0...20
    //ngoai vung nay, du am hay lo 20 eo tinh chui = exception
    //ko them tra ve -1 ham y gia tri ko xai
    //hoc cach nem ngoai le luon
    //thu 2 ong viet tiep cam vang mat
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
        if(n == 0 || n == 1)
            return 1;//1 lenh trong if ko xai ngoac
        //cho nay thang nao xai else tru diem
        //ngay cho nay chinh la n = 2..20
        long result = 1;
        for(int i = 2; i <= n; i++)
            result *= i;
        return result;
    }
}

//Ta tự tin gáy hàm ta chạy ngon, chạy đúng
//Nhưng team thì cần chứng minh điều đó, đảm bảo chất lượng code, chất lượng hơn
//Muốn chứng minh hàm chạy đúng không ta cần test thử
//test nghĩa là đưa hàm ra xài, gọi vứi các tham số khác nhau
// ví dụ gọi hàm getFactorial (với các số khác nhau đưa vào)
// getF(-5), getF(-1), getF(10), getF(20),....
//Các giá trị đầu vào đại diện cho việc xài hàm,
// ta còn gọi là test cases, các tình huống cần test, các tình huống xài hàm
//khi ta test hàm, ta cần quan tâm 2 việc
//1.dự kiến hàm trả về giá trị gì khi hàm chạu với 1 đầu vào nào đó
//dự kiến hàm trả về giá trị, tui gọi là EXPECTED VALUE
//ví dụ: hàm sẽ trả về 120 khi gọi getF(5!)
//2.Hàm khi chạy với 1 đầu vào nào đó, thì nó sẽ ói/ return về 1 value
//cái value trả về của hàm khi chạy được gọi là ACTUAL VALUE

//Nghề TEST CHÍNH LÀ: So sánh coi EXPECTED VALUE có bằng với actual value hem?
//Nếu có bằng, hàm đúng cho case/ tình huống này
//nếu không bằng, hàm tính toán sai, hoặc kì vọng sai

//Hàm mà tốt thì phải là EXPECTED == ACTUAL mọi tình huống
// Nếu tốt ta mới đem ra sài, bán ,public cộng đồng xài.

//LÀm sao để test hàm coi có tốt không, EXPECTED == ACTUAL
//Hai kĩ thuật được áp dụng
//Kĩ thuật 1: Nhìn bằng mắt và so sánh từng cặp expected vs. actual
//          chính là kĩ thuật sout(expected), sout(actual - hàm ói về khi chạy)
//Kĩ thuật này đơn giản, dễ làm nhưng mắc sai sót do có quá nhiều cặp
//Expected actual cần so sánh bằng mắt

//Kĩ thuật 2: Nhìn bằng mắt , không cần so sánh từng cặp, để máy so sánh dùm luôn
//          mắt chỉ nhìn 2 màu XANH-ĐỎ Duy nhất
//Nếu tất cả các cặp actual vs. expected đều thỏa, Màu xanh cho tất cả
//nếu hầu hết các cặp actual vs. expected đều thỏa, có 1 vài cái không thỏa
//Thì kết luận ngay, hàm sai, màu đỏ cho tất cả
//Điều này giải thích là: đúng thì phải đúng cho tất cả mọi tình huống hàm chạy
//Chỉ cần 1 thằng sai, hàm sai


//Tương đương câu: hàm tui chạy ngon lắm, đúng 99.9%, lâu lâu sai tí
//nói câu đó: hàm éo tin cậy để sài.
//Kĩ thuật 2 này dùng màu sắc, mún làm vậy thì phải xài thư viện bổ xung thêm
//Chính là file .jar, .dll được cung cấp thêm ngoài JDK
//các thư viện này tùy thuộc ngôn ngữ lập trình, được gọi chung là 
//Unit Test Framework,
//C#: thư viện cụ thể NUnit, MSUnit,xUnit
//Java: thư viện cụ thể JUnit, TestNG, xUnit
//PHP: PHPUnit
//C++:CPPUnit
//....
