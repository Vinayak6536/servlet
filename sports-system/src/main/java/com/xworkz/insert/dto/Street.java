package com.xworkz.insert.dto;

import com.xworkz.insert.constants.JDBCConnect;

import java.sql.*;

public class Street {
    public static void main(String[] args) {
        System.out.println("main started");

        try(Connection connection = DriverManager.getConnection(
                JDBCConnect.URL.getS(),JDBCConnect.USERNAME.getS(),JDBCConnect.SECRET.getS())){

            System.out.println("Connected" + connection);

           /* String sql = "insert into street values(2,'Brigade Road','Road','Bangalore','Karnataka','India',1200.00,40,'Concrete',2,'Medium','Y','Y')," +
                    "(3,'Connaught Place','Avenue','New Delhi','Delhi','India',3000.00,50,'Asphalt',6,'High','Y','Y')," +
                    "(4,'Janpath','Road','New Delhi','Delhi','India',1500.00,40,'Asphalt',4,'Medium','Y','Y')," +
                    "(5,'Park Street','Avenue','Kolkata','West Bengal','India',2000.00,45,'Asphalt',4,'High','Y','Y')," +
                    "(6,'Camac Street','Road','Kolkata','West Bengal','India',1800.00,40,'Concrete',3,'Medium','Y','Y')," +
                    "(7,'Marine Drive','Road','Mumbai','Maharashtra','India',3500.00,50,'Asphalt',6,'High','N','Y')," +
                    "(8,'Linking Road','Road','Mumbai','Maharashtra','India',2200.00,45,'Asphalt',4,'High','Y','Y')," +
                    "(9,'Anna Salai','Road','Chennai','Tamil Nadu','India',3000.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(10,'T Nagar Main Road','Road','Chennai','Tamil Nadu','India',1500.00,40,'Concrete',3,'Medium','Y','Y')," +
                    "(11,'MG Road','Road','Pune','Maharashtra','India',2000.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(12,'FC Road','Road','Pune','Maharashtra','India',1800.00,45,'Asphalt',3,'Medium','Y','Y')," +
                    "(13,'Commercial Street','Avenue','Bangalore','Karnataka','India',1400.00,40,'Concrete',2,'Medium','Y','Y')," +
                    "(14,'Old Mahabalipuram Road','Road','Chennai','Tamil Nadu','India',2500.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(15,'North Avenue','Avenue','New Delhi','Delhi','India',1200.00,40,'Asphalt',3,'Medium','Y','Y')," +
                    "(16,'Park Circus','Road','Kolkata','West Bengal','India',1600.00,45,'Concrete',3,'Medium','Y','Y')," +
                    "(17,'Colaba Causeway','Road','Mumbai','Maharashtra','India',1500.00,35,'Asphalt',2,'Medium','Y','Y')," +
                    "(18,'Ring Road','Road','Bangalore','Karnataka','India',3200.00,60,'Asphalt',6,'High','N','Y')," +
                    "(19,'Old Airport Road','Road','Bangalore','Karnataka','India',2200.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(20,'Ashok Rajpath','Road','Patna','Bihar','India',1800.00,45,'Asphalt',4,'Medium','Y','Y')," +
                    "(21,'Rajpath','Road','New Delhi','Delhi','India',2800.00,50,'Asphalt',6,'High','Y','Y')," +
                    "(22,'Subhash Road','Road','Kolkata','West Bengal','India',1600.00,40,'Concrete',3,'Medium','Y','Y')," +
                    "(23,'Hazratganj','Avenue','Lucknow','Uttar Pradesh','India',1400.00,35,'Asphalt',2,'Medium','Y','Y')," +
                    "(24,'MG Road','Road','Indore','Madhya Pradesh','India',2000.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(25,'Civil Lines','Road','Nagpur','Maharashtra','India',1800.00,45,'Asphalt',3,'Medium','Y','Y')," +
                    "(26,'Brigade Road','Road','Mysore','Karnataka','India',1500.00,40,'Concrete',2,'Medium','Y','Y')," +
                    "(27,'High Street','Avenue','Bhubaneswar','Odisha','India',2200.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(28,'Gariahat Road','Road','Kolkata','West Bengal','India',2000.00,45,'Asphalt',4,'High','Y','Y')," +
                    "(29,'Link Road','Road','Thane','Maharashtra','India',1800.00,50,'Concrete',3,'Medium','Y','Y')," +
                    "(30,'Ramakrishna Road','Avenue','Chennai','Tamil Nadu','India',1600.00,40,'Asphalt',3,'Medium','Y','Y')," +
                    "(31,'Old Madras Road','Road','Bangalore','Karnataka','India',2500.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(32,'South Extension','Avenue','New Delhi','Delhi','India',1500.00,35,'Asphalt',2,'Medium','Y','Y')," +
                    "(33,'Cantonment Road','Road','Pune','Maharashtra','India',1800.00,45,'Asphalt',3,'Medium','Y','Y')," +
                    "(34,'Park Avenue','Avenue','Kolkata','West Bengal','India',1600.00,40,'Concrete',3,'Medium','Y','Y')," +
                    "(35,'Viman Nagar Road','Road','Pune','Maharashtra','India',2000.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(36,'Kamal Street','Road','Jaipur','Rajasthan','India',1500.00,40,'Asphalt',3,'Medium','Y','Y')," +
                    "(37,'Civil Street','Avenue','Chandigarh','Punjab','India',1600.00,45,'Asphalt',3,'Medium','Y','Y')," +
                    "(38,'Gokhale Road','Road','Mumbai','Maharashtra','India',1800.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(39,'Shivaji Marg','Road','New Delhi','Delhi','India',2000.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(40,'Sadar Bazaar','Avenue','Agra','Uttar Pradesh','India',1400.00,35,'Concrete',2,'Medium','Y','Y')," +
                    "(41,'Mall Road','Road','Shimla','Himachal Pradesh','India',1600.00,40,'Asphalt',3,'Medium','Y','Y')," +
                    "(42,'MG Road','Road','Kochi','Kerala','India',2000.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(43,'Rajiv Gandhi Road','Avenue','Hyderabad','Telangana','India',2500.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(44,'Anna Salai','Road','Chennai','Tamil Nadu','India',2200.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(45,'MG Road','Road','Kanpur','Uttar Pradesh','India',1800.00,45,'Asphalt',3,'Medium','Y','Y')," +
                    "(46,'Brigade Road','Road','Bangalore','Karnataka','India',1500.00,40,'Concrete',2,'Medium','Y','Y')," +
                    "(47,'Park Street','Avenue','Kolkata','West Bengal','India',2000.00,45,'Asphalt',4,'High','Y','Y')," +
                    "(48,'Linking Road','Road','Mumbai','Maharashtra','India',2200.00,45,'Asphalt',4,'High','Y','Y')," +
                    "(49,'Anna Salai','Road','Chennai','Tamil Nadu','India',3000.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(50,'T Nagar Main Road','Road','Chennai','Tamil Nadu','India',1500.00,40,'Concrete',3,'Medium','Y','Y')," +
                    "(51,'Broadway','Road','New York','NY','USA',3000.00,50,'Asphalt',6,'High','Y','Y')," +
                    "(52,'Fifth Avenue','Avenue','New York','NY','USA',2500.00,50,'Asphalt',6,'High','Y','Y')," +
                    "(53,'Champs-Élysées','Avenue','Paris','Île-de-France','France',2000.00,50,'Asphalt',6,'High','Y','Y')," +
                    "(54,'Oxford Street','Road','London','England','UK',2200.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(55,'Kings Road','Road','London','England','UK',1800.00,45,'Concrete',3,'Medium','Y','Y')," +
                    "(56,'Alexanderplatz','Avenue','Berlin','Berlin','Germany',2000.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(57,'La Rambla','Road','Barcelona','Catalonia','Spain',1700.00,40,'Asphalt',4,'Medium','Y','Y')," +
                    "(58,'Via del Corso','Road','Rome','Lazio','Italy',1500.00,35,'Asphalt',3,'Medium','Y','Y')," +
                    "(59,'Kurfürstendamm','Avenue','Berlin','Berlin','Germany',2200.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(60,'Nanjing Road','Road','Shanghai','Shanghai','China',2500.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(61,'Orchard Road','Road','Singapore','Singapore','Singapore',2000.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(62,'Queen Street','Road','Auckland','Auckland','New Zealand',1800.00,45,'Concrete',3,'Medium','Y','Y')," +
                    "(63,'Nathan Road','Road','Hong Kong','Hong Kong','China',2000.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(64,'Ginza','Avenue','Tokyo','Tokyo','Japan',1500.00,40,'Asphalt',3,'Medium','Y','Y')," +
                    "(65,'Collins Street','Road','Melbourne','Victoria','Australia',2000.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(66,'Bourke Street','Road','Melbourne','Victoria','Australia',1800.00,45,'Concrete',3,'Medium','Y','Y')," +
                    "(67,'Rue de Rivoli','Road','Paris','Île-de-France','France',2200.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(68,'Avenida Paulista','Avenue','Sao Paulo','Sao Paulo','Brazil',2500.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(69,'Queen Street','Road','Toronto','Ontario','Canada',2000.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(70,'King Street','Road','Toronto','Ontario','Canada',1800.00,45,'Concrete',3,'Medium','Y','Y')," +
                    "(71,'Fifth Avenue','Avenue','New York','NY','USA',2500.00,50,'Asphalt',6,'High','Y','Y')," +
                    "(72,'Market Street','Road','San Francisco','CA','USA',2000.00,50,'Asphalt',4,'High','Y','Y')," +
                    "(73,'Lombard Street','Road','San Francisco','CA','USA',1200.00,35,'Asphalt',2,'Medium','Y','Y')," +
                    "(74,'Las Ramblas','Road','Barcelona','Catalonia','Spain',1800.00,40,'Asphalt',4,'Medium','Y','Y')," +
                    "(75,'Nevsky Prospekt','Avenue','Saint Petersburg','Russia','Russia',2200.00,50,'Asphalt',4,'High','Y','Y');";
            Statement statement = connection.createStatement();
            int rowAffected = statement.executeUpdate(sql);
            System.out.println(rowAffected + " " + "RowsAffected"); */

            //delete a row by pk
            Statement statement = connection.createStatement();
            String delete = "DELETE FROM street WHERE street_id = 7";
            int d1 = statement.executeUpdate(delete);
            System.out.println(d1+"rowsAffected");

            //delete a multiple rows by any other column
            String delete1 = "DELETE FROM street WHERE street_category = 'tokyo'";
            int d3 = statement.executeUpdate(delete1);
            System.out.println(d3+"rowsAffected");

            //Update least 4 columns using 4 different query jdbc on
            String update="update street set street_name='Darshi' where street_id=73 ";
            int update1=statement.executeUpdate(update);
            System.out.println(update1 +" "+"RowsAffected");

            String update2="update street set street_id=76 where street_name='market street' ";
            int update3=statement.executeUpdate(update2);
            System.out.println(update3 +" "+"RowsAffected");

            String update4="update street set number_of_lanes=22 where street_id=56 ";
            int update5=statement.executeUpdate(update4);
            System.out.println(update5 +" "+"RowsAffected");

            String update6="update street set Country_name='india' where surface_type='asphalt' ";
            int update7=statement.executeUpdate(update6);
            System.out.println(update7 +" "+"RowsAffected");

            System.out.println("View All rows");
            String select = "select * from street";
            ResultSet resultSet = statement.executeQuery(select);

            while (resultSet.next()) {
                System.out.println("Street Id:" + resultSet.getString("street_id") + " "
                        + "Name:" + resultSet.getString("street_name") + " "
                        + "Category:" + resultSet.getString("street_category") + " "
                        + "City Name:" + resultSet.getString("city_name") + " "
                        + "State Name:" + resultSet.getString("state_name") + " "
                        + "Country Name:" + resultSet.getString("country_name") + " "
                        + "Length In Meters:" + resultSet.getString("length_meters") + " "
                        + "Max Speed:" + resultSet.getString("max_speed") + " "
                        + "Surface Type:" + resultSet.getString("surface_type") + " "
                        + "Number Of Lanes:" + resultSet.getString("number_of_lanes") + " "
                        + "Traffic Density:" + resultSet.getString("traffic_density") + " "
                        + "has_Parking:" + resultSet.getString("has_parking") + " "
                        + "Has Street Lights:" + resultSet.getString("has_street_lights") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View one rows");
            String select1 = "select * from street where street_name='high street' ";
            ResultSet resultSet1 = statement.executeQuery(select1);

            while (resultSet1.next()) {
                System.out.println("Street Id:" + resultSet1.getString("street_id") + " "
                        + "Name:" + resultSet1.getString("street_name") + " "
                        + "Category:" + resultSet1.getString("street_category") + " "
                        + "City Name:" + resultSet1.getString("city_name") + " "
                        + "State Name:" + resultSet1.getString("state_name") + " "
                        + "Country Name:" + resultSet1.getString("country_name") + " "
                        + "Length In Meters:" + resultSet1.getString("length_meters") + " "
                        + "Max Speed:" + resultSet1.getString("max_speed") + " "
                        + "Surface Type:" + resultSet1.getString("surface_type") + " "
                        + "Number Of Lanes:" + resultSet1.getString("number_of_lanes") + " "
                        + "Traffic Density:" + resultSet1.getString("traffic_density") + " "
                        + "has_Parking:" + resultSet1.getString("has_parking") + " "
                        + "Has Street Lights:" + resultSet1.getString("has_street_lights") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View 1 Row 1 column");
            String select2 = "select street_category from street where street_id=65";
            ResultSet resultSet2 = statement.executeQuery(select2);

            while (resultSet2.next()) {
                System.out.println(" " + resultSet2.getString(1));

            }
            System.out.println("--------------------------------");


            System.out.println("View two rows");
            String select3 = "select * from street where street_id=64 or street_name='la rambla'"; // or use "select * from street limit 2"
            ResultSet resultSet3 = statement.executeQuery(select3);

            while (resultSet3.next()) {
                System.out.println("Street Id:" + resultSet3.getString("street_id") + " "
                        + "Name:" + resultSet3.getString("street_name") + " "
                        + "Category:" + resultSet3.getString("street_category") + " "
                        + "City Name:" + resultSet3.getString("city_name") + " "
                        + "State Name:" + resultSet3.getString("state_name") + " "
                        + "Country Name:" + resultSet3.getString("country_name") + " "
                        + "Length In Meters:" + resultSet3.getString("length_meters") + " "
                        + "Max Speed:" + resultSet3.getString("max_speed") + " "
                        + "Surface Type:" + resultSet3.getString("surface_type") + " "
                        + "Number Of Lanes:" + resultSet3.getString("number_of_lanes") + " "
                        + "Traffic Density:" + resultSet3.getString("traffic_density") + " "
                        + "has_Parking:" + resultSet3.getString("has_parking") + " "
                        + "Has Street Lights:" + resultSet3.getString("has_street_lights") + " ");
            }
            System.out.println("--------------------------------");


           System.out.println("View three rows");
            String select4 = "select * from street limit 3";
            ResultSet resultSet4 = statement.executeQuery(select4);

            while (resultSet4.next()) {
                System.out.println("Street Id:" + resultSet4.getString("street_id") + " "
                        + "Name:" + resultSet4.getString("street_name") + " "
                        + "Category:" + resultSet4.getString("street_category") + " "
                        + "City Name:" + resultSet4.getString("city_name") + " "
                        + "State Name:" + resultSet4.getString("country_name") + " "
                        + "Length In Meters:" + resultSet4.getString("length_meters") + " "
                        + "Max Speed:" + resultSet4.getString("max_speed") + " "
                        + "Surface Type:" + resultSet4.getString("surface_type") + " "
                        + "Number Of Lanes:" + resultSet4.getString("number_of_lanes") + " "
                        + "Traffic Density:" + resultSet4.getString("traffic_density") + " "
                        + "has_Parking:" + resultSet4.getString("has_parking") + " "
                        + "Has Street Lights:" + resultSet4.getString("has_street_lights") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View one column all rows");
            String select5 = "select street_name from street";
            ResultSet resultSet5 = statement.executeQuery(select5);

            while (resultSet5.next()) {
                System.out.println("Name:" + resultSet5.getString("street_name") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View count(*)");
            String select7 = "select count(*) from street";
            ResultSet resultSet7 = statement.executeQuery(select7);
            while (resultSet7.next()) {
                System.out.println("Total values:" + resultSet7.getInt(1));
            }
            System.out.println("--------------------------------");


            System.out.println("View distinct");
            String select8 = "select distinct street_name from street";
            ResultSet resultSet8 = statement.executeQuery(select8);
            while (resultSet8.next()) {
                System.out.println("Distints:" + resultSet8.getString("street_name"));
            }
            System.out.println("--------------------------------");


            System.out.println("View latest row");
            String select6 = "select * from street order by street_id desc limit 1";
            ResultSet resultSet6 = statement.executeQuery(select6);

            while (resultSet6.next()) {
                System.out.println("Street Id:" + resultSet6.getString("street_id") + " "
                        + "Name:" + resultSet6.getString("street_name") + " "
                        + "Category:" + resultSet6.getString("street_category") + " "
                        + "City Name:" + resultSet6.getString("city_name") + " "
                        + "State Name:" + resultSet6.getString("state_name") + " "
                        + "Country Name:" + resultSet6.getString("country_name") + " "
                        + "Length In Meters:" + resultSet6.getString("length_meters") + " "
                        + "Max Speed:" + resultSet6.getString("max_speed") + " "
                        + "Surface Type:" + resultSet6.getString("surface_type") + " "
                        + "Number Of Lanes:" + resultSet6.getString("number_of_lanes") + " "
                        + "Traffic Density:" + resultSet6.getString("traffic_density") + " "
                        + "has_Parking:" + resultSet6.getString("has_parking") + " "
                        + "Has Street Lights:" + resultSet6.getString("has_street_lights") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Max 2 rows");
            String select10 = "select * from street order by street_id desc limit 2";
            ResultSet resultSet10 = statement.executeQuery(select10);

            while (resultSet10.next()) {
                System.out.println("Street Id:" + resultSet10.getString("street_id") + " "
                        + "Name:" + resultSet10.getString("street_name") + " "
                        + "Category:" + resultSet10.getString("street_category") + " "
                        + "City Name:" + resultSet10.getString("city_name") + " "
                        + "State Name:" + resultSet10.getString("state_name") + " "
                        + "Country Name:" + resultSet10.getString("country_name") + " "
                        + "Length In Meters:" + resultSet10.getString("length_meters") + " "
                        + "Max Speed:" + resultSet10.getString("max_speed") + " "
                        + "Surface Type:" + resultSet10.getString("surface_type") + " "
                        + "Number Of Lanes:" + resultSet10.getString("number_of_lanes") + " "
                        + "Traffic Density:" + resultSet10.getString("traffic_density") + " "
                        + "has_Parking:" + resultSet10.getString("has_parking") + " "
                        + "Has Street Lights:" + resultSet10.getString("has_street_lights") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Min 5 rows");
            String select11 = "select * from street order by street_id asc limit 5";
            ResultSet resultSet11 = statement.executeQuery(select11);

            while (resultSet11.next()) {
                System.out.println("Street Id:" + resultSet11.getString("street_id") + " "
                        + "Name:" + resultSet11.getString("street_name") + " "
                        + "Category:" + resultSet11.getString("street_category") + " "
                        + "City Name:" + resultSet11.getString("city_name") + " "
                        + "State Name:" + resultSet11.getString("state_name") + " "
                        + "Country Name:" + resultSet11.getString("country_name") + " "
                        + "Length In Meters:" + resultSet11.getString("length_meters") + " "
                        + "Max Speed:" + resultSet11.getString("max_speed") + " "
                        + "Surface Type:" + resultSet11.getString("surface_type") + " "
                        + "Number Of Lanes:" + resultSet11.getString("number_of_lanes") + " "
                        + "Traffic Density:" + resultSet11.getString("traffic_density") + " "
                        + "has_Parking:" + resultSet11.getString("has_parking") + " "
                        + "Has Street Lights:" + resultSet11.getString("has_street_lights") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View oldest row");
            String select12 = "select * from street order by street_id asc limit 1";
            ResultSet resultSet12 = statement.executeQuery(select12);

            while (resultSet12.next()) {
                System.out.println("Street Id:" + resultSet12.getString("street_id") + " "
                        + "Name:" + resultSet12.getString("street_name") + " "
                        + "Category:" + resultSet12.getString("street_category") + " "
                        + "City Name:" + resultSet12.getString("city_name") + " "
                        + "State Name:" + resultSet12.getString("state_name") + " "
                        + "Country Name:" + resultSet12.getString("country_name") + " "
                        + "Length In Meters:" + resultSet12.getString("length_meters") + " "
                        + "Max Speed:" + resultSet12.getString("max_speed") + " "
                        + "Surface Type:" + resultSet12.getString("surface_type") + " "
                        + "Number Of Lanes:" + resultSet12.getString("number_of_lanes") + " "
                        + "Traffic Density:" + resultSet12.getString("traffic_density") + " "
                        + "has_Parking:" + resultSet12.getString("has_parking") + " "
                        + "Has Street Lights:" + resultSet12.getString("has_street_lights") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Desending Order");
            String select13 = "select * from street order by street_id desc";
            ResultSet resultSet13 = statement.executeQuery(select13);

            while (resultSet13.next()) {
                System.out.println("Street Id:" + resultSet13.getString("street_id") + " "
                        + "Name:" + resultSet13.getString("street_name") + " "
                        + "Category:" + resultSet13.getString("street_category") + " "
                        + "City Name:" + resultSet13.getString("city_name") + " "
                        + "State Name:" + resultSet13.getString("state_name") + " "
                        + "Country Name:" + resultSet13.getString("country_name") + " "
                        + "Length In Meters:" + resultSet13.getString("length_meters") + " "
                        + "Max Speed:" + resultSet13.getString("max_speed") + " "
                        + "Surface Type:" + resultSet13.getString("surface_type") + " "
                        + "Number Of Lanes:" + resultSet13.getString("number_of_lanes") + " "
                        + "Traffic Density:" + resultSet13.getString("traffic_density") + " "
                        + "has_Parking:" + resultSet13.getString("has_parking") + " "
                        + "Has Street Lights:" + resultSet13.getString("has_street_lights") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Group By");
            String select9 = "select street_category,count(*) as total_street from street group by street_category";
            ResultSet resultSet9 = statement.executeQuery(select9);
            while (resultSet9.next()) {
                System.out.println("street category:" + resultSet9.getString("street_category") + " " + "Total Available=" + resultSet9.getString("total_street"));
            }
            System.out.println("--------------------------------");


            System.out.println("View Group By with Having");
            String select14 = "select street_category,count(*) as total_street from street group by street_category having count(*) >3";
            ResultSet resultSet14 = statement.executeQuery(select14);
            while (resultSet14.next()) {
                System.out.println("street Type:" + resultSet14.getString("street_category") + " " + "Total Available=" + resultSet14.getString("total_street"));
            }
            System.out.println("--------------------------------");

        } catch (SQLException e) {
            e.printStackTrace();
        }


        System.out.println("main ended");
    }
}
