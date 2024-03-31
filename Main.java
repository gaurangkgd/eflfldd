import Controller.Controller;
import Model.City.Cities;
import Model.City.manageCities;
import Model.Enrolls.Enrolls;
import Model.Enrolls.manageEnrolls;
import Model.Model;
import Model.Tourist.Tourists;
import Model.Tourist.manageTourists;
import View.View;
import com.fasterxml.jackson.databind.ObjectMapper;
import MyException.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.security.spec.ECField;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import MyException.MyException.*;

import static MyException.MyException.*;

/**
 * Identification comments:
 *   Name: Gaurav Khutwal D2B 28
 *   Experiment No: 08
 *   Experiment Title: Implement Exception Handling with User Defined Exception
 *   Experiment Date: 05/03/24
 *   @version 1.0
 * Beginning comments:
 * Filename: Main.java
 * @author:  Gaurav Khutwal
 * Overview: This is the main class used to created objects for Student Class and Course Class. In this file we have achieved the following
 * - Menu Driven Program to create Tourists and Cities using Do while Loop and Switch Case Statement
 * - String Manipulation by using split function for Full name
 * - Used various ways to create Tourists and Cities
 * - Menu Driven Program for Updating and Deleting data of Cities and Tourists
 * - Reading and writing into the json files of Cities and Tourists
 * - Created ArrayList cities and tourists for Cities and Tourists respectively
 * - Created objects mc1 and mt1 for manageCities and manageCities respectively
 * - Created me1 for manageEnrolls
 * - Created user-defined exceptions for taking correct user-input using MyException CLass.
 *
 */

public class Main {
    public static void main(String[] args) throws IOException {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
    }
}
