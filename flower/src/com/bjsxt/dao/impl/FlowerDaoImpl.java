package com.bjsxt.dao.impl;

import com.bjsxt.dao.FlowerDao;
import com.bjsxt.pojo.Flower;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlowerDaoImpl implements FlowerDao {

    @Override
    public List<Flower> selAll(){
        ArrayList<Flower> list=new ArrayList<>();
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm","root","14250369xmh9");
            ps=conn.prepareStatement("select * from flower");
            rs=ps.executeQuery();
            Flower flower=null;
            while(rs.next()){
                flower=new Flower();
                flower.setId(rs.getInt("id"));
                flower.setfName(rs.getString("fname"));
                flower.setPrice(rs.getFloat("price"));
                flower.setProduction(rs.getString("production"));
                list.add(flower);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public int insFlower(Flower flower) {
        int index=0;
        PreparedStatement ps=null;
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm","root","14250369xmh9");
            ps=conn.prepareStatement("insert into flower values(default ,?,?,?)");
            ps.setString(1,flower.getfName());
            ps.setFloat(2,flower.getPrice());
            ps.setString(3,flower.getProduction());
            index=ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return index;
    }
}
