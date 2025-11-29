package com.xworkz.sweet;

import java.sql.*;

public class Sweet {
    public static void main(String[] args) {
        System.out.println("main started");
        String url = "jdbc:mysql://localhost:3306/xworkz";
        String username = "root";
        String password = "Vina@2002";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected" + connection);

        /*    String sql = "insert into sweet values(6,'laddu','sugar','sweet','yellow','medium',150)," +
                    "(7,'barfi','milk','sweet','white','small',200)," +
                    "(8,'rasgulla','milk','sweet','white','medium',250)," +
                    "(9,'gulabjamun','milk','sweet','brown','small',180)," +
                    "(10,'kachori','flour','spicy','brown','medium',120)," +
                    "(11,'balushahi','sugar','sweet','golden','medium',160)," +
                    "(12,'soanpapdi','gram','sweet','yellow','small',140)," +
                    "(13,'mysorepak','gram','sweet','yellow','medium',220)," +
                    "(14,'halwa','wheat','sweet','orange','medium',130)," +
                    "(15,'peda','milk','sweet','cream','small',190)," +
                    "(16,'jamun','milk','sweet','darkbrown','small',175)," +
                    "(17,'kheer','milk','sweet','white','medium',110)," +
                    "(18,'modak','rice','sweet','white','small',210)," +
                    "(19,'chikki','jaggery','sweet','brown','small',90)," +
                    "(20,'barfi2','milk','sweet','pink','small',175)," +
                    "(21,'lollipop','sugar','sweet','red','small',60)," +
                    "(22,'kajukatli','cashew','sweet','silver','small',280)," +
                    "(23,'milkshake','milk','sweet','cream','medium',130)," +
                    "(24,'pastry','flour','sweet','brown','medium',95)," +
                    "(25,'brownie','choco','sweet','brown','medium',160)," +
                    "(26,'donut','flour','sweet','pink','medium',140)," +
                    "(27,'toffee','sugar','sweet','brown','small',40)," +
                    "(28,'burfi3','milk','sweet','yellow','small',175)," +
                    "(29,'sandesh','milk','sweet','white','small',155)," +
                    "(30,'jhavar','jaggery','sweet','brown','small',85)," +
                    "(31,'mawa','milk','sweet','cream','small',210)," +
                    "(32,'imarti','sugar','sweet','orange','medium',170)," +
                    "(33,'rabri','milk','sweet','cream','medium',250)," +
                    "(34,'malpua','flour','sweet','golden','medium',190)," +
                    "(35,'ghewar','flour','sweet','yellow','large',260)," +
                    "(36,'kalakand','milk','sweet','white','medium',230)," +
                    "(37,'jalebi2','sugar','sweet','orange','small',120)," +
                    "(38,'burfi4','milk','sweet','green','small',180)," +
                    "(39,'rasmalai','milk','sweet','yellow','medium',300)," +
                    "(40,'sheera','semolina','sweet','yellow','medium',90)," +
                    "(41,'shrikhand','curd','sweet','yellow','small',200)," +
                    "(42,'kajuroll','cashew','sweet','silver','small',320)," +
                    "(43,'badamhalwa','almond','sweet','brown','small',350)," +
                    "(44,'coconutbarfi','coconut','sweet','white','small',170)," +
                    "(45,'gajak','sesame','sweet','brown','small',130)," +
                    "(46,'tilhalwa','sesame','sweet','brown','medium',140)," +
                    "(47,'bananacake','flour','sweet','yellow','medium',160)," +
                    "(48,'fruitbar','mix','sweet','multi','small',120)," +
                    "(49,'peanutbar','peanut','sweet','brown','small',95)," +
                    "(50,'navratan','mix','sweet','multi','small',180)," +
                    "(51,'honeycake','flour','sweet','pink','medium',150)," +
                    "(52,'cupcake','flour','sweet','cream','small',110)," +
                    "(53,'icecandy','sugar','sweet','orange','small',30)," +
                    "(54,'mangojelly','mango','sweet','yellow','small',45)," +
                    "(55,'berrycandy','berry','sweet','purple','small',55)," +
                    "(56,'mintcandy','mint','sweet','green','small',20)," +
                    "(57,'orangebar','orange','sweet','orange','small',35)," +
                    "(58,'pistabar','pista','sweet','green','small',260)," +
                    "(59,'dryfruitbar','mix','sweet','brown','small',270)," +
                    "(60,'blackhalwa','wheat','sweet','black','medium',190)," +
                    "(61,'rosebarfi','rose','sweet','pink','small',225)," +
                    "(62,'strawberrycandy','berry','sweet','pink','small',35)," +
                    "(63,'chocobar','choco','sweet','brown','small',50)," +
                    "(64,'mixbarfi','mix','sweet','multi','small',240)," +
                    "(65,'honeybar','honey','sweet','golden','small',85)," +
                    "(66,'caramelcandy','caramel','sweet','brown','small',25)," +
                    "(67,'vanillabar','vanilla','sweet','white','small',40)," +
                    "(68,'butterscotch','butter','sweet','yellow','small',60)," +
                    "(69,'kesarbarfi','kesar','sweet','yellow','small',300)," +
                    "(70,'pineapplecake','flour','sweet','yellow','medium',170)," +
                    "(71,'gemsbar','choco','sweet','multi','small',15)," +
                    "(72,'mohanthal','gram','sweet','yellow','medium',190)," +
                    "(73,'sweetroll','flour','sweet','white','medium',95)," +
                    "(74,'chakki','wheat','sweet','brown','medium',80)," +
                    "(75,'amritbarfi','milk','sweet','cream','small',260)";
            Statement statement = connection.createStatement();
            int rowAffected = statement.executeUpdate(sql);
            System.out.println(rowAffected + " " + "RowsAffected");      */

            //delete a row by pk
            Statement statement = connection.createStatement();
            String delete = "DELETE FROM sweet WHERE s_id = 5";
            int d1 = statement.executeUpdate(delete);
            System.out.println(d1 + "rowsAffected");

            //delete a multiple rows by any other column
            String delete1 = "DELETE FROM sweet WHERE s_name = 'jilebi'";
            int d3 = statement.executeUpdate(delete1);
            System.out.println(d3 + "rowsAffected");

            //Update least 4 columns using 4 different query jdbc on
            String update = "update sweet set s_name='venilla' where s_id=73 ";
            int update1 = statement.executeUpdate(update);
            System.out.println(update1 + " " + "RowsAffected");

            String update2 = "update sweet set s_type='flour' where s_price=170 ";
            int update3 = statement.executeUpdate(update2);
            System.out.println(update3 + " " + "RowsAffected");

            String update4 = "update sweet set s_flavor='sweet' where s_color='yellow' ";
            int update5 = statement.executeUpdate(update4);
            System.out.println(update5 + " " + "RowsAffected");

            String update6 = "update sweet set s_size='large' where s_name='chakki' ";
            int update7 = statement.executeUpdate(update6);
            System.out.println(update7 + " " + "RowsAffected");

            System.out.println("View All rows");
            String select = "select * from sweet";
            ResultSet resultSet = statement.executeQuery(select);

            while (resultSet.next()) {
                System.out.println("Id:" + resultSet.getString("s_id") + " "
                        + "Name:" + resultSet.getString("s_name") + " "
                        + "Type:" + resultSet.getString("s_type") + " "
                        + "Flavor:" + resultSet.getString("s_flavor") + " "
                        + "Color:" + resultSet.getString("s_color") + " "
                        + "Size:" + resultSet.getString("s_size") + " "
                        + "Price:" + resultSet.getString("s_price") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View one rows");
            String select1 = "select * from sweet where s_name='barfi' ";
            ResultSet resultSet1 = statement.executeQuery(select1);

            while (resultSet1.next()) {
                System.out.println("Id:" + resultSet1.getString("s_id") + " "
                        + "Name:" + resultSet1.getString("s_name") + " "
                        + "Type:" + resultSet1.getString("s_type") + " "
                        + "Flavor:" + resultSet1.getString("s_flavor") + " "
                        + "Color:" + resultSet1.getString("s_color") + " "
                        + "Size:" + resultSet1.getString("s_size") + " "
                        + "Price:" + resultSet1.getString("s_price") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View 1 Row 1 column");
            String select2 = "select s_type from sweet where s_id=6";
            ResultSet resultSet2 = statement.executeQuery(select2);

            while (resultSet2.next()) {
                System.out.println(" " + resultSet2.getString(1));

            }
            System.out.println("--------------------------------");


            System.out.println("View two rows");
            String select3 = "select * from sweet where s_id=64 or s_name='chocobar'"; // or use "select * from sweet limit 2"
            ResultSet resultSet3 = statement.executeQuery(select3);

            while (resultSet3.next()) {
                System.out.println("Id:" + resultSet3.getString("s_id") + " "
                        + "Name:" + resultSet3.getString("s_name") + " "
                        + "Type:" + resultSet3.getString("s_type") + " "
                        + "Flavor:" + resultSet3.getString("s_flavor") + " "
                        + "Color:" + resultSet3.getString("s_color") + " "
                        + "Size:" + resultSet3.getString("s_size") + " "
                        + "Price:" + resultSet3.getString("s_price") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View three rows");
            String select4 = "select * from sweet limit 3";
            ResultSet resultSet4 = statement.executeQuery(select4);

            while (resultSet4.next()) {
                System.out.println("Id:" + resultSet4.getString("s_id") + " "
                        + "Name:" + resultSet4.getString("s_name") + " "
                        + "Type:" + resultSet4.getString("s_type") + " "
                        + "Flavor:" + resultSet4.getString("s_flavor") + " "
                        + "Color:" + resultSet4.getString("s_color") + " "
                        + "Size:" + resultSet4.getString("s_size") + " "
                        + "Price:" + resultSet4.getString("s_price") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View one column all rows");
            String select5 = "select s_name from sweet";
            ResultSet resultSet5 = statement.executeQuery(select5);

            while (resultSet5.next()) {
                System.out.println("Name:" + resultSet5.getString("s_name") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View count(*)");
            String select7 = "select count(*) from sweet";
            ResultSet resultSet7 = statement.executeQuery(select7);
            while (resultSet7.next()) {
                System.out.println("Total values:" + resultSet7.getInt(1));
            }
            System.out.println("--------------------------------");


            System.out.println("View distinct");
            String select8 = "select distinct s_name from sweet";
            ResultSet resultSet8 = statement.executeQuery(select8);
            while (resultSet8.next()) {
                System.out.println("Distints:" + resultSet8.getString("s_name"));
            }
            System.out.println("--------------------------------");


            System.out.println("View latest row");
            String select6 = "select * from sweet order by s_id desc limit 1";
            ResultSet resultSet6 = statement.executeQuery(select6);

            while (resultSet6.next()) {
                System.out.println("Id:" + resultSet6.getString("s_id") + " "
                        + "Name:" + resultSet6.getString("s_name") + " "
                        + "Type:" + resultSet6.getString("s_type") + " "
                        + "Flavor:" + resultSet6.getString("s_flavor") + " "
                        + "Color:" + resultSet6.getString("s_color") + " "
                        + "Size:" + resultSet6.getString("s_size") + " "
                        + "Price:" + resultSet6.getString("s_price") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Max 2 rows");
            String select10 = "select * from sweet order by s_id desc limit 2";
            ResultSet resultSet10 = statement.executeQuery(select10);

            while (resultSet10.next()) {
                System.out.println("Id:" + resultSet10.getString("s_id") + " "
                        + "Name:" + resultSet10.getString("s_name") + " "
                        + "Type:" + resultSet10.getString("s_type") + " "
                        + "Flavor:" + resultSet10.getString("s_flavor") + " "
                        + "Color:" + resultSet10.getString("s_color") + " "
                        + "Size:" + resultSet10.getString("s_size") + " "
                        + "Price:" + resultSet10.getString("s_price") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Min 5 rows");
            String select11 = "select * from sweet order by s_id asc limit 5";
            ResultSet resultSet11 = statement.executeQuery(select11);

            while (resultSet11.next()) {
                System.out.println("Id:" + resultSet11.getString("s_id") + " "
                        + "Name:" + resultSet11.getString("s_name") + " "
                        + "Type:" + resultSet11.getString("s_type") + " "
                        + "Flavor:" + resultSet11.getString("s_flavor") + " "
                        + "Color:" + resultSet11.getString("s_color") + " "
                        + "Size:" + resultSet11.getString("s_size") + " "
                        + "Price:" + resultSet11.getString("s_price") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View oldest row");
            String select12 = "select * from sweet order by s_id asc limit 1";
            ResultSet resultSet12 = statement.executeQuery(select12);

            while (resultSet12.next()) {
                System.out.println("Id:" + resultSet12.getString("s_id") + " "
                        + "Name:" + resultSet12.getString("s_name") + " "
                        + "Type:" + resultSet12.getString("s_type") + " "
                        + "Flavor:" + resultSet12.getString("s_flavor") + " "
                        + "Color:" + resultSet12.getString("s_color") + " "
                        + "Size:" + resultSet12.getString("s_size") + " "
                        + "Price:" + resultSet12.getString("s_price") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Desending Order");
            String select13 = "select * from sweet order by s_id desc";
            ResultSet resultSet13 = statement.executeQuery(select13);

            while (resultSet13.next()) {
                System.out.println("Id:" + resultSet13.getString("s_id") + " "
                        + "Name:" + resultSet13.getString("s_name") + " "
                        + "Type:" + resultSet13.getString("s_type") + " "
                        + "Flavor:" + resultSet13.getString("s_flavor") + " "
                        + "Color:" + resultSet13.getString("s_color") + " "
                        + "Size:" + resultSet13.getString("s_size") + " "
                        + "Price:" + resultSet13.getString("s_price") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Group By");
            String select9 = "select s_type,count(*) as total_sweets from sweet group by s_type";
            ResultSet resultSet9 = statement.executeQuery(select9);
            while (resultSet9.next()) {
                System.out.println("Sweet Type:" + resultSet9.getString("s_type") + " " + "Total Available=" + resultSet9.getString("total_sweets"));
            }
            System.out.println("--------------------------------");


            System.out.println("View Group By with Having");
            String select14 = "select s_type,count(*) as total_sweets from sweet group by s_type having count(*) >2";
            ResultSet resultSet14 = statement.executeQuery(select14);
            while (resultSet14.next()) {
                System.out.println("Sweet Type:" + resultSet14.getString("s_type") + " " + "Total Available=" + resultSet14.getString("total_sweets"));
            }
            System.out.println("--------------------------------");


        } catch (SQLException e) {
            e.printStackTrace();
        }


        System.out.println("main ended");
    }
}
