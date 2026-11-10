/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginmanager.java;

/**
 *
 * @author Student
 */
public class LoginManagerJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
{
    private String savedUser;
    private String savedPass;

    public String registerUser(String username, String password, String cell) {
        if (!username.contains("_") || username.length() > 5) {
            return "Username is not correctly formatted.";
        }
        if (password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*[0-9].*") || !password.matches(".*[^a-zA-Z0-9].*")) {
            return "Password is not correctly formatted.";
        }
        if (!cell.startsWith("+27") || cell.length() > 13) {
            return "Cell number incorrectly formatted.";
        }
        savedUser = username;
        savedPass = password;
        return "User registered successfully.";
    }

    public boolean loginUser(String u, String p) {
        return u.equals(savedUser) && p.equals(savedPass);
    }
 }

