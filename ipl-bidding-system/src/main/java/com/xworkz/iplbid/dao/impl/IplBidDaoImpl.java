package com.xworkz.iplbid.dao.impl;

import com.xworkz.iplbid.constants.JDBCconnect;
import com.xworkz.iplbid.dao.IplBidDao;
import com.xworkz.iplbid.dto.BidAmountDto;
import com.xworkz.iplbid.dto.IplBidDto;
import com.xworkz.iplbid.dto.PlayerDto;
import lombok.SneakyThrows;
import lombok.ToString;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

@ToString
public class IplBidDaoImpl implements IplBidDao {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SneakyThrows
    @Override
    public boolean save(IplBidDto iplBidDto) {
        boolean saved = false;
        String insert = "insert into ipl(name,age,playerType,state,battingAvg,bowlingAvg,stumps) values (?,?,?,?,?,?,?)";
        try (Connection connection = DriverManager.getConnection(JDBCconnect.URL.getValue(), JDBCconnect.USERNAME.getValue(), JDBCconnect.PASSWORD.getValue());
             PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            System.out.println(connection);

            preparedStatement.setString(1, iplBidDto.getName());
            preparedStatement.setInt(2, iplBidDto.getAge());
            preparedStatement.setString(3, iplBidDto.getPlayerType());
            preparedStatement.setString(4, iplBidDto.getState());
            preparedStatement.setDouble(5, iplBidDto.getBattingAvg());
            preparedStatement.setDouble(6, iplBidDto.getBowlingAvg());
            preparedStatement.setInt(7, iplBidDto.getStumps());

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
    public List<IplBidDto> getPlayer(PlayerDto playerDto) {
        boolean saved = false;
        List<IplBidDto> list = new ArrayList<>();
        String get = "select * from ipl where playertype=? and (battingAvg >= ? or bowlingAvg >= ? or stumps >= ?)";
        try (Connection connection = DriverManager.getConnection(JDBCconnect.URL.getValue(), JDBCconnect.USERNAME.getValue(), JDBCconnect.PASSWORD.getValue());
             PreparedStatement preparedStatement = connection.prepareStatement(get)) {
            System.out.println(connection);

            preparedStatement.setString(1, playerDto.getPlayerType());
            preparedStatement.setDouble(2, playerDto.getAvgValue());
            preparedStatement.setDouble(3, playerDto.getAvgValue());
            preparedStatement.setDouble(4, playerDto.getAvgValue());
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
            while (resultSet.next()) {

                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                String playerType = resultSet.getString(4);
                String state = resultSet.getString(5);
                double battingAvg = resultSet.getDouble(6);
                double bowlingAvg = resultSet.getDouble(7);
                int stumps = resultSet.getInt(8);

                IplBidDto iplBidDto1 = new IplBidDto(name, age, playerType, state, battingAvg, bowlingAvg, stumps);
                System.out.println(iplBidDto1);
                list.add(iplBidDto1);
            }

            System.out.println("while end");
            if (!list.isEmpty()) {
                System.out.println("lists");
                return list;
            } else {
                System.out.println("list error");
                return Collections.emptyList();
            }
        }

    }


    @SneakyThrows
    @Override
    public Optional<IplBidDto> getPlayerName(String name) {
        String get = "select * from ipl where name=?";
        try (Connection connection = DriverManager.getConnection(JDBCconnect.URL.getValue(), JDBCconnect.USERNAME.getValue(), JDBCconnect.PASSWORD.getValue());
             PreparedStatement preparedStatement = connection.prepareStatement(get)) {
            System.out.println(connection);

            preparedStatement.setString(1,name);

            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()) {

                String name1 = resultSet.getString(2);
                int age = resultSet.getInt(3);
                String playerType = resultSet.getString(4);
                String state = resultSet.getString(5);
                double battingAvg = resultSet.getDouble(6);
                double bowlingAvg = resultSet.getDouble(7);
                int stumps = resultSet.getInt(8);

                IplBidDto iplBidDto = new IplBidDto(name1, age, playerType, state, battingAvg, bowlingAvg, stumps);
                System.out.println(iplBidDto);
                return Optional.of(iplBidDto);
            }


            return Optional.empty();
        }
    }

    @SneakyThrows
    @Override
    public int getBidCountByPlayer(String name) {
        String get = "select count(*) from bid_amount where player_name=?";
        int count=0;
        try (Connection connection = DriverManager.getConnection(JDBCconnect.URL.getValue(), JDBCconnect.USERNAME.getValue(), JDBCconnect.PASSWORD.getValue());
             PreparedStatement preparedStatement = connection.prepareStatement(get)) {
            System.out.println(connection);

            preparedStatement.setString(1,name);
            ResultSet resultSet= preparedStatement.executeQuery();

            if (resultSet.next()){
                count=resultSet.getInt(1);
            }
        }return count;
    }

    @SneakyThrows
    @Override
    public boolean saveBid(BidAmountDto dto) {
        String get = "insert into bid_amount(player_name,bid_amount) values (?,?)";
        try (Connection connection = DriverManager.getConnection(JDBCconnect.URL.getValue(), JDBCconnect.USERNAME.getValue(), JDBCconnect.PASSWORD.getValue());
             PreparedStatement preparedStatement = connection.prepareStatement(get)) {
            System.out.println(connection);

            preparedStatement.setString(1, dto.getName());
            preparedStatement.setDouble(2,dto.getBidPrice());

            return preparedStatement.executeUpdate() > 0;

        }

    }

}
