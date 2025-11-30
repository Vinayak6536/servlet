package com.xworkz.insert.constants;

public enum JDBCConnect implements AutoCloseable {
    URL("jdbc:mysql://localhost:3306/xworkz"),
    USERNAME("root"),
    SECRET("Vina@2002");

    private String s;

    JDBCConnect(String s) {
        System.out.println("Running JDBC Connection............");
        this.s=s;
    }

    public String getS(){
        return s;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed JDBC Connect......... ");
    }
}
