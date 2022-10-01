package com.example.doanmonhoc.models;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private double price;
    private String location;
    private String image;
    private String phone;
    private String description;

    public Hotel(String name, double price, String location, String image, String phone, String description) {
        this.name = name;
        this.price = price;
        this.location = location;
        this.image = image;
        this.phone = phone;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Hotel> ITEMS = new ArrayList<Hotel>(){
        {
            add(new Hotel("Vinpearl Luxury Landmark 81", 10000, "720A Dien Bien Phu Street, Ward 22, Binh Thanh District, Ho Chi Minh City, Vietnam","a","0362417182","Sở hữu hơn 200 phòng nghỉ dưỡng đẳng cấp, sang trọng bậc nhất Việt Nam. Đi kèm với những dịch vụ và tiện ích hoàn hảo. Nơi đây sẽ mang đến trải nghiệm mà không phải nơi nào cũng có được. Từ vị trí tầm cao lơ lửng giữa không trung, bạn có thể ngắm nhìn quang cảnh toàn thành phố."));
            add(new Hotel("Tan Son Nhat Saigon Hotel", 10000, "202 Hoang Van Thu, Ward 9, Phu Nhuan District, Ho Chi Minh City, Vietnam","a","0362417182","Khách sạn Tân Sơn Nhất nằm trong hệ thống khách sạn gần sân bay Tân Sơn Nhất với chất lượng dịch vụ tiêu chuẩn 5 sao. Quá trình phục vụ chuyên nghiệp đã khẳng định được vị thế của khách sạn này trong lòng du khách trong và ngoài nước. Sở hữu vị trí đắc địa, điểm lưu trú này đã tồn tại, phát triển và phục vụ hàng trăm nghìn lượt khách, đem lại sự thuận tiện cho những chuyến đi đến thành phố Hồ Chí Minh của khách du lịch."));
            add(new Hotel("Muong Thanh Grand Saigon Centre Hotel", 10000, "No.8A, Mac Dinh Chi st., Ben Nghe ward, District 1, Ho Chi Minh City, Vietnam","a","0362417182","nằm trên tuyến phố rợp bóng cây xanh, một khu vực yên tĩnh giữa trung tâm sôi động của TP HCM. Khách sạn chỉ cách 5 phút đi bộ đến nhà thờ Đức Bà, 10 phút đến Nhà hát Thành phố và 10 phút đi taxi đến chợ Bến Thành, rất thuận lợi cho du khách lưu trú và tham quan các điểm du lịch nổi tiếng của TP HCM."));
            add(new Hotel("Cochin Sang Hotel", 10000, "28-30 Nguyen An Ninh, Ben Thanh Ward, District 1, Ho Chi Minh City, Vietnam","a","0362417182","Khách sạn bình dân này có nhiều nhà hàng xung quanh, cách chợ Bến Thành 2 phút đi bộ, Dinh Độc Lập 13 phút đi bộ và Sân bay Quốc tế Tân Sơn Nhất 7 km."));
            add(new Hotel("Adora Art Hotel", 10000, "189-191 Ly Tu Trong, Ben Thanh Ward, District 1, Ho Chi Minh City, Vietnam","a","0362417182","Khách sạn Sunflower Central bao gồm 72 phòng ngủ được thiết kế đầy sang trọng và tinh tế đạt tiêu chuẩn chất lượng 3 sao. Tông màu chủ đạo của khách sạn là màu vàng cùng nội thất cao cấp tạo nên một không gian ấm áp mà đầy thanh lịch, quý phái. "));
        }
    };


}

