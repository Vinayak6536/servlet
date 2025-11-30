package com.xworkz.insert.dto;

import com.xworkz.insert.constants.JDBCConnect;

import java.sql.*;

public class Sports {
    public static void main(String[] args) {
        System.out.println("main started");

        try(Connection connection = DriverManager.getConnection(
                JDBCConnect.URL.getS(),JDBCConnect.USERNAME.getS(),JDBCConnect.SECRET.getS())) {

            System.out.println("Connected" + connection);

           /* String sql = "insert into sports values(2,'Badminton','Individual','Indoor','Racket',2,'Court','India',1934,'Points')," +
                    "(3,'Hockey','Team','Outdoor','Stick & Ball',11,'Ground','England',1876,'Goals')," +
                    "(4,'Football','Team','Outdoor','Ball',11,'Stadium','England',1863,'Goals')," +
                    "(5,'Tennis','Individual','Outdoor','Racket',2,'Court','France',1874,'Points')," +
                    "(6,'Basketball','Team','Indoor','Ball',5,'Court','USA',1891,'Points')," +
                    "(7,'Table Tennis','Individual','Indoor','Racket',1,'Table','England',1926,'Points')," +
                    "(8,'Volleyball','Team','Indoor','Ball',6,'Court','USA',1895,'Points')," +
                    "(9,'Cricket','Team','Outdoor','Bat & Ball',11,'Ground','England',1876,'Runs')," +
                    "(10,'Rugby','Team','Outdoor','Ball',15,'Field','England',1823,'Tries')," +
                    "(11,'Golf','Individual','Outdoor','Club & Ball',1,'Course','Scotland',1457,'Strokes')," +
                    "(12,'Boxing','Individual','Indoor','Gloves',1,'Ring','UK',1867,'Points')," +
                    "(13,'Wrestling','Individual','Indoor','Mat',1,'Arena','Greece',708,'Points')," +
                    "(14,'Swimming','Individual','Indoor/Outdoor','None',1,'Pool','Greece',776,'Time')," +
                    "(15,'Athletics','Individual','Outdoor','None',1,'Track','Greece',776,'Time/Distance')," +
                    "(16,'Gymnastics','Individual','Indoor','Apparatus',1,'Arena','Germany',1811,'Points')," +
                    "(17,'Cycling','Individual','Outdoor','Bicycle',1,'Track/Road','France',1869,'Time')," +
                    "(18,'Skiing','Individual','Outdoor','Skis',1,'Slope','Norway',1767,'Time')," +
                    "(19,'Ice Hockey','Team','Indoor','Puck & Stick',6,'Rink','Canada',1875,'Goals')," +
                    "(20,'Handball','Team','Indoor','Ball',7,'Court','Germany',1917,'Goals')," +
                    "(21,'Archery','Individual','Outdoor','Bow & Arrow',1,'Range','England',1486,'Points')," +
                    "(22,'Fencing','Individual','Indoor','Sword',1,'Arena','France',1896,'Points')," +
                    "(23,'Shooting','Individual','Indoor/Outdoor','Gun',1,'Range','Switzerland',1897,'Points')," +
                    "(24,'Karate','Individual','Indoor','None',1,'Dojo','Japan',1935,'Points')," +
                    "(25,'Taekwondo','Individual','Indoor','None',1,'Dojo','Korea',1955,'Points')," +
                    "(26,'Judo','Individual','Indoor','None',1,'Dojo','Japan',1882,'Points')," +
                    "(27,'Rugby League','Team','Outdoor','Ball',13,'Field','Australia',1895,'Tries')," +
                    "(28,'Baseball','Team','Outdoor','Bat & Ball',9,'Field','USA',1845,'Runs')," +
                    "(29,'Softball','Team','Outdoor','Bat & Ball',9,'Field','USA',1887,'Runs')," +
                    "(30,'Surfing','Individual','Outdoor','Board',1,'Ocean','Hawaii',1907,'Points')," +
                    "(31,'Sailing','Individual','Outdoor','Boat',1,'Water','UK',1577,'Time')," +
                    "(32,'Water Polo','Team','Indoor/Outdoor','Ball',7,'Pool','England',1870,'Goals')," +
                    "(33,'Snooker','Individual','Indoor','Cue & Balls',1,'Table','UK',1875,'Points')," +
                    "(34,'Billiards','Individual','Indoor','Cue & Balls',1,'Table','France',1470,'Points')," +
                    "(35,'Lacrosse','Team','Outdoor','Stick & Ball',10,'Field','Canada',1637,'Goals')," +
                    "(36,'Cricket T20','Team','Outdoor','Bat & Ball',11,'Ground','England',2003,'Runs')," +
                    "(37,'Kickboxing','Individual','Indoor','Gloves',1,'Ring','Japan',1960,'Points')," +
                    "(38,'Badminton Doubles','Team','Indoor','Racket',2,'Court','Malaysia',1893,'Points')," +
                    "(39,'Racquetball','Individual','Indoor','Racket',1,'Court','USA',1950,'Points')," +
                    "(40,'Bowling','Individual','Indoor','Ball',1,'Alley','USA',1895,'Points')," +
                    "(41,'Skating','Individual','Outdoor','Skates',1,'Rink','Netherlands',1875,'Time')," +
                    "(42,'Snowboarding','Individual','Outdoor','Board',1,'Slope','USA',1965,'Points')," +
                    "(43,'Mountain Biking','Individual','Outdoor','Bike',1,'Trail','USA',1970,'Time')," +
                    "(44,'Futsal','Team','Indoor','Ball',5,'Court','Uruguay',1930,'Goals')," +
                    "(45,'Kabaddi','Team','Indoor','None',7,'Court','India',1930,'Points')," +
                    "(46,'Sepak Takraw','Team','Indoor','Ball',3,'Court','Malaysia',1945,'Points')," +
                    "(47,'Curling','Team','Indoor','Stone & Broom',4,'Rink','Scotland',1541,'Points')," +
                    "(48,'Cricket ODI','Team','Outdoor','Bat & Ball',11,'Ground','England',1971,'Runs')," +
                    "(49,'Cricket Test','Team','Outdoor','Bat & Ball',11,'Ground','England',1877,'Runs')," +
                    "(50,'Triathlon','Individual','Outdoor','Various',1,'Track/Pool/Road','France',1920,'Time')," +
                    "(51,'Marathon','Individual','Outdoor','None',1,'Road','Greece',1896,'Time')," +
                    "(52,'Pole Vault','Individual','Outdoor','Pole',1,'Track','France',1850,'Height')," +
                    "(53,'High Jump','Individual','Outdoor','None',1,'Track','England',1860,'Height')," +
                    "(54,'Long Jump','Individual','Outdoor','None',1,'Track','Greece',776,'Distance')," +
                    "(55,'Shot Put','Individual','Outdoor','Shot',1,'Track','Greece',776,'Distance')," +
                    "(56,'Discus Throw','Individual','Outdoor','Discus',1,'Track','Greece',776,'Distance')," +
                    "(57,'Hammer Throw','Individual','Outdoor','Hammer',1,'Track','England',1880,'Distance')," +
                    "(58,'Weightlifting','Individual','Indoor','Weights',1,'Gym','Greece',1896,'Weight')," +
                    "(59,'Powerlifting','Individual','Indoor','Weights',1,'Gym','USA',1964,'Weight')," +
                    "(60,'CrossFit','Individual','Indoor','Various',1,'Gym','USA',2000,'Points')," +
                    "(61,'Rock Climbing','Individual','Outdoor','Gear',1,'Cliff','USA',1894,'Time/Points')," +
                    "(62,'Gym Fitness','Individual','Indoor','None',1,'Gym','Germany',1970,'Points')," +
                    "(63,'Orienteering','Individual','Outdoor','Map & Compass',1,'Forest','Sweden',1897,'Time')," +
                    "(64,'Bow Hunting','Individual','Outdoor','Bow',1,'Forest','USA',1900,'Points')," +
                    "(65,'Fishing','Individual','Outdoor','Rod & Bait',1,'Water','Worldwide',1400,'Weight')," +
                    "(66,'Snorkeling','Individual','Outdoor','Mask & Tube',1,'Water','Polynesia',1920,'Time')," +
                    "(67,'Scuba Diving','Individual','Outdoor','Gear',1,'Water','France',1943,'Points')," +
                    "(68,'Rowing','Team','Outdoor','Boat',8,'Water','UK',1829,'Time')," +
                    "(69,'Canoeing','Individual','Outdoor','Canoe',1,'Water','UK',1866,'Time')," +
                    "(70,'Kayaking','Individual','Outdoor','Kayak',1,'Water','USA',1930,'Time')," +
                    "(71,'Horse Racing','Individual','Outdoor','Horse',1,'Track','UK',1750,'Time')," +
                    "(72,'Equestrian','Individual','Outdoor','Horse',1,'Arena','France',1900,'Points')," +
                    "(73,'Polo','Team','Outdoor','Horse & Ball',4,'Field','Persia',600,'Goals')," +
                    "(74,'Cricket T10','Team','Outdoor','Bat & Ball',11,'Ground','UAE',2003,'Runs')," +
                    "(75,'Esports','Team','Indoor','Controller/PC',5,'Arena','South Korea',2000,'Points')";

            Statement statement = connection.createStatement();
            int rowAffected = statement.executeUpdate(sql);
            System.out.println(rowAffected + " " + "RowsAffected");   */

            //delete a row by pk
            Statement statement = connection.createStatement();
            String delete = "DELETE FROM sports WHERE s_id = 5";
            int d1 = statement.executeUpdate(delete);
            System.out.println(d1+"rowsAffected");

            //delete a multiple rows by any other column
            String delete1 = "DELETE FROM sports WHERE s_category = 'Indoor'";
            int d3 = statement.executeUpdate(delete1);
            System.out.println(d3+"rowsAffected");

            //Update least 4 columns using 4 different query jdbc on
            String update="update sports set s_name='Biker' where s_id=73 ";
            int update1=statement.executeUpdate(update);
            System.out.println(update1 +" "+"RowsAffected");

            String update2="update sports set s_id=34 where s_name='cricket' ";
            int update3=statement.executeUpdate(update2);
            System.out.println(update3 +" "+"RowsAffected");

            String update4="update sports set s_place='india' where s_scoring='points' ";
            int update5=statement.executeUpdate(update4);
            System.out.println(update5 +" "+"RowsAffected");

            String update6="update sports set s_category='outdoor' where s_id=65 ";
            int update7=statement.executeUpdate(update6);
            System.out.println(update7 +" "+"RowsAffected");

            System.out.println("View All rows");
            String select = "select * from sports";
            ResultSet resultSet = statement.executeQuery(select);

            while (resultSet.next()) {
                System.out.println("Id:" + resultSet.getString("s_id") + " "
                        + "Name:" + resultSet.getString("s_name") + " "
                        + "Type:" + resultSet.getString("s_type") + " "
                        + "Category:" + resultSet.getString("s_category") + " "
                        + "Equipment:" + resultSet.getString("s_equipment") + " "
                        + "PlayerCount:" + resultSet.getString("s_playercount") + " "
                        + "Place:" + resultSet.getString("s_place") + " "
                        + "Origin:" + resultSet.getString("s_origin") + " "
                        + "Year:" + resultSet.getString("s_year") + " "
                        + "Scoring:" + resultSet.getString("s_scoring") + " ");
            }
            System.out.println("--------------------------------");


           System.out.println("View one rows");
            String select1 = "select * from sports where s_name='kayaking' ";
            ResultSet resultSet1 = statement.executeQuery(select1);

            while (resultSet1.next()) {
                System.out.println("Id:" + resultSet1.getString("s_id") + " "
                        + "Name:" + resultSet1.getString("s_name") + " "
                        + "Type:" + resultSet1.getString("s_type") + " "
                        + "Category:" + resultSet1.getString("s_category") + " "
                        + "Equipment:" + resultSet1.getString("s_equipment") + " "
                        + "PlayerCount:" + resultSet1.getString("s_playercount") + " "
                        + "Place:" + resultSet1.getString("s_place") + " "
                        + "Origin:" + resultSet1.getString("s_origin") + " "
                        + "Year:" + resultSet1.getString("s_year") + " "
                        + "Scoring:" + resultSet1.getString("s_scoring") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View 1 Row 1 column");
            String select2 = "select s_type from sports where s_id=65";
            ResultSet resultSet2 = statement.executeQuery(select2);

            while (resultSet2.next()) {
                System.out.println(" " + resultSet2.getString(1));

            }
            System.out.println("--------------------------------");


            System.out.println("View two rows");
            String select3 = "select * from sports where s_id=64 or s_name='kayaking'"; // or use "select * from sports limit 2"
            ResultSet resultSet3 = statement.executeQuery(select3);

            while (resultSet3.next()) {
                System.out.println("Id:" + resultSet3.getString("s_id") + " "
                        + "Name:" + resultSet3.getString("s_name") + " "
                        + "Type:" + resultSet3.getString("s_type") + " "
                        + "Category:" + resultSet3.getString("s_category") + " "
                        + "Equipment:" + resultSet3.getString("s_equipment") + " "
                        + "PlayerCount:" + resultSet3.getString("s_playercount") + " "
                        + "Place:" + resultSet3.getString("s_place") + " "
                        + "Origin:" + resultSet3.getString("s_origin") + " "
                        + "Year:" + resultSet3.getString("s_year") + " "
                        + "Scoring:" + resultSet3.getString("s_scoring") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View three rows");
            String select4 = "select * from sports limit 3";
            ResultSet resultSet4 = statement.executeQuery(select4);

            while (resultSet4.next()) {
                System.out.println("Id:" + resultSet4.getString("s_id") + " "
                        + "Name:" + resultSet4.getString("s_name") + " "
                        + "Type:" + resultSet4.getString("s_type") + " "
                        + "Category:" + resultSet4.getString("s_category") + " "
                        + "Equipment:" + resultSet4.getString("s_equipment") + " "
                        + "PlayerCount:" + resultSet4.getString("s_playercount") + " "
                        + "Place:" + resultSet4.getString("s_place") + " "
                        + "Origin:" + resultSet4.getString("s_origin") + " "
                        + "Year:" + resultSet4.getString("s_year") + " "
                        + "Scoring:" + resultSet4.getString("s_scoring") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View one column all rows");
            String select5 = "select s_name from sports";
            ResultSet resultSet5 = statement.executeQuery(select5);

            while (resultSet5.next()) {
                System.out.println("Name:" + resultSet5.getString("s_name") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View count(*)");
            String select7 = "select count(*) from sports";
            ResultSet resultSet7 = statement.executeQuery(select7);
            while (resultSet7.next()) {
                System.out.println("Total values:" + resultSet7.getInt(1));
            }
            System.out.println("--------------------------------");


            System.out.println("View distinct");
            String select8 = "select distinct s_name from sports";
            ResultSet resultSet8 = statement.executeQuery(select8);
            while (resultSet8.next()) {
                System.out.println("Distints:" + resultSet8.getString("s_name"));
            }
            System.out.println("--------------------------------");


            System.out.println("View latest row");
            String select6 = "select * from sports order by s_id desc limit 1";
            ResultSet resultSet6 = statement.executeQuery(select6);

            while (resultSet6.next()) {
                System.out.println("Id:" + resultSet6.getString("s_id") + " "
                        + "Name:" + resultSet6.getString("s_name") + " "
                        + "Type:" + resultSet6.getString("s_type") + " "
                        + "Category:" + resultSet6.getString("s_category") + " "
                        + "Equipment:" + resultSet6.getString("s_equipment") + " "
                        + "PlayerCount:" + resultSet6.getString("s_playercount") + " "
                        + "Place:" + resultSet6.getString("s_place") + " "
                        + "Origin:" + resultSet6.getString("s_origin") + " "
                        + "Year:" + resultSet6.getString("s_year") + " "
                        + "Scoring:" + resultSet6.getString("s_scoring") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Max 2 rows");
            String select10 = "select * from sports order by s_id desc limit 2";
            ResultSet resultSet10 = statement.executeQuery(select10);

            while (resultSet10.next()) {
                System.out.println("Id:" + resultSet10.getString("s_id") + " "
                        + "Name:" + resultSet10.getString("s_name") + " "
                        + "Type:" + resultSet10.getString("s_type") + " "
                        + "Category:" + resultSet10.getString("s_category") + " "
                        + "Equipment:" + resultSet10.getString("s_equipment") + " "
                        + "PlayerCount:" + resultSet10.getString("s_playercount") + " "
                        + "Place:" + resultSet10.getString("s_place") + " "
                        + "Origin:" + resultSet10.getString("s_origin") + " "
                        + "Year:" + resultSet10.getString("s_year") + " "
                        + "Scoring:" + resultSet10.getString("s_scoring") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Min 5 rows");
            String select11 = "select * from sports order by s_id asc limit 5";
            ResultSet resultSet11 = statement.executeQuery(select11);

            while (resultSet11.next()) {
                System.out.println("Id:" + resultSet11.getString("s_id") + " "
                        + "Name:" + resultSet11.getString("s_name") + " "
                        + "Type:" + resultSet11.getString("s_type") + " "
                        + "Category:" + resultSet11.getString("s_category") + " "
                        + "Equipment:" + resultSet11.getString("s_equipment") + " "
                        + "PlayerCount:" + resultSet11.getString("s_playercount") + " "
                        + "Place:" + resultSet11.getString("s_place") + " "
                        + "Origin:" + resultSet11.getString("s_origin") + " "
                        + "Year:" + resultSet11.getString("s_year") + " "
                        + "Scoring:" + resultSet11.getString("s_scoring") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View oldest row");
            String select12 = "select * from sports order by s_id asc limit 1";
            ResultSet resultSet12 = statement.executeQuery(select12);

            while (resultSet12.next()) {
                System.out.println("Id:" + resultSet12.getString("s_id") + " "
                        + "Name:" + resultSet12.getString("s_name") + " "
                        + "Type:" + resultSet12.getString("s_type") + " "
                        + "Category:" + resultSet12.getString("s_category") + " "
                        + "Equipment:" + resultSet12.getString("s_equipment") + " "
                        + "PlayerCount:" + resultSet12.getString("s_playercount") + " "
                        + "Place:" + resultSet12.getString("s_place") + " "
                        + "Origin:" + resultSet12.getString("s_origin") + " "
                        + "Year:" + resultSet12.getString("s_year") + " "
                        + "Scoring:" + resultSet12.getString("s_scoring") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Desending Order");
            String select13 = "select * from sports order by s_id desc";
            ResultSet resultSet13 = statement.executeQuery(select13);

            while (resultSet13.next()) {
                System.out.println("Id:" + resultSet13.getString("s_id") + " "
                        + "Name:" + resultSet13.getString("s_name") + " "
                        + "Type:" + resultSet13.getString("s_type") + " "
                        + "Category:" + resultSet13.getString("s_category") + " "
                        + "Equipment:" + resultSet13.getString("s_equipment") + " "
                        + "PlayerCount:" + resultSet13.getString("s_playercount") + " "
                        + "Place:" + resultSet13.getString("s_place") + " "
                        + "Origin:" + resultSet13.getString("s_origin") + " "
                        + "Year:" + resultSet13.getString("s_year") + " "
                        + "Scoring:" + resultSet13.getString("s_scoring") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Group By");
            String select9 = "select s_type,count(*) as total_sports from sports group by s_type";
            ResultSet resultSet9 = statement.executeQuery(select9);
            while (resultSet9.next()) {
                System.out.println("sports Type:" + resultSet9.getString("s_type") + " " + "Total Available=" + resultSet9.getString("total_sports"));
            }
            System.out.println("--------------------------------");


            System.out.println("View Group By with Having");
            String select14 = "select s_type,count(*) as total_sports from sports group by s_type having count(*) >3";
            ResultSet resultSet14 = statement.executeQuery(select14);
            while (resultSet14.next()) {
                System.out.println("sports Type:" + resultSet14.getString("s_type") + " " + "Total Available=" + resultSet14.getString("total_sports"));
            }
            System.out.println("--------------------------------");
        } catch (Exception s) {
            s.printStackTrace();
        }


        System.out.println("main ended");
    }
}
