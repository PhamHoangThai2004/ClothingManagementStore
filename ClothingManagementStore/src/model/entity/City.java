package model.entity;

import java.util.ArrayList;

public class City {
    private int cityID;
    private String cityName;

    public City() {
    }

    public City(int cityID, String cityName) {
        this.cityID = cityID;
        this.cityName = cityName;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
              
    public  static ArrayList<City> getDSTinh() {
        String[] arrTinh = {"An Giang",
                            "Bà Rịa-Vũng Tàu",
                            "Bắc Giang",                       
                            "Bắc Kạn",           
                            "Bạc Liêu",
                            "Bắc Ninh",
                            "Bến Tre",
                            "Bình Định",
                            "Bình Dương",
                            "Bình Phước",
                            "Bình Thuận",
                            "Cà Mau",
                            "Cần Thơ",
                            "Cao Bằng",
                            "Đà Nẵng",
                            "Đắk Lắk",
                            "Đắk Nông",
                            "Điện Biên",
                            "Đồng Nai",
                            "Đồng Tháp",
                            "Gia Lai",
                            "Hà Giang",
                            "Hà Nam",
                            "Hà Nội",
                            "Hà Tĩnh",
                            "Hải Dương",
                            "Hải Phòng",
                            "Hậu Giang",
                            "TP. Hồ Chí Minh",
                            "Hòa Bình",
                            "Hưng Yên",
                            "Khánh Hòa",
                            "Kiên Giang",
                            "Kon Tum",
                            "Lai Châu",
                            "Lâm Đồng",
                            "Lạng Sơn",
                            "Lào Cai",
                            "Long An",
                            "Nam Định",
                            "Nghệ An",
                            "Ninh Bình",
                            "Ninh Thuận",
                            "Phú Thọ",
                            "Phú Yên",
                            "Quảng Bình",
                            "Quảng Nam",
                            "Quảng Ngãi",
                            "Quảng Ninh",
                            "Quảng Trị",
                            "Sóc Trăng",
                            "Sơn La",
                            "Tây Ninh",
                            "Thái Bình",
                            "Thái Nguyên",
                            "Thanh Hóa",
                            "Thừa Thiên - Huế",
                            "Tiền Giang",
                            "Trà Vinh",
                            "Tuyên Quang",
                            "Vĩnh Long",
                            "Vĩnh Phúc",
                            "Yên Bái"};   
        ArrayList<City> dsTinh = new ArrayList<>();
        int i = 3;
        for (String tenTinh : arrTinh) {
            City t = new City(i, tenTinh);
            dsTinh.add(t);
            i++;
        }
        return dsTinh;
    } 

    @Override
    public String toString() {
        return "City{" + "cityID=" + cityID + ", cityName=" + cityName + '}';
    }
}
