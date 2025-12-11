package com.xworkz.sweet;

import java.sql.*;

public class President {
    public static void main(String[] args) {
        System.out.println("main started");
        String url = "jdbc:mysql://localhost:3306/xworkz";
        String username = "root";
        String password = "Vina@2002";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected" + connection);

        /*    String sql = "INSERT INTO President VALUES(2,'John Adams','USA','1797-03-04','1801-03-04','Federalist','Thomas Jefferson','1735-10-30','Braintree, Massachusetts','1826-07-04','Quincy, Massachusetts','Harvard College','Lawyer','Abigail Adams',6,'Second President of the United States')," +
                    "(3,'Thomas Jefferson','USA','1801-03-04','1809-03-04','Democratic-Republican','Aaron Burr','1743-04-13','Shadwell, Virginia','1826-07-04','Monticello, Virginia','College of William & Mary','Lawyer','Martha Jefferson',6,'Author of the Declaration of Independence')," +
                    "(4,'James Madison','USA','1809-03-04','1817-03-04','Democratic-Republican','George Clinton','1751-03-16','Port Conway, Virginia','1836-06-28','Montpelier, Virginia','Princeton University','Politician','Dolley Madison',1,'Father of the Constitution')," +
                    "(5,'James Monroe','USA','1817-03-04','1825-03-04','Democratic-Republican','Daniel D. Tompkins','1758-04-28','Westmoreland County, Virginia','1831-07-04','New York City, New York','College of William & Mary','Lawyer','Elizabeth Monroe',3,'Fifth President of the United States')," +
                    "(6,'John Quincy Adams','USA','1825-03-04','1829-03-04','National Republican','John C. Calhoun','1767-07-11','Braintree, Massachusetts','1848-02-23','Washington, D.C.','Harvard College','Diplomat','Louisa Adams',4,'Sixth President of the United States')," +
                    "(7,'Andrew Jackson','USA','1829-03-04','1837-03-04','Democratic','Martin Van Buren','1767-03-15','Waxhaws, South Carolina','1845-06-08','Nashville, Tennessee','None','Military Officer','Rachel Jackson',0,'Seventh President of the United States')," +
                    "(8,'Martin Van Buren','USA','1837-03-04','1841-03-04','Democratic','Richard Mentor Johnson','1782-12-05','Kinderhook, New York','1862-07-24','Kinderhook, New York','Kinderhook Academy','Lawyer','Hannah Van Buren',4,'Eighth President of the United States')," +
                    "(9,'William Henry Harrison','USA','1841-03-04','1841-04-04','Whig','John Tyler','1773-03-29','Charles City County, Virginia','1841-04-04','Washington, D.C.','Hampden–Sydney College','Military Officer','Anna Harrison',10,'Died 31 days into term, shortest presidency')," +
                    "(10,'John Tyler','USA','1841-04-04','1845-03-04','Whig','NULL','1790-03-29','Charles City County, Virginia','1862-01-18','Richmond, Virginia','College of William & Mary','Lawyer','Letitia Christian Tyler',8,'Tenth President of the United States')," +
                    "(11,'James K. Polk','USA','1845-03-04','1849-03-04','Democratic','George M. Dallas','1795-11-02','Pineville, North Carolina','1849-06-15','Nashville, Tennessee','University of North Carolina','Lawyer','Sarah Childress Polk',0,'Eleventh President of the United States')," +
                    "(12,'Zachary Taylor','USA','1849-03-04','1850-07-09','Whig','Millard Fillmore','1784-11-24','Barboursville, Virginia','1850-07-09','New York City, New York','None','Military Officer','Margaret Smith Taylor',6,'Died in office')," +
                    "(13,'Millard Fillmore','USA','1850-07-09','1853-03-04','Whig','NULL','1800-01-07','Cayuga County, New York','1874-03-08','Buffalo, New York','None','Lawyer','Abigail Fillmore',2,'Thirteenth President of the United States')," +
                    "(14,'Franklin Pierce','USA','1853-03-04','1857-03-04','Democratic','William R. King','1804-11-23','Hillsborough, New Hampshire','1869-10-08','Concord, New Hampshire','Bowdoin College','Lawyer','Jane Means Appleton',3,'Fourteenth President of the United States')," +
                    "(15,'James Buchanan','USA','1857-03-04','1861-03-04','Democratic','John C. Breckinridge','1791-04-23','Cove Gap, Pennsylvania','1868-06-01','Lancaster, Pennsylvania','Dickinson College','Lawyer','NULL',0,'Fifteenth President of the United States')," +
                    "(16,'Abraham Lincoln','USA','1861-03-04','1865-04-15','Republican','Andrew Johnson','1809-02-12','Hodgenville, Kentucky','1865-04-15','Washington, D.C.','Self-educated','Lawyer','Mary Todd Lincoln',4,'Sixteenth President of the United States, assassinated')," +
                    "(17,'Andrew Johnson','USA','1865-04-15','1869-03-04','National Union','NULL','1808-12-29','Raleigh, North Carolina','1875-07-31','Elizabethtown, Tennessee','None','Tailor','Eliza McCardle Johnson',5,'Seventeenth President of the United States')," +
                    "(18,'Ulysses S. Grant','USA','1869-03-04','1877-03-04','Republican','Schuyler Colfax','1822-04-27','Point Pleasant, Ohio','1885-07-23','Mount McGregor, New York','United States Military Academy','Military Officer','Julia Dent',4,'Eighteenth President of the United States')," +
                    "(19,'Rutherford B. Hayes','USA','1877-03-04','1881-03-04','Republican','William A. Wheeler','1822-10-04','Delaware, Ohio','1893-01-17','Fremont, Ohio','Kenyon College','Lawyer','Lucy Webb Hayes',8,'Nineteenth President of the United States')," +
                    "(20,'James A. Garfield','USA','1881-03-04','1881-09-19','Republican','Chester A. Arthur','1831-11-19','Moreland Hills, Ohio','1881-09-19','Elberon, New Jersey','Williams College','Lawyer','Lucretia Garfield',7,'Twentieth President of the United States, assassinated')," +
                    "(21,'Chester A. Arthur','USA','1881-09-19','1885-03-04','Republican','NULL','1829-10-05','Fairfield, Vermont','1886-11-18','New York City, New York','Union College','Lawyer','Ellen Herndon Arthur',3,'Twenty-first President of the United States')," +
                    "(22,'Grover Cleveland','USA','1885-03-04','1889-03-04','Democratic','Thomas A. Hendricks','1837-03-18','Caldwell, New Jersey','1908-06-24','Princeton, New Jersey','Princeton University','Lawyer','Frances Cleveland',5,'Twenty-second and twenty-fourth President of the United States')," +
                    "(23,'Benjamin Harrison','USA','1889-03-04','1893-03-04','Republican','Levi P. Morton','1833-08-20','North Bend, Ohio','1901-03-13','Indianapolis, Indiana','Miami University','Lawyer','Caroline Harrison',3,'Twenty-third President of the United States')," +
                    "(24,'William McKinley','USA','1897-03-04','1901-09-14','Republican','Garret Hobart','1843-01-29','Niles, Ohio','1901-09-14','Buffalo, New York','Allegheny College','Lawyer','Ida Saxton McKinley',2,'Twenty-fifth President of the United States, assassinated')," +
                    "(25,'Theodore Roosevelt','USA','1901-09-14','1909-03-04','Republican','NULL','1858-10-27','New York City, New York','1919-01-06','Oyster Bay, New York','Harvard College','Politician','Edith Roosevelt',6,'Twenty-sixth President of the United States')," +
                    "(26,'William Howard Taft','USA','1909-03-04','1913-03-04','Republican','James S. Sherman','1857-09-15','Cincinnati, Ohio','1930-03-08','Washington, D.C.','Yale University','Lawyer','Helen Herron Taft',3,'Twenty-seventh President of the United States')," +
                    "(27,'Woodrow Wilson','USA','1913-03-04','1921-03-04','Democratic','Thomas R. Marshall','1856-12-28','Staunton, Virginia','1924-02-03','Washington, D.C.','Princeton University','Professor','Edith Wilson',3,'Twenty-eighth President of the United States')," +
                    "(28,'Warren G. Harding','USA','1921-03-04','1923-08-02','Republican','Calvin Coolidge','1865-11-02','Blooming Grove, Ohio','1923-08-02','San Francisco, California','Ohio Central College','Journalist','Florence Harding',0,'Twenty-ninth President of the United States, died in office')," +
                    "(29,'Calvin Coolidge','USA','1923-08-02','1929-03-04','Republican','Charles G. Dawes','1872-07-04','Plymouth Notch, Vermont','1933-01-05','Northampton, Massachusetts','Amherst College','Lawyer','Grace Coolidge',2,'Thirtieth President of the United States')," +
                    "(30,'Herbert Hoover','USA','1929-03-04','1933-03-04','Republican','Charles Curtis','1874-08-10','West Branch, Iowa','1964-10-20','New York City, New York','Stanford University','Engineer','Lou Henry Hoover',2,'Thirty-first President of the United States')," +
                    "(31,'Franklin D. Roosevelt','USA','1933-03-04','1945-04-12','Democratic','John Nance Garner','1882-01-30','Hyde Park, New York','1945-04-12','Warm Springs, Georgia','Harvard College','Lawyer','Eleanor Roosevelt',6,'Thirty-second President of the United States, died in office')," +
                    "(32,'Harry S. Truman','USA','1945-04-12','1953-01-20','Democratic','Alben W. Barkley','1884-05-08','Lamar, Missouri','1972-12-26','Kansas City, Missouri','University of Missouri','Bank clerk','Bess Truman',1,'Thirty-third President of the United States')," +
                    "(33,'Dwight D. Eisenhower','USA','1953-01-20','1961-01-20','Republican','Richard Nixon','1890-10-14','Denison, Texas','1969-03-28','Washington, D.C.','United States Military Academy','Military Officer','Mamie Eisenhower',2,'Thirty-fourth President of the United States')," +
                    "(34,'John F. Kennedy','USA','1961-01-20','1963-11-22','Democratic','Lyndon B. Johnson','1917-05-29','Brookline, Massachusetts','1963-11-22','Dallas, Texas','Harvard University','Politician','Jacqueline Kennedy',4,'Thirty-fifth President of the United States, assassinated')," +
                    "(35,'Lyndon B. Johnson','USA','1963-11-22','1969-01-20','Democratic','Hubert Humphrey','1908-08-27','Stonewall, Texas','1973-01-22','Johnson City, Texas','Southwest Texas State Teachers College','Politician','Lady Bird Johnson',2,'Thirty-sixth President of the United States')," +
                    "(36,'Richard Nixon','USA','1969-01-20','1974-08-09','Republican','Spiro Agnew','1913-01-09','Yorba Linda, California','1994-04-22','New York City, New York','Whittier College','Lawyer','Pat Nixon',2,'Thirty-seventh President of the United States, resigned')," +
                    "(37,'Gerald Ford','USA','1974-08-09','1977-01-2','Republican','Nelson Rockefeller','1913-07-14','Omaha, Nebraska','2006-12-26','Rancho Mirage, California','University of Michigan','Lawyer','Betty Ford',4,'Thirty-eighth President of the United States')," +
                    "(38,'Jimmy Carter','USA','1977-01-20','1981-01-20','Democratic','Walter Mondale','1924-10-01','Plains, Georgia','1973-01-22','Atlanta, Georgia','United States Naval Academy','Engineer','Rosalynn Carter',4,'Thirty-ninth President of the United States')," +
                    "(39,'Ronald Reagan','USA','1981-01-20','1989-01-20','Republican','George H. W. Bush','1911-02-06','Tampico, Illinois','2004-06-05','Los Angeles, California','Eureka College','Actor','Nancy Reagan',2,'Fortieth President of the United States')," +
                    "(40,'George H. W. Bush','USA','1989-01-20','1993-01-20','Republican','Dan Quayle','1924-06-12','Milton, Massachusetts','2018-11-30','Houston, Texas','Yale University','Military Officer','Barbara Bush',6,'Forty-first President of the United States')," +
                    "(41,'Bill Clinton','USA','1993-01-20','2001-01-20','Democratic','Al Gore','1946-08-19','Hope, Arkansas',NULL,'New York City, New York','Georgetown University','Lawyer','Hillary Clinton',1,'Forty-second President of the United States')," +
                    "(42,'George W. Bush','USA','2001-01-20','2009-01-20','Republican','Dick Cheney','1946-07-06','New Haven, Connecticut',NULL,'Dallas, Texas','Yale University','Business','Laura Bush',2,'Forty-third President of the United States')," +
                    "(43,'Barack Obama','USA','2009-01-20','2017-01-20','Democratic','Joe Biden','1961-08-04','Honolulu, Hawaii',NULL,'Chicago, Illinois','Columbia University','Lawyer','Michelle Obama',2,'Forty-fourth President of the United States')," +
                    "(44,'Donald Trump','USA','2017-01-20','2021-01-20','Republican','Mike Pence','1946-06-14','Queens, New York',NULL,'Palm Beach, Florida','University of Pennsylvania','Business','Melania Trump',1,'Forty-fifth President of the United States')," +
                    "(45,'Joe Biden','USA','2021-01-20',NULL,'Democratic','Kamala Harris','1942-11-20','Scranton, Pennsylvania',NULL,'Washington, D.C.','University of Delaware','Lawyer','Jill Biden',4,'Forty-sixth President of the United States')," +
                    "(46,'Napoleon Bonaparte','France','1804-12-02','1814-04-06','None','Louis-Alexandre Berthier','1769-08-15','Corsica','1821-05-05','Saint Helena','École Militaire','Military Leader','Josephine de Beauharnais',1,'Emperor of the French')," +
                    "(47,'Charles de Gaulle','France','1959-01-08','1969-04-28','None','Alain Poher','1890-11-22','Lille','1970-11-09','Colombey-les-Deux-Églises','École Speciale Militaire de Saint-Cyr','Military Officer','Yvonne de Gaulle',3,'President of France')," +
                    "(48,'Winston Churchill','UK','1940-05-10','1945-07-26','Conservative','NULL','1874-11-30','Blenheim Palace','1965-01-24','London','Royal Military Academy Sandhurst','Politician','Clementine Churchill',5,'Prime Minister of UK during WWII')," +
                    "(49,'Franklin D. Roosevelt','USA','1933-03-04','1945-04-12','Democratic','John Nance Garner','1882-01-30','Hyde Park, New York','1945-04-12','Warm Springs, Georgia','Harvard College','Lawyer','Eleanor Roosevelt',6,'Thirty-second President of the United States, died in office')," +
                    "(50,'Mahatma Gandhi','India','1920-01-01','1948-01-30','None','NULL','1869-10-02','Porbandar','1948-01-30','New Delhi','Law Degree','Lawyer','Kasturba Gandhi',4,'Leader of Indian Independence Movement')," +
                    "(51,'Nelson Mandela','South Africa','1994-05-10','1999-06-14','African National Congress','Thabo Mbeki','1918-07-18','Mvezo','2013-12-05','Johannesburg','University of Fort Hare','Lawyer','Winnie Madikizela-Mandela',6,'First Black President of South Africa')," +
                    "(52,'Angela Merkel','Germany','2005-11-22','2021-12-08','Christian Democratic Union','NULL','1954-07-17','Hamburg',NULL,'Berlin','University of Leipzig','Physicist',NULL,0,'Chancellor of Germany')," +
                    "(53,'Justin Trudeau','Canada','2015-11-04',NULL,'Liberal','NULL','1971-12-25','Ottawa',NULL,'Ottawa','McGill University','Teacher','Sophie Grégoire',3,'Prime Minister of Canada')," +
                    "(54,'Jacinda Ardern','New Zealand','2017-10-26','2023-01-25','Labour','NULL','1980-07-26','Hamilton',NULL,'Wellington','University of Waikato','Politician','Clarke Gayford',1,'Prime Minister of New Zealand')," +
                    "(55,'Moon Jae-in','South Korea','2017-05-10','2022-05-09','Democratic','NULL','1953-01-24','Geoje',NULL,'Seoul','Kyung Hee University','Lawyer','Kim Jung-sook',2,'President of South Korea')," +
                    "(56,'Recep Tayyip Erdoğan','Turkey','2014-08-28',NULL,'Justice and Development Party','NULL','1954-02-26','Istanbul',NULL,'Istanbul','Marmara University','Politician','Emine Erdoğan',4,'President of Turkey')," +
                    "(57,'Vladimir Putin','Russia','2000-05-07',NULL,'United Russia','NULL','1952-10-07','Leningrad',NULL,'Moscow','Leningrad State University','Politician','Lyudmila Putina',2,'President of Russia')," +
                    "(58,'Salvador Allende','Chile','1970-11-03','1973-09-11','Socialist','NULL','1908-06-26','Valparaíso','1973-09-11','Santiago','University of Chile','Physician','María Tapia',3,'President of Chile, overthrown')," +
                    "(59,'Evo Morales','Bolivia','2006-01-22','2019-11-10','Movement for Socialism','NULL','1959-10-26','Isallavi',NULL,'Cochabamba','None','Politician','Laura Bejarano',5,'President of Bolivia')," +
                    "(60,'Hugo Chávez','Venezuela','1999-02-02','2013-03-05','United Socialist Party','NULL','1954-07-28','Sabaneta','2013-03-05','Caracas','Venezuelan Military Academy','Military Officer','Marisabel Rodríguez',3,'President of Venezuela')," +
                    "(61,'José Mujica','Uruguay','2010-03-01','2015-03-01','Broad Front','NULL','1935-05-20','Montevideo',NULL,'Montevideo','University of the Republic','Farmer','Lucía Topolansky',2,'President of Uruguay')," +
                    "(62,'Mario Draghi','Italy','2021-02-13','2022-10-22','Technocrat','NULL','1947-09-03','Rome',NULL,'Rome','University of Rome','Economist','Maria Serenella Cappello',2,'Prime Minister of Italy')," +
                    "(63,'Pedro Sánchez','Spain','2018-06-02',NULL,'Spanish Socialist Workers'' Party','NULL','1972-02-29','Madrid',NULL,'Madrid','Universidad Complutense de Madrid','Politician','Begoña Gómez',2,'Prime Minister of Spain')," +
                    "(64,'Andrés Manuel López Obrador','Mexico','2018-12-01',NULL,'MORENA','NULL','1953-11-13','Tepetitán',NULL,'Mexico City','National Autonomous University of Mexico','Politician','Beatriz Gutiérrez Müller',4,'President of Mexico')," +
                    "(65,'Abiy Ahmed','Ethiopia','2018-04-02',NULL,'Prosperity Party','NULL','1976-08-15','Beshasha',NULL,'Addis Ababa','Addis Ababa University','Politician','Zerihun Worku',3,'Prime Minister of Ethiopia')," +
                    "(66,'King Salman','Saudi Arabia','2015-01-23',NULL,'Monarchy','NULL','1935-12-31','Riyadh',NULL,'Riyadh','None','Monarch','Fahda bint Falah Al Hithlain',12,'King of Saudi Arabia')," +
                    "(67,'Mohammed bin Salman','Saudi Arabia','2017-06-21',NULL,'Monarchy','NULL','1985-08-31','Riyadh',NULL,'Riyadh','King Saud University','Politician','Princess Sarah bint Mashhoor',5,'Crown Prince of Saudi Arabia')," +
                    "(68,'Imran Khan','Pakistan','2018-08-18','2022-04-10','Pakistan Tehreek-e-Insaf','NULL','1952-10-05','Lahore',NULL,'Islamabad','University of Oxford','Politician','Bushra Bibi',4,'Prime Minister of Pakistan')," +
                    "(69,'Sheikh Hasina','Bangladesh','2009-01-06',NULL,'Awami League','NULL','1947-09-28','Dhaka',NULL,'Dhaka','University of Dhaka','Politician','Mashi Hasina',3,'Prime Minister of Bangladesh')," +
                    "(70,'Lee Hsien Loong','Singapore','2004-08-12',NULL,'People''s Action Party','NULL','1952-02-10','Singapore',NULL,'Singapore','University of Cambridge','Politician','Ho Ching',3,'Prime Minister of Singapore')," +
                    "(71,'Fumio Kishida','Japan','2021-10-04',NULL,'Liberal Democratic Party','NULL','1957-07-29','Hiroshima',NULL,'Tokyo','Waseda University','Politician','Yuko Kishida',3,'Prime Minister of Japan')," +
                    "(72,'Alexander Lukashenko','Belarus','1994-07-20',NULL,'Independent','NULL','1954-08-30','Kopeysk',NULL,'Minsk','Belarusian State University','Politician','Galina Lukashenko',2,'President of Belarus')," +
                    "(73,'Alexander Van der Bellen','Austria','2017-01-26',NULL,'The Greens','NULL','1944-02-18','Vienna',NULL,'Vienna','University of Innsbruck','Economist','Doris Schmidauer',2,'President of Austria')," +
                    "(74,'Marcelo Rebelo de Sousa','Portugal','2016-03-09',NULL,'Social Democratic Party','NULL','1948-12-12','Lisbon',NULL,'Lisbon','University of Lisbon','Professor','Rosa Rebelo de Sousa',4,'President of Portugal')," +
                    "(75,'Gitanas Nausėda','Lithuania','2019-07-12',NULL,'Independent','NULL','1964-05-19','Kaunas',NULL,'Vilnius','Vilnius University','Economist','Diana Nausėdienė',2,'President of Lithuania')";

            Statement statement=connection.createStatement();
            int rowAffected=statement.executeUpdate(sql);
            System.out.println(rowAffected + " " + "RowsAffected"); */

            //delete a row by pk
            Statement statement = connection.createStatement();
            String delete = "DELETE FROM president WHERE id = 10";
            int d1 = statement.executeUpdate(delete);
            System.out.println(d1+"rowsAffected");

            //delete a multiple rows by any other column
            String delete1 = "DELETE FROM president WHERE name = 'fumio kishida'";
            int d3 = statement.executeUpdate(delete1);
            System.out.println(d3+"rowsAffected");

            //Update least 4 columns using 4 different query jdbc on
            String update="update president set name='fumio kishida' where id=73 ";
            int update1=statement.executeUpdate(update);
            System.out.println(update1 +" "+"RowsAffected");

            String update2="update president set children=4 where id=56 ";
            int update3=statement.executeUpdate(update2);
            System.out.println(update3 +" "+"RowsAffected");

            String update4="update president set country='india' where spouse='mashi hasina' ";
            int update5=statement.executeUpdate(update4);
            System.out.println(update5 +" "+"RowsAffected");

            String update6="update president set id=77 where death_place=null ";
            int update7=statement.executeUpdate(update6);
            System.out.println(update7 +" "+"RowsAffected");
            System.out.println("-----------------------------------");


            System.out.println("View All rows");
            String select = "select * from president";
            ResultSet resultSet = statement.executeQuery(select);

            while (resultSet.next()) {
                System.out.println("Id:" + resultSet.getString("id") + " "
                        + "Name:" + resultSet.getString("name") + " "
                        + "Country:" + resultSet.getString("country") + " "
                        + "Trem Start:" + resultSet.getString("term_start") + " "
                        + "Term End:" + resultSet.getString("term_end") + " "
                        + "Party:" + resultSet.getString("party") + " "
                        + "Vice President:" + resultSet.getString("vice_president") + " "
                        + "Birth Date:" + resultSet.getString("birth_date") + " "
                        + "Birth Place:" + resultSet.getString("birth_place") + " "
                        + "Death Date:" + resultSet.getString("death_date") + " "
                        + "Death Place:" + resultSet.getString("death_place") + " "
                        + "Education:" + resultSet.getString("education") + " "
                        + "Profession:" + resultSet.getString("profession") + " "
                        + "Spouse:" + resultSet.getString("spouse") + " "
                        + "Childrens:" + resultSet.getString("children") + " "
                        + "Notes:" + resultSet.getString("notes") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View one rows");
            String select1 = "select * from president where name='john adams' ";
            ResultSet resultSet1 = statement.executeQuery(select1);

            while (resultSet1.next()) {
                System.out.println("Id:" + resultSet1.getString("id") + " "
                        + "Name:" + resultSet1.getString("name") + " "
                        + "Country:" + resultSet1.getString("country") + " "
                        + "Trem Start:" + resultSet1.getString("term_start") + " "
                        + "Term End:" + resultSet1.getString("term_end") + " "
                        + "Party:" + resultSet1.getString("party") + " "
                        + "Vice President:" + resultSet1.getString("vice_president") + " "
                        + "Birth Date:" + resultSet1.getString("birth_date") + " "
                        + "Birth Place:" + resultSet1.getString("birth_place") + " "
                        + "Death Date:" + resultSet1.getString("death_date") + " "
                        + "Death Place:" + resultSet1.getString("death_place") + " "
                        + "Education:" + resultSet1.getString("education") + " "
                        + "Profession:" + resultSet1.getString("profession") + " "
                        + "Spouse:" + resultSet1.getString("spouse") + " "
                        + "Childrens:" + resultSet1.getString("children") + " "
                        + "Notes:" + resultSet1.getString("notes") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View 1 Row 1 column");
            String select2 = "select name from president where id=6";
            ResultSet resultSet2 = statement.executeQuery(select2);

            while (resultSet2.next()) {
                System.out.println(" " + resultSet2.getString(1));

            }
            System.out.println("--------------------------------");


            System.out.println("View two rows");
            String select3 = "select * from president where id=64 or party='Independent' limit 2"; // or use "select * from president limit 2"
            ResultSet resultSet3 = statement.executeQuery(select3);

            while (resultSet3.next()) {
                System.out.println("Id:" + resultSet3.getString("id") + " "
                        + "Name:" + resultSet3.getString("name") + " "
                        + "Country:" + resultSet3.getString("country") + " "
                        + "Trem Start:" + resultSet3.getString("term_start") + " "
                        + "Term End:" + resultSet3.getString("term_end") + " "
                        + "Party:" + resultSet3.getString("party") + " "
                        + "Vice President:" + resultSet3.getString("vice_president") + " "
                        + "Birth Date:" + resultSet3.getString("birth_date") + " "
                        + "Birth Place:" + resultSet3.getString("birth_place") + " "
                        + "Death Date:" + resultSet3.getString("death_date") + " "
                        + "Death Place:" + resultSet3.getString("death_place") + " "
                        + "Education:" + resultSet3.getString("education") + " "
                        + "Profession:" + resultSet3.getString("profession") + " "
                        + "Spouse:" + resultSet3.getString("spouse") + " "
                        + "Childrens:" + resultSet3.getString("children") + " "
                        + "Notes:" + resultSet3.getString("notes") + " ");
            }
            System.out.println("--------------------------------");


           System.out.println("View three rows");
            String select4 = "select * from president limit 3";
            ResultSet resultSet4 = statement.executeQuery(select4);

            while (resultSet4.next()) {
                System.out.println("Id:" + resultSet4.getString("id") + " "
                        + "Name:" + resultSet4.getString("name") + " "
                        + "Country:" + resultSet4.getString("country") + " "
                        + "Trem Start:" + resultSet4.getString("term_start") + " "
                        + "Term End:" + resultSet4.getString("term_end") + " "
                        + "Party:" + resultSet4.getString("party") + " "
                        + "Vice President:" + resultSet4.getString("vice_president") + " "
                        + "Birth Date:" + resultSet4.getString("birth_date") + " "
                        + "Birth Place:" + resultSet4.getString("birth_place") + " "
                        + "Death Date:" + resultSet4.getString("death_date") + " "
                        + "Death Place:" + resultSet4.getString("death_place") + " "
                        + "Education:" + resultSet4.getString("education") + " "
                        + "Profession:" + resultSet4.getString("profession") + " "
                        + "Spouse:" + resultSet4.getString("spouse") + " "
                        + "Childrens:" + resultSet4.getString("children") + " "
                        + "Notes:" + resultSet4.getString("notes") + " ");
            }
            System.out.println("--------------------------------");


           System.out.println("View one column all rows");
            String select5 = "select name from president";
            ResultSet resultSet5 = statement.executeQuery(select5);

            while (resultSet5.next()) {
                System.out.println("Name:" + resultSet5.getString("name") + " ");
            }
            System.out.println("--------------------------------");


           System.out.println("View count(*)");
            String select7 = "select count(*) from president";
            ResultSet resultSet7 = statement.executeQuery(select7);
            while (resultSet7.next()) {
                System.out.println("Total values:" + resultSet7.getInt(1));
            }
            System.out.println("--------------------------------");


            System.out.println("View distinct");
            String select8 = "select distinct name from president";
            ResultSet resultSet8 = statement.executeQuery(select8);
            while (resultSet8.next()) {
                System.out.println("Name Distints:" + resultSet8.getString("name"));
            }
            System.out.println("--------------------------------");


            System.out.println("View latest row");
            String select6 = "select * from president order by id desc limit 1";
            ResultSet resultSet6 = statement.executeQuery(select6);

            while (resultSet6.next()) {
                System.out.println("Id:" + resultSet6.getString("id") + " "
                        + "Name:" + resultSet6.getString("name") + " "
                        + "Country:" + resultSet6.getString("country") + " "
                        + "Trem Start:" + resultSet6.getString("term_start") + " "
                        + "Term End:" + resultSet6.getString("term_end") + " "
                        + "Party:" + resultSet6.getString("party") + " "
                        + "Vice President:" + resultSet6.getString("vice_president") + " "
                        + "Birth Date:" + resultSet6.getString("birth_date") + " "
                        + "Birth Place:" + resultSet6.getString("birth_place") + " "
                        + "Death Date:" + resultSet6.getString("death_date") + " "
                        + "Death Place:" + resultSet6.getString("death_place") + " "
                        + "Education:" + resultSet6.getString("education") + " "
                        + "Profession:" + resultSet6.getString("profession") + " "
                        + "Spouse:" + resultSet6.getString("spouse") + " "
                        + "Childrens:" + resultSet6.getString("children") + " "
                        + "Notes:" + resultSet6.getString("notes") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Max 2 rows");
            String select10 = "select * from president order by id desc limit 2";
            ResultSet resultSet10 = statement.executeQuery(select10);

            while (resultSet10.next()) {
                System.out.println("Id:" + resultSet10.getString("id") + " "
                        + "Name:" + resultSet10.getString("name") + " "
                        + "Country:" + resultSet10.getString("country") + " "
                        + "Trem Start:" + resultSet10.getString("term_start") + " "
                        + "Term End:" + resultSet10.getString("term_end") + " "
                        + "Party:" + resultSet10.getString("party") + " "
                        + "Vice President:" + resultSet10.getString("vice_president") + " "
                        + "Birth Date:" + resultSet10.getString("birth_date") + " "
                        + "Birth Place:" + resultSet10.getString("birth_place") + " "
                        + "Death Date:" + resultSet10.getString("death_date") + " "
                        + "Death Place:" + resultSet10.getString("death_place") + " "
                        + "Education:" + resultSet10.getString("education") + " "
                        + "Profession:" + resultSet10.getString("profession") + " "
                        + "Spouse:" + resultSet10.getString("spouse") + " "
                        + "Childrens:" + resultSet10.getString("children") + " "
                        + "Notes:" + resultSet10.getString("notes") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Min 5 rows");
            String select11 = "select * from president order by id asc limit 5";
            ResultSet resultSet11 = statement.executeQuery(select11);

            while (resultSet11.next()) {
                System.out.println("Id:" + resultSet11.getString("id") + " "
                        + "Name:" + resultSet11.getString("name") + " "
                        + "Country:" + resultSet11.getString("country") + " "
                        + "Trem Start:" + resultSet11.getString("term_start") + " "
                        + "Term End:" + resultSet11.getString("term_end") + " "
                        + "Party:" + resultSet11.getString("party") + " "
                        + "Vice President:" + resultSet11.getString("vice_president") + " "
                        + "Birth Date:" + resultSet11.getString("birth_date") + " "
                        + "Birth Place:" + resultSet11.getString("birth_place") + " "
                        + "Death Date:" + resultSet11.getString("death_date") + " "
                        + "Death Place:" + resultSet11.getString("death_place") + " "
                        + "Education:" + resultSet11.getString("education") + " "
                        + "Profession:" + resultSet11.getString("profession") + " "
                        + "Spouse:" + resultSet11.getString("spouse") + " "
                        + "Childrens:" + resultSet11.getString("children") + " "
                        + "Notes:" + resultSet11.getString("notes") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View oldest row");
            String select12 = "select * from president order by id asc limit 1";
            ResultSet resultSet12 = statement.executeQuery(select12);

            while (resultSet12.next()) {
                System.out.println("Id:" + resultSet12.getString("id") + " "
                        + "Name:" + resultSet12.getString("name") + " "
                        + "Country:" + resultSet12.getString("country") + " "
                        + "Trem Start:" + resultSet12.getString("term_start") + " "
                        + "Term End:" + resultSet12.getString("term_end") + " "
                        + "Party:" + resultSet12.getString("party") + " "
                        + "Vice President:" + resultSet12.getString("vice_president") + " "
                        + "Birth Date:" + resultSet12.getString("birth_date") + " "
                        + "Birth Place:" + resultSet12.getString("birth_place") + " "
                        + "Death Date:" + resultSet12.getString("death_date") + " "
                        + "Death Place:" + resultSet12.getString("death_place") + " "
                        + "Education:" + resultSet12.getString("education") + " "
                        + "Profession:" + resultSet12.getString("profession") + " "
                        + "Spouse:" + resultSet12.getString("spouse") + " "
                        + "Childrens:" + resultSet12.getString("children") + " "
                        + "Notes:" + resultSet12.getString("notes") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Desending Order");
            String select13 = "select * from president order by id desc";
            ResultSet resultSet13 = statement.executeQuery(select13);

            while (resultSet13.next()) {
                System.out.println("Id:" + resultSet13.getString("id") + " "
                        + "Name:" + resultSet13.getString("name") + " "
                        + "Country:" + resultSet13.getString("country") + " "
                        + "Trem Start:" + resultSet13.getString("term_start") + " "
                        + "Term End:" + resultSet13.getString("term_end") + " "
                        + "Party:" + resultSet13.getString("party") + " "
                        + "Vice President:" + resultSet13.getString("vice_president") + " "
                        + "Birth Date:" + resultSet13.getString("birth_date") + " "
                        + "Birth Place:" + resultSet13.getString("birth_place") + " "
                        + "Death Date:" + resultSet13.getString("death_date") + " "
                        + "Death Place:" + resultSet13.getString("death_place") + " "
                        + "Education:" + resultSet13.getString("education") + " "
                        + "Profession:" + resultSet13.getString("profession") + " "
                        + "Spouse:" + resultSet13.getString("spouse") + " "
                        + "Childrens:" + resultSet13.getString("children") + " "
                        + "Notes:" + resultSet13.getString("notes") + " ");
            }
            System.out.println("--------------------------------");


            System.out.println("View Group By");
            String select9 = "select party,count(*) as total_parties from president group by party";
            ResultSet resultSet9 = statement.executeQuery(select9);
            while (resultSet9.next()) {
                System.out.println("Party Type:" + resultSet9.getString("party") + " " + "Total parties=" + resultSet9.getString("total_parties"));
            }
            System.out.println("--------------------------------");


            System.out.println("View Group By with Having");
            String select14 = "select party,count(*) as total_parties from president group by party having count(*) >2";
            ResultSet resultSet14 = statement.executeQuery(select14);
            while (resultSet14.next()) {
                System.err.println("Party Type:" + resultSet14.getString("party") + " " + "Total parties=" + resultSet14.getString("total_parties"));
            }
            System.err.println("--------------------------------");
            
            
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }


        System.out.println("main ended");
    }
}
