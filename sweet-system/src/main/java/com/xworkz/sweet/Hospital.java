package com.xworkz.sweet;

import java.sql.*;

public class Hospital {
    public static void main(String[] args) {
        System.out.println("main started");
        String url = "jdbc:mysql://localhost:3306/xworkz";
        String username = "root";
        String password = "Vina@2002";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected" + connection);
         /*  String sql = "INSERT INTO Hospital VALUES(2, 'Sunrise Clinic', 'Church Street', 'Bangalore', 'Karnataka', '9123456780', 102, 'Clinic', 40, '2019-03-15')," +
                    "(3, 'Green Valley Hospital', 'Ring Road', 'Mysore', 'Karnataka', '9988776655', 103, 'General', 90, '2021-11-20')," +
                    "(4, 'LifeCare Hospital', 'Main Street', 'Mumbai', 'Maharashtra', '9812345670', 104, 'Multi-Speciality', 150, '2018-09-01')," +
                    "(5, 'Metro Health Center', 'Sector 22', 'Delhi', 'Delhi', '9012345678', 105, 'Speciality', 200, '2022-01-10')," +
                    "(6, 'Harmony Hospital', 'Park Lane', 'Hyderabad', 'Telangana', '9876012345', 106, 'General', 110, '2017-04-12')," +
                    "(7, 'Lotus Medical Center', 'Hill View', 'Chennai', 'Tamil Nadu', '9977886655', 107, 'Multi-Speciality', 170, '2021-12-05')," +
                    "(8, 'RiverSide Hospital', 'Lake Road', 'Pune', 'Maharashtra', '9765432180', 108, 'General', 140, '2020-07-19')," +
                    "(9, 'StarCare Hospital', 'Beach Road', 'Vizag', 'Andhra Pradesh', '9877654321', 109, 'Speciality', 100, '2019-11-01')," +
                    "(10, 'Prime Health Clinic', 'Nehru Nagar', 'Nagpur', 'Maharashtra', '9345678123', 110, 'Clinic', 60, '2021-08-23')," +
                    "(11, 'Golden Life Hospital', 'Market Street', 'Jaipur', 'Rajasthan', '9988123456', 111, 'Multi-Speciality', 200, '2016-02-14')," +
                    "(12, 'CareWell Hospital', 'Station Road', 'Ahmedabad', 'Gujarat', '9786543210', 112, 'General', 80, '2019-04-30')," +
                    "(13, 'Citizen Hospital', 'Old City', 'Lucknow', 'Uttar Pradesh', '9090909090', 113, 'Speciality', 150, '2020-01-20')," +
                    "(14, 'Unity Medical Center', 'New Market', 'Bhopal', 'Madhya Pradesh', '9456123789', 114, 'General', 100, '2018-10-10')," +
                    "(15, 'FastAid Hospital', 'Station Circle', 'Surat', 'Gujarat', '9988771122', 115, 'Clinic', 50, '2022-03-01')," +
                    "(16, 'NeoLife Hospital', 'Sector 12', 'Noida', 'Uttar Pradesh', '9789001234', 116, 'Multi-Speciality', 220, '2021-02-18')," +
                    "(17, 'HealthyNest Clinic', 'Gandhi Chowk', 'Patna', 'Bihar', '9123098765', 117, 'Clinic', 45, '2017-09-09')," +
                    "(18, 'Royal Hospital', 'Ring Road', 'Indore', 'Madhya Pradesh', '9078564321', 118, 'General', 160, '2018-05-22')," +
                    "(19, 'TrustCare Medical', 'City Square', 'Ranchi', 'Jharkhand', '9800675432', 119, 'Speciality', 130, '2021-06-30')," +
                    "(20, 'LifeBridge Hospital', 'Central Avenue', 'Kolkata', 'West Bengal', '9234567810', 120, 'Multi-Speciality', 210, '2015-04-11')," +
                    "(21, 'Skyline Hospital', 'IT Park', 'Chandigarh', 'Chandigarh', '9788899001', 121, 'General', 140, '2019-08-17')," +
                    "(22, 'HealingTouch Hospital', 'Sunset Road', 'Kochi', 'Kerala', '9034561298', 122, 'Speciality', 110, '2018-03-12')," +
                    "(23, 'EverGreen Hospital', 'Green Park', 'Guwahati', 'Assam', '9912345678', 123, 'General', 90, '2022-01-19')," +
                    "(24, 'BlueCross Hospital', 'Airport Road', 'Coimbatore', 'Tamil Nadu', '9765412390', 124, 'Multi-Speciality', 180, '2020-06-05')," +
                    "(25, 'PulseCare Hospital', 'Temple Street', 'Madurai', 'Tamil Nadu', '9345612870', 125, 'General', 95, '2019-12-14')," +
                    "(26, 'Shine Hospital', 'Mall Road', 'Shimla', 'Himachal Pradesh', '9988776654', 126, 'Clinic', 30, '2017-04-21')," +
                    "(27, 'Silverline Hospital', 'Highway Road', 'Thiruvananthapuram', 'Kerala', '9876541098', 127, 'Speciality', 150, '2021-02-09')," +
                    "(28, 'Apollo East Wing', 'Sector 5', 'Bhubaneswar', 'Odisha', '9234098712', 128, 'Multi-Speciality', 230, '2018-11-25')," +
                    "(29, 'Medicover Hospital', 'City Center', 'Vijayawada', 'Andhra Pradesh', '9345679800', 129, 'General', 180, '2020-09-13')," +
                    "(30, 'Fortis Care', 'New Airport Road', 'Mangalore', 'Karnataka', '9456712390', 130, 'Speciality', 160, '2017-12-01')," +
                    "(31, 'CityHeart Hospital', 'Town Hall', 'Udaipur', 'Rajasthan', '9987112233', 131, 'General', 140, '2019-07-18')," +
                    "(32, 'GreenLeaf Hospital', 'Bus Stand', 'Nashik', 'Maharashtra', '9876612345', 132, 'Multi-Speciality', 190, '2021-05-07')," +
                    "(33, 'NewHope Hospital', 'College Road', 'Panaji', 'Goa', '9023456712', 133, 'General', 85, '2018-03-26')," +
                    "(34, 'SunCity Hospital', 'Palace Road', 'Jodhpur', 'Rajasthan', '9345098761', 134, 'Clinic', 55, '2016-12-11')," +
                    "(35, 'PrimeCare Clinic', 'Railway Colony', 'Gwalior', 'Madhya Pradesh', '9877001122', 135, 'Clinic', 35, '2020-10-04')," +
                    "(36, 'LifeAid Hospital', 'City Gate', 'Varanasi', 'Uttar Pradesh', '9988442233', 136, 'Speciality', 175, '2021-09-09')," +
                    "(37, 'Starlight Hospital', 'Garden Road', 'Kanpur', 'Uttar Pradesh', '9099223344', 137, 'General', 105, '2019-02-22')," +
                    "(38, 'GrandHealth Hospital', 'Hill Top', 'Dehradun', 'Uttarakhand', '9123009876', 138, 'General', 125, '2017-08-05')," +
                    "(39, 'Evercare Medical', 'College Square', 'Cuttack', 'Odisha', '9798989898', 139, 'Multi-Speciality', 210, '2020-04-16')," +
                    "(40, 'UrbanLife Hospital', 'Science Park', 'Nagpur', 'Maharashtra', '9988770022', 140, 'General', 130, '2018-06-28')," +
                    "(41, 'CitySmile Hospital', 'Green Lane', 'Kurnool', 'Andhra Pradesh', '9345667800', 141, 'Clinic', 40, '2021-01-07')," +
                    "(42, 'RiverCare Hospital', 'Main Bazaar', 'Kota', 'Rajasthan', '9765002341', 142, 'General', 90, '2019-11-11')," +
                    "(43, 'Heritage Hospital', 'Central Road', 'Allahabad', 'Uttar Pradesh', '9011223344', 143, 'Multi-Speciality', 210, '2020-02-14')," +
                    "(44, 'SilverStar Hospital', 'West End', 'Jabalpur', 'Madhya Pradesh', '9456001123', 144, 'General', 120, '2017-03-30')," +
                    "(45, 'HealingHands Clinic', 'Lake View', 'Raipur', 'Chhattisgarh', '9876543321', 145, 'Clinic', 50, '2018-09-17')," +
                    "(46, 'WellCure Hospital', 'East Market', 'Bilaspur', 'Chhattisgarh', '9345678211', 146, 'Speciality', 140, '2021-06-01')," +
                    "(47, 'CareHub Hospital', 'Hill Station Road', 'Ooty', 'Tamil Nadu', '9700001122', 147, 'General', 110, '2016-04-22')," +
                    "(48, 'NorthCity Hospital', 'Bazaar Street', 'Amritsar', 'Punjab', '9234001121', 148, 'Multi-Speciality', 200, '2022-02-10')," +
                    "(49, 'Angel Hospital', 'New Station Road', 'Ludhiana', 'Punjab', '9345670012', 149, 'General', 95, '2019-10-12')," +
                    "(50, 'GraceCare Hospital', 'Park Avenue', 'Jalandhar', 'Punjab', '9543210098', 150, 'Speciality', 160, '2017-11-18')," +
                    "(51, 'Bright Hospital', 'City Tower', 'Bhubaneswar', 'Odisha', '9998887776', 151, 'Multi-Speciality', 215, '2021-03-23')," +
                    "(52, 'MedStar Hospital', 'VIP Road', 'Agartala', 'Tripura', '9543216780', 152, 'General', 85, '2019-07-01')," +
                    "(53, 'TrustLine Hospital', 'Ring Road', 'Imphal', 'Manipur', '9678901234', 153, 'Clinic', 55, '2018-01-28')," +
                    "(54, 'LifePlus Hospital', 'Old Market', 'Aizawl', 'Mizoram', '9567890123', 154, 'General', 100, '2017-02-17')," +
                    "(55, 'HealthFirst Clinic', 'Hill Street', 'Shillong', 'Meghalaya', '9456789012', 155, 'Clinic', 45, '2020-08-16')," +
                    "(56, 'BlueWave Hospital', 'Main Square', 'Kohima', 'Nagaland', '9345612000', 156, 'Speciality', 150, '2022-01-22')," +
                    "(57, 'WellNest Hospital', 'River Bridge', 'Itanagar', 'Arunachal Pradesh', '9678001234', 157, 'General', 120, '2021-05-05')," +
                    "(58, 'NovaCare Hospital', 'New Colony', 'Port Blair', 'Andaman', '9546001122', 158, 'Multi-Speciality', 180, '2018-09-29')," +
                    "(59, 'SouthCity Hospital', 'Harbor Road', 'Puducherry', 'Puducherry', '9987001122', 159, 'General', 100, '2019-06-19')," +
                    "(60, 'FortView Hospital', 'Cliff Road', 'Kanyakumari', 'Tamil Nadu', '9345671111', 160, 'Speciality', 150, '2017-05-13')," +
                    "(61, 'HopeLine Hospital', 'Valley Road', 'Guntur', 'Andhra Pradesh', '9045678123', 161, 'General', 110, '2020-10-10')," +
                    "(62, 'CarePoint Hospital', 'IT Junction', 'Warangal', 'Telangana', '9988123400', 162, 'Multi-Speciality', 190, '2021-02-01')," +
                    "(63, 'CityLife Hospital', 'Garden City', 'Hubli', 'Karnataka', '9876001234', 163, 'General', 100, '2019-08-08')," +
                    "(64, 'PrimeHealth Hospital', 'Main Road', 'Dharwad', 'Karnataka', '9345098765', 164, 'Speciality', 160, '2016-11-11')," +
                    "(65, 'UrbanCare Clinic', 'East End', 'Salem', 'Tamil Nadu', '9123456000', 165, 'Clinic', 40, '2018-03-03')," +
                    "(66, 'HillFort Hospital', 'Near Fort', 'Belgaum', 'Karnataka', '9345609876', 166, 'General', 130, '2020-04-04')," +
                    "(67, 'MedZone Hospital', 'South Park', 'Tirupati', 'Andhra Pradesh', '9456709821', 167, 'Multi-Speciality', 200, '2021-01-15')," +
                    "(68, 'LifeSpring Hospital', 'Temple Road', 'Karimnagar', 'Telangana', '9345679821', 168, 'General', 125, '2018-02-20')," +
                    "(69, 'CityAid Clinic', 'Bridge Road', 'Nellore', 'Andhra Pradesh', '9876540087', 169, 'Clinic', 35, '2017-01-25')," +
                    "(70, 'RiverBank Hospital', 'River Road', 'Rajahmundry', 'Andhra Pradesh', '9345670011', 170, 'General', 115, '2019-05-15')," +
                    "(71, 'Galaxy Hospital', 'Cosmo Street', 'Silchar', 'Assam', '9345601234', 171, 'Multi-Speciality', 175, '2020-06-08')," +
                    "(72, 'MotherCare Hospital', 'Women Center Road', 'Kolhapur', 'Maharashtra', '9678123400', 172, 'Speciality', 150, '2018-07-10')," +
                    "(73, 'Lotus Heart Hospital', 'Market Road', 'Sangli', 'Maharashtra', '9898001122', 173, 'General', 100, '2021-09-14')," +
                    "(74, 'PeakView Hospital', 'Hill Highway', 'Solan', 'Himachal Pradesh', '9345674444', 174, 'General', 80, '2016-06-06')," +
                    "(75, 'SouthStar Hospital', 'South Colony', 'Tirunelveli', 'Tamil Nadu', '9345099776', 175, 'Speciality', 165, '2022-02-18');";


            Statement statement = connection.createStatement();
            int rowAffected = statement.executeUpdate(sql);
            System.out.println(rowAffected + " " + "RowsAffected"); */

            //delete a row by pk
            Statement statement = connection.createStatement();
            String delete = "DELETE FROM hospital WHERE hospital_id = 5";
            int d1 = statement.executeUpdate(delete);
            System.out.println(d1 + "rowsAffected");

            //delete a multiple rows by any other column
            String delete1 = "DELETE FROM hospital WHERE ceo_id = 174";
            int d3 = statement.executeUpdate(delete1);
            System.out.println(d3 + "rowsAffected");

            //Update least 4 columns using 4 different query jdbc on
            String update = "update hospital set hospital_id=76 where city='solan' ";
            int update1 = statement.executeUpdate(update);
            System.out.println(update1 + " " + "RowsAffected");

            String update2 = "update hospital set type='general' where bed_capacity=165 ";
            int update3 = statement.executeUpdate(update2);
            System.out.println(update3 + " " + "RowsAffected");

            String update4 = "update hospital set state_region='karnataka' where phone ='9123456000'";
            int update5 = statement.executeUpdate(update4);
            System.out.println(update5 + " " + "RowsAffected");

            String update6 = "update hospital set address='Hill Highway' where ceo_id=106 ";
            int update7 = statement.executeUpdate(update6);
            System.out.println(update7 + " " + "RowsAffected");

            System.out.println("View All rows");
            String select = "select * from hospital";
            ResultSet resultSet = statement.executeQuery(select);

            while (resultSet.next()) {
                System.out.println("Id:" + resultSet.getString("hospital_id") + " "
                        + "Name:" + resultSet.getString("name") + " "
                        + "Address:" + resultSet.getString("address") + " "
                        + "City:" + resultSet.getString("city") + " "
                        + "State_Region:" + resultSet.getString("state_region") + " "
                        + "Phone No:" + resultSet.getString("phone") + " "
                        + "CEO_Id:" + resultSet.getString("ceo_id") + " "
                        + "Type:" + resultSet.getString("type") + " "
                        + "Bed_Capacity:" + resultSet.getString("bed_capacity") + " "
                        + "Accreditation_Date:" + resultSet.getString("Accreditation_Date") + " ");
                System.out.println("--------------------------------");
            }

            System.out.println("View one rows");
            String select1 = "select * from hospital where name='cityaid clinic' ";
            ResultSet resultSet1 = statement.executeQuery(select1);

            while (resultSet1.next()) {
                System.out.println("Id:" + resultSet1.getString("hospital_id") + " "
                        + "Name:" + resultSet1.getString("name") + " "
                        + "Address:" + resultSet1.getString("address") + " "
                        + "City:" + resultSet1.getString("city") + " "
                        + "State_Region:" + resultSet1.getString("state_region") + " "
                        + "Phone No:" + resultSet1.getString("phone") + " "
                        + "CEO_Id:" + resultSet1.getString("ceo_id") + " "
                        + "Type:" + resultSet1.getString("type") + " "
                        + "Bed_Capacity:" + resultSet1.getString("bed_capacity") + " "
                        + "Accreditation_Date:" + resultSet1.getString("Accreditation_Date") + " ");
                System.out.println("--------------------------------");
            }

            System.out.println("View 1 Row 1 column");
            String select2 = "select address from hospital where hospital_id=8";
            ResultSet resultSet2 = statement.executeQuery(select2);

            while (resultSet2.next()) {
                System.out.println(" " + resultSet2.getString(1));

                System.out.println("--------------------------------");
            }

            System.out.println("View two rows");
            String select3 = "select * from hospital where hospital_id=64 or name='southstar hospital'"; // or use "select * from hospital limit 2"
            ResultSet resultSet3 = statement.executeQuery(select3);

            while (resultSet3.next()) {
                System.out.println("Id:" + resultSet3.getString("hospital_id") + " "
                        + "Name:" + resultSet3.getString("name") + " "
                        + "Address:" + resultSet3.getString("address") + " "
                        + "City:" + resultSet3.getString("city") + " "
                        + "State_Region:" + resultSet3.getString("state_region") + " "
                        + "Phone No:" + resultSet3.getString("phone") + " "
                        + "CEO_Id:" + resultSet3.getString("ceo_id") + " "
                        + "Type:" + resultSet3.getString("type") + " "
                        + "Bed_Capacity:" + resultSet3.getString("bed_capacity") + " "
                        + "Accreditation_Date:" + resultSet3.getString("Accreditation_Date") + " ");
                System.out.println("--------------------------------");
            }

            System.out.println("View three rows");
            String select4 = "select * from hospital limit 3";
            ResultSet resultSet4 = statement.executeQuery(select4);

            while (resultSet4.next()) {
                System.out.println("Id:" + resultSet4.getString("hospital_id") + " "
                        + "Name:" + resultSet4.getString("name") + " "
                        + "Address:" + resultSet4.getString("address") + " "
                        + "City:" + resultSet4.getString("city") + " "
                        + "State_Region:" + resultSet4.getString("state_region") + " "
                        + "Phone No:" + resultSet4.getString("phone") + " "
                        + "CEO_Id:" + resultSet4.getString("ceo_id") + " "
                        + "Type:" + resultSet4.getString("type") + " "
                        + "Bed_Capacity:" + resultSet4.getString("bed_capacity") + " "
                        + "Accreditation_Date:" + resultSet4.getString("Accreditation_Date") + " ");
                System.out.println("--------------------------------");
            }

            System.out.println("View one column all rows");
            String select5 = "select name from hospital";
            ResultSet resultSet5 = statement.executeQuery(select5);

            while (resultSet5.next()) {
                System.out.println("Name:" + resultSet5.getString("name") + " ");
                System.out.println("--------------------------------");
            }


               System.out.println("View count(*)");
            String select7 = "select count(*) from hospital";
            ResultSet resultSet7 = statement.executeQuery(select7);
            while (resultSet7.next()) {
                System.out.println("Total values:" + resultSet7.getInt(1));
                System.out.println("-------------------------------------------");
            }

            System.out.println("View distinct");
            String select8 = "select distinct state_region from hospital";
            ResultSet resultSet8 = statement.executeQuery(select8);
            while (resultSet8.next()) {
                System.out.println("State Distints:" + resultSet8.getString("state_region"));
                System.out.println("-------------------------------------------");
            }


            System.out.println("View latest row");
            String select6 = "select * from hospital order by hospital_id desc limit 1";
            ResultSet resultSet6 = statement.executeQuery(select6);

            while (resultSet6.next()) {
                System.out.println("Id:" + resultSet6.getString("hospital_id") + " "
                        + "Name:" + resultSet6.getString("name") + " "
                        + "Address:" + resultSet6.getString("address") + " "
                        + "City:" + resultSet6.getString("city") + " "
                        + "State_Region:" + resultSet6.getString("state_region") + " "
                        + "Phone No:" + resultSet6.getString("phone") + " "
                        + "CEO_Id:" + resultSet6.getString("ceo_id") + " "
                        + "Type:" + resultSet6.getString("type") + " "
                        + "Bed_Capacity:" + resultSet6.getString("bed_capacity") + " "
                        + "Accreditation_Date:" + resultSet6.getString("Accreditation_Date") + " ");
                System.out.println("--------------------------------");
            }

            System.out.println("View Max 2 rows");
            String select10 = "select * from hospital order by hospital_id desc limit 2";
            ResultSet resultSet10 = statement.executeQuery(select10);

            while (resultSet10.next()) {
                System.out.println("Id:" + resultSet10.getString("hospital_id") + " "
                        + "Name:" + resultSet10.getString("name") + " "
                        + "Address:" + resultSet10.getString("address") + " "
                        + "City:" + resultSet10.getString("city") + " "
                        + "State_Region:" + resultSet10.getString("state_region") + " "
                        + "Phone No:" + resultSet10.getString("phone") + " "
                        + "CEO_Id:" + resultSet10.getString("ceo_id") + " "
                        + "Type:" + resultSet10.getString("type") + " "
                        + "Bed_Capacity:" + resultSet10.getString("bed_capacity") + " "
                        + "Accreditation_Date:" + resultSet10.getString("Accreditation_Date") + " ");
                System.out.println("--------------------------------");
            }

           System.out.println("View Min 5 rows");
            String select11 = "select * from hospital order by hospital_id asc limit 5";
            ResultSet resultSet11 = statement.executeQuery(select11);

            while (resultSet11.next()) {
                System.out.println("Id:" + resultSet11.getString("hospital_id") + " "
                        + "Name:" + resultSet11.getString("name") + " "
                        + "Address:" + resultSet11.getString("address") + " "
                        + "City:" + resultSet11.getString("city") + " "
                        + "State_Region:" + resultSet11.getString("state_region") + " "
                        + "Phone No:" + resultSet11.getString("phone") + " "
                        + "CEO_Id:" + resultSet11.getString("ceo_id") + " "
                        + "Type:" + resultSet11.getString("type") + " "
                        + "Bed_Capacity:" + resultSet11.getString("bed_capacity") + " "
                        + "Accreditation_Date:" + resultSet11.getString("Accreditation_Date") + " ");
                System.out.println("--------------------------------");
            }


            System.out.println("View oldest row");
            String select12 = "select * from hospital order by hospital_id asc limit 1";
            ResultSet resultSet12 = statement.executeQuery(select12);

            while (resultSet12.next()) {
                System.out.println("Id:" + resultSet12.getString("hospital_id") + " "
                        + "Name:" + resultSet12.getString("name") + " "
                        + "Address:" + resultSet12.getString("address") + " "
                        + "City:" + resultSet12.getString("city") + " "
                        + "State_Region:" + resultSet12.getString("state_region") + " "
                        + "Phone No:" + resultSet12.getString("phone") + " "
                        + "CEO_Id:" + resultSet12.getString("ceo_id") + " "
                        + "Type:" + resultSet12.getString("type") + " "
                        + "Bed_Capacity:" + resultSet12.getString("bed_capacity") + " "
                        + "Accreditation_Date:" + resultSet12.getString("Accreditation_Date") + " ");
                System.out.println("--------------------------------");
            }

           System.out.println("View Desending Order");
            String select13 = "select * from hospital order by hospital_id desc";
            ResultSet resultSet13 = statement.executeQuery(select13);

            while (resultSet13.next()) {
                System.out.println("Id:" + resultSet13.getString("hospital_id") + " "
                        + "Name:" + resultSet13.getString("name") + " "
                        + "Address:" + resultSet13.getString("address") + " "
                        + "City:" + resultSet13.getString("city") + " "
                        + "State_Region:" + resultSet13.getString("state_region") + " "
                        + "Phone No:" + resultSet13.getString("phone") + " "
                        + "CEO_Id:" + resultSet13.getString("ceo_id") + " "
                        + "Type:" + resultSet13.getString("type") + " "
                        + "Bed_Capacity:" + resultSet13.getString("bed_capacity") + " "
                        + "Accreditation_Date:" + resultSet13.getString("Accreditation_Date") + " ");
                System.out.println("--------------------------------");
            }

            System.out.println("View Group By");
            String select9 = "select type,count(*) as total_bed_types from hospital group by type";
            ResultSet resultSet9 = statement.executeQuery(select9);
            while (resultSet9.next()) {
                System.out.println("Hospital Bed Type:" + resultSet9.getString("type") + " " + "Total Available=" + resultSet9.getString("total_bed_types"));
                System.out.println("-------------------------------------------");
            }

            System.out.println("View Group By with Having");
            String select14 = "select type,count(*) as total_bed_types from hospital group by type having count(*) >20";
            ResultSet resultSet14 = statement.executeQuery(select14);
            while (resultSet14.next()) {
                System.out.println("Hospital Bed Type:" + resultSet14.getString("type") + " " + "Total Available=" + resultSet14.getString("total_bed_types"));
                System.out.println("-------------------------------------------");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


        System.out.println("main ended");
    }
}
