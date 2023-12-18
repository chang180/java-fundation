package com.neweb.chapter10.unit53;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

public class TestDemo {

    public static void main(String[] args) {
//        demo1();
        User user = new User();
        user.setName("test");
        System.out.println(user.getName().orElse("default"));
//        Optional<User> userOptional = Optional.of(user);
//        userOptional.ifPresent(u -> System.out.println(u.getName()));


    }

    private static void demo1() {
        Connection conn = null;
        try {
            conn.commit();
        } catch (SQLException e) {
            System.out.println("catch SQLException");
        } catch (Exception e) {
            System.out.println("catch Exception");
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("catch close Exception");
            }
            System.out.println("finally");
        }
    }
}
