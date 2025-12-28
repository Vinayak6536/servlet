package com.xworkz.iplbid.dao.impl;

import com.xworkz.iplbid.constants.JDBCconnect;
import com.xworkz.iplbid.dao.EmailDao;
import com.xworkz.iplbid.dto.EmailDto;
import com.xworkz.iplbid.dto.IplBidDto;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

public class EmailDaoImpl implements EmailDao {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SneakyThrows
    @Override
    public boolean save(EmailDto emailDto) {
        boolean saved = false;
        String insert = "insert into ipl_c_email(companyName,email) values (?,?)";
        try (Connection connection = DriverManager.getConnection(JDBCconnect.URL.getValue(), JDBCconnect.USERNAME.getValue(), JDBCconnect.PASSWORD.getValue());
             PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            System.out.println(connection);

            preparedStatement.setString(1, emailDto.getCompanyName());
            preparedStatement.setString(2, emailDto.getEmail());

            int row = preparedStatement.executeUpdate();
            if (row > 0) {
                System.out.println(row + " " + "Rows Affected");
                saved = true;
            } else {
                System.out.println("NO rows Inserted...");
            }

            return saved;
        }
    }

    @SneakyThrows
    @Override
    public Optional<EmailDto> getData(EmailDto emailDto) {

        String get = "select * from ipl_c_email where email=?";
        try (Connection connection = DriverManager.getConnection(JDBCconnect.URL.getValue(), JDBCconnect.USERNAME.getValue(), JDBCconnect.PASSWORD.getValue());
             PreparedStatement preparedStatement = connection.prepareStatement(get)) {
            System.out.println(connection);

            preparedStatement.setString(1, emailDto.getEmail());

            ResultSet resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){

                String name=resultSet.getString(1);
                String email=resultSet.getString(2);

                EmailDto emailDto1=new EmailDto(name,email);
                System.out.println(emailDto1);
                return Optional.of(emailDto1);

            }
            return Optional.empty();
        }
    }
}
