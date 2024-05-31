package execute.test;


import java.sql.Date;
import java.time.LocalDate;

public class GetCurrentDate {
    public static void main(String[] args) {
        // Lấy ngày hiện tại
        LocalDate localDate = LocalDate.now();
        
        // Chuyển đổi LocalDate sang java.sql.Date
        Date currentDate = Date.valueOf(localDate);
        
        // In ra ngày hiện tại dưới dạng java.sql.Date
        System.out.println("Ngày hiện tại: " + currentDate);
    }
}

