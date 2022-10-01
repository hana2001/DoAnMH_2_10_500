package com.example.doanmonhoc.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Hotel implements Serializable {
    private String name;
    private String price;
    private String location;
    private String image;
    private String phone;
    private String description;
    private ArrayList<Room> rooms;

    public Hotel(String name, String price, String location, String image, String phone, String description, ArrayList<Room> rooms) {
        this.name = name;
        this.price = price;
        this.location = location;
        this.image = image;
        this.phone = phone;
        this.description = description;
        this.rooms = rooms;
    }

    public ArrayList<Room> getRooms() {return rooms;};


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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
            add(new Hotel("Vinpearl Luxury Landmark 81", "100.000 ~ 300.000", "720A Dien Bien Phu Street, Ward 22, Binh Thanh District, Ho Chi Minh City, Vietnam","81.png","0362417182","Sở hữu hơn 200 phòng nghỉ dưỡng đẳng cấp, sang trọng bậc nhất Việt Nam. Đi kèm với những dịch vụ và tiện ích hoàn hảo. Nơi đây sẽ mang đến trải nghiệm mà không phải nơi nào cũng có được. Từ vị trí tầm cao lơ lửng giữa không trung, bạn có thể ngắm nhìn quang cảnh toàn thành phố.", new ArrayList<Room>() {{
                // Rooms

                add(new Room("A101","Phòng đôi có view đẹp ","",300000,2));
                add(new Room("A101","Phòng đôi có view đẹp ","",200000,2));
                add(new Room("A101","Phòng đôi có view đẹp ","",250000,2));
                add(new Room("A101","Phòng đôi có view đẹp ","",300000,2));
                add(new Room("A101","Phòng đơn có view đẹp ","",150000,2));
            }}));
            add(new Hotel("Tan Son Nhat Saigon Hotel", "100.000 ~ 300.000", "202 Hoang Van Thu, Ward 9, Phu Nhuan District, Ho Chi Minh City, Vietnam","TSN.pgn","0362417182","Khách sạn Tân Sơn Nhất nằm trong hệ thống khách sạn gần sân bay Tân Sơn Nhất với chất lượng dịch vụ tiêu chuẩn 5 sao. Quá trình phục vụ chuyên nghiệp đã khẳng định được vị thế của khách sạn này trong lòng du khách trong và ngoài nước. Sở hữu vị trí đắc địa, điểm lưu trú này đã tồn tại, phát triển và phục vụ hàng trăm nghìn lượt khách, đem lại sự thuận tiện cho những chuyến đi đến thành phố Hồ Chí Minh của khách du lịch.",new ArrayList<Room>(){{
                // Rooms
                add(new Room("A101","Phòng đôi có view đẹp ","",300000,2));
                add(new Room("A101","Phòng đôi có view đẹp ","",200000,2));
                add(new Room("A101","Phòng đôi có view đẹp ","",250000,2));
                add(new Room("A101","Phòng đôi có view đẹp ","",300000,2));
                add(new Room("A101","Phòng đơn có view đẹp ","",150000,2));
            }}));
            add(new Hotel("Muong Thanh Grand Saigon Centre Hotel", "100.000 ~ 300.000", "No.8A, Mac Dinh Chi st., Ben Nghe ward, District 1, Ho Chi Minh City, Vietnam","MT.png","0362417182","nằm trên tuyến phố rợp bóng cây xanh, một khu vực yên tĩnh giữa trung tâm sôi động của TP HCM. Khách sạn chỉ cách 5 phút đi bộ đến nhà thờ Đức Bà, 10 phút đến Nhà hát Thành phố và 10 phút đi taxi đến chợ Bến Thành, rất thuận lợi cho du khách lưu trú và tham quan các điểm du lịch nổi tiếng của TP HCM.", new ArrayList<Room>(){{
                // Rooms
                add(new Room("A101","Phòng đôi có view đẹp ","",300000,2));
                add(new Room("A101","Phòng đôi có view đẹp ","",200000,2));
                add(new Room("A101","Phòng đôi có view đẹp ","",250000,2));
                add(new Room("A101","Phòng đôi có view đẹp ","",300000,2));
                add(new Room("A101","Phòng đơn có view đẹp ","",150000,2));
            }}));
            add(new Hotel("Cochin Sang Hotel", "100.000 ~ 300.000", "28-30 Nguyen An Ninh, Ben Thanh Ward, District 1, Ho Chi Minh City, Vietnam","CS.png","0362417182","Khách sạn bình dân này có nhiều nhà hàng xung quanh, cách chợ Bến Thành 2 phút đi bộ, Dinh Độc Lập 13 phút đi bộ và Sân bay Quốc tế Tân Sơn Nhất 7 km.",
                    new ArrayList<Room>(){{
                        // Rooms
                        add(new Room("A101","Phòng đôi có view đẹp ","",300000,2));
                        add(new Room("A101","Phòng đôi có view đẹp ","",200000,2));
                        add(new Room("A101","Phòng đôi có view đẹp ","",250000,2));
                        add(new Room("A101","Phòng đôi có view đẹp ","",300000,2));
                        add(new Room("A101","Phòng đơn có view đẹp ","",150000,2));
                    }}));
            add(new Hotel("Adora Art Hotel", "100.000 ~ 300.000", "189-191 Ly Tu Trong, Ben Thanh Ward, District 1, Ho Chi Minh City, Vietnam","AA.png","0362417182","Khách sạn Sunflower Central bao gồm 72 phòng ngủ được thiết kế đầy sang trọng và tinh tế đạt tiêu chuẩn chất lượng 3 sao. Tông màu chủ đạo của khách sạn là màu vàng cùng nội thất cao cấp tạo nên một không gian ấm áp mà đầy thanh lịch, quý phái. ", new ArrayList<Room>(){{
                // Rooms
                add(new Room("A101","Phòng đôi có view đẹp ","",300000,2));
                add(new Room("A101","Phòng đôi có view đẹp ","",200000,2));
                add(new Room("A101","Phòng đôi có view đẹp ","",250000,2));
                add(new Room("A101","Phòng đôi có view đẹp ","",300000,2));
                add(new Room("A101","Phòng đơn có view đẹp ","",150000,2));
            }}));
        }
    };


}

