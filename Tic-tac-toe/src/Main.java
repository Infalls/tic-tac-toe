import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Thread.sleep;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws InterruptedException, IOException {

        System.out.println("Привет, это мой первый крупный проект, если его можно так назвать! Тут можно сыграть с другом в крестики-нолики и побалдеть!");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[][] field = new String[3][3]; // объявляем поле


        for(int game = 0; game < 100; game++){
            boolean flagOfFirstPlayerSwitch = false; // переменная для проверки того, чтобы узнать, правильно ли мы ячейку выбрали или нет
            boolean flagOfSecondPlayerSwitch = false;
            boolean winEndGame = false;
            String continueGame = "3";

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    field[i][j] = " ";
                }

            } //цикл заполнение поля пробелами, сделано для быстрого заполнения

            HelpTools.giveMeField(field); //вывод поля
            System.out.println("Игра началась!");
            System.out.println("Ход первого игрока: введите номер ячейки в типе А1, B3");

            for(byte b = 0; b == 0; ){
                flagOfFirstPlayerSwitch = false;
                String str = reader.readLine(); // передаем номер ячейки в переменную str
                if(flagOfFirstPlayerSwitch = HelpTools.stepOfFirstPlayerSwitch(field, str, flagOfFirstPlayerSwitch) == false){
                    System.out.println("Неккоректное значение, введи еще раз");
                    str = reader.readLine();

                    flagOfFirstPlayerSwitch = HelpTools.stepOfFirstPlayerSwitch(field, str, flagOfFirstPlayerSwitch);

                    if(flagOfFirstPlayerSwitch == false) b = 0;
                    else b = 1;
                }
                else b = 1;
            }//первый ход,условие, если пользователь ввел не правильное значение
            HelpTools.giveMeField(field);

            System.out.println("Ход второго игрока: введите номер ячейки в типе А1, B3");

            for(byte b = 0; b == 0; ){
                flagOfSecondPlayerSwitch = false;
                String str = reader.readLine(); // передаем номер ячейки в переменную str
                if(HelpTools.checkingFullnessOfCell(field, str) == true)
                {
                    if(flagOfSecondPlayerSwitch = HelpTools.stepOfSecondPlayerSwitch(field, str, flagOfSecondPlayerSwitch) == false){
                        System.out.println("Неккоректное значение, введи еще раз");

                        flagOfSecondPlayerSwitch = HelpTools.stepOfSecondPlayerSwitch(field, str, flagOfSecondPlayerSwitch);

                        if(flagOfSecondPlayerSwitch == false) b = 0;
                        else b = 1;
                    }
                    else b = 1;

                }
                else {b = 0; System.out.println("Ячейка уже занята, выбери другую");}

            }//второй ход ,условие, если пользователь ввел не правильное значение
            HelpTools.giveMeField(field);

            System.out.println("Ход первого игрока: введите номер ячейки в типе А1, B3");
            for(byte b = 0; b == 0; ){
                flagOfFirstPlayerSwitch = false;
                String str = reader.readLine(); // передаем номер ячейки в переменную str
                if(HelpTools.checkingFullnessOfCell(field, str) == true)
                {
                    if(flagOfFirstPlayerSwitch = HelpTools.stepOfFirstPlayerSwitch(field, str, flagOfFirstPlayerSwitch) == false){
                        System.out.println("Неккоректное значение, введи еще раз");

                        flagOfFirstPlayerSwitch = HelpTools.stepOfFirstPlayerSwitch(field, str, flagOfFirstPlayerSwitch);

                        if(flagOfFirstPlayerSwitch == false) b = 0;
                        else b = 1;
                    }
                    else b = 1;

                }
                else {b = 0; System.out.println("Ячейка уже занята, выбери другую");}

            }//третий ход, условие, если пользователь ввел не правильное значение
            HelpTools.giveMeField(field);

            System.out.println("Ход второго игрока: введите номер ячейки в типе А1, B3");

            for(byte b = 0; b == 0; ){
                flagOfSecondPlayerSwitch = false;
                String str = reader.readLine(); // передаем номер ячейки в переменную str
                if(HelpTools.checkingFullnessOfCell(field, str) == true)
                {
                    if(flagOfSecondPlayerSwitch = HelpTools.stepOfSecondPlayerSwitch(field, str, flagOfSecondPlayerSwitch) == false){
                        System.out.println("Неккоректное значение, введи еще раз");

                        flagOfSecondPlayerSwitch = HelpTools.stepOfSecondPlayerSwitch(field, str, flagOfSecondPlayerSwitch);

                        if(flagOfSecondPlayerSwitch == false) b = 0;
                        else b = 1;
                    }
                    else b = 1;

                }
                else {b = 0; System.out.println("Ячейка уже занята, выбери другую");}

            }//четвертый ход ,условие, если пользователь ввел не правильное значение
            HelpTools.giveMeField(field);

            System.out.println("Ход первого игрока: введите номер ячейки в типе А1, B3");
            for(byte b = 0; b == 0; ){
                flagOfFirstPlayerSwitch = false;
                String str = reader.readLine(); // передаем номер ячейки в переменную str
                if(HelpTools.checkingFullnessOfCell(field, str) == true)
                {
                    if(flagOfFirstPlayerSwitch = HelpTools.stepOfFirstPlayerSwitch(field, str, flagOfFirstPlayerSwitch) == false){
                        System.out.println("Неккоректное значение, введи еще раз");

                        flagOfFirstPlayerSwitch = HelpTools.stepOfFirstPlayerSwitch(field, str, flagOfFirstPlayerSwitch);

                        if(flagOfFirstPlayerSwitch == false) b = 0;
                        else b = 1;
                    }
                    else b = 1;

                }
                else {b = 0; System.out.println("Ячейка уже занята, выбери другую");}

            }//пятый ход, условие, если пользователь ввел не правильное значение
            winEndGame = HelpTools.winFirstPlayer(field);
            HelpTools.giveMeField(field);

            for(byte i = 0; i == 0; ){ //проверка на победу, предложение сыграть еще
                if(winEndGame == true){
                    System.out.println("Сыграем еще раз?");
                    System.out.println("1. Да");
                    System.out.println("2. Нет");

                    continueGame = reader.readLine();
                    switch (continueGame){
                        case "1":
                            game++;
                            i = 1;
                            break;
                        case "2":
                            System.out.println("Приятно было поиграть, возвращайтесь еще!");
                            game = 100;
                            i = 1;
                            break;
                        default:
                            System.out.println("Вы ввели некоректное значение, повторите запрос!");
                            break;
                    }
                }
                else i = 1;
            }
            if(continueGame.equals("1") || continueGame.equals("2")) continue;

            System.out.println("Ход второго игрока: введите номер ячейки в типе А1, B3");
            for(byte b = 0; b == 0; ){
                flagOfSecondPlayerSwitch = false;
                String str = reader.readLine(); // передаем номер ячейки в переменную str
                if(HelpTools.checkingFullnessOfCell(field, str) == true)
                {
                    if(flagOfSecondPlayerSwitch = HelpTools.stepOfSecondPlayerSwitch(field, str, flagOfSecondPlayerSwitch) == false){
                        System.out.println("Неккоректное значение, введи еще раз");

                        flagOfSecondPlayerSwitch = HelpTools.stepOfSecondPlayerSwitch(field, str, flagOfSecondPlayerSwitch);

                        if(flagOfSecondPlayerSwitch == false) b = 0;
                        else b = 1;
                    }
                    else b = 1;

                }
                else {b = 0; System.out.println("Ячейка уже занята, выбери другую");}

            }//шестой ход ,условие, если пользователь ввел не правильное значение
            winEndGame = HelpTools.winSecondPlayer(field);
            HelpTools.giveMeField(field);
            for(byte i = 0; i == 0; ){ //проверка на победу, предложение сыграть еще
                if(winEndGame == true){
                    System.out.println("Сыграем еще раз?");
                    System.out.println("1. Да");
                    System.out.println("2. Нет");

                    continueGame = reader.readLine();
                    switch (continueGame){
                        case "1":
                            game++;
                            i = 1;
                            break;
                        case "2":
                            System.out.println("Приятно было поиграть, возвращайтесь еще!");
                            game = 100;
                            i = 1;
                            break;
                        default:
                            System.out.println("Вы ввели некоректное значение, повторите запрос!");
                            break;
                    }
                }
                else i = 1;
            }
            if(continueGame.equals("1") || continueGame.equals("2")) continue;

            System.out.println("Ход первого игрока: введите номер ячейки в типе А1, B3");

            for(byte b = 0; b == 0; ){
                flagOfFirstPlayerSwitch = false;
                String str = reader.readLine(); // передаем номер ячейки в переменную str
                if(HelpTools.checkingFullnessOfCell(field, str) == true)
                {
                    if(flagOfFirstPlayerSwitch = HelpTools.stepOfFirstPlayerSwitch(field, str, flagOfFirstPlayerSwitch) == false){
                        System.out.println("Неккоректное значение, введи еще раз");

                        flagOfFirstPlayerSwitch = HelpTools.stepOfFirstPlayerSwitch(field, str, flagOfFirstPlayerSwitch);

                        if(flagOfFirstPlayerSwitch == false) b = 0;
                        else b = 1;
                    }
                    else b = 1;

                }
                else {b = 0; System.out.println("Ячейка уже занята, выбери другую");}

            }//седьмой ход, условие, если пользователь ввел не правильное значение


            winEndGame = HelpTools.winFirstPlayer(field);
            HelpTools.giveMeField(field);

            for(byte i = 0; i == 0; ){
                if(winEndGame == true){
                    System.out.println("Сыграем еще раз?");
                    System.out.println("1. Да");
                    System.out.println("2. Нет");

                    continueGame = reader.readLine();
                    switch (continueGame){
                        case "1":
                            game++;
                            i = 1;
                            break;
                        case "2":
                            System.out.println("Приятно было поиграть, возвращайтесь еще!");
                            game = 100;
                            i = 1;
                            break;
                        default:
                            System.out.println("Вы ввели некоректное значение, повторите запрос!");
                            break;
                    }
                }
                else i = 1;
            }
            if(continueGame.equals("1") || continueGame.equals("2")) continue;


            System.out.println("Ход второго игрока: введите номер ячейки в типе А1, B3");
            for(byte b = 0; b == 0; ){
                flagOfSecondPlayerSwitch = false;
                String str = reader.readLine(); // передаем номер ячейки в переменную str
                if(HelpTools.checkingFullnessOfCell(field, str) == true)
                {
                    if(flagOfSecondPlayerSwitch = HelpTools.stepOfSecondPlayerSwitch(field, str, flagOfSecondPlayerSwitch) == false){
                        System.out.println("Неккоректное значение, введи еще раз");

                        flagOfSecondPlayerSwitch = HelpTools.stepOfSecondPlayerSwitch(field, str, flagOfSecondPlayerSwitch);

                        if(flagOfSecondPlayerSwitch == false) b = 0;
                        else b = 1;
                    }
                    else b = 1;

                }
                else {b = 0; System.out.println("Ячейка уже занята, выбери другую");}

            }//восьмой ход ,условие, если пользователь ввел не правильное значение

            winEndGame = HelpTools.winSecondPlayer(field);
            HelpTools.giveMeField(field);

            for(byte i = 0; i == 0; ){
                if(winEndGame == true){
                    System.out.println("Сыграем еще раз?");
                    System.out.println("1. Да");
                    System.out.println("2. Нет");

                    continueGame = reader.readLine();
                    switch (continueGame){
                        case "1":
                            game++;
                            i = 1;
                            break;
                        case "2":
                            System.out.println("Приятно было поиграть, возвращайтесь еще!");
                            game = 100;
                            i = 1;
                            break;
                        default:
                            System.out.println("Вы ввели некоректное значение, повторите запрос!");
                            break;
                    }
                }
                else i = 1;
            }
            if(continueGame.equals("1") || continueGame.equals("2")) continue;


            System.out.println("Ход первого игрока: введите номер ячейки в типе А1, B3");

            HelpTools.giveMeField(field);

            for(byte i = 0; i == 0; ){
                if(winEndGame == true){
                    System.out.println("Сыграем еще раз?");
                    System.out.println("1. Да");
                    System.out.println("2. Нет");

                    continueGame = reader.readLine();
                    switch (continueGame){
                        case "1":
                            game++;
                            i = 1;
                            break;
                        case "2":
                            System.out.println("Приятно было поиграть, возвращайтесь еще!");
                            game = 100;
                            i = 1;
                            break;
                        default:
                            System.out.println("Вы ввели некоректное значение, повторите запрос!");
                            break;
                    }
                }
                else i = 1;
            }
            for(byte b = 0; b == 0; ){
                flagOfFirstPlayerSwitch = false;
                String str = reader.readLine(); // передаем номер ячейки в переменную str
                if(HelpTools.checkingFullnessOfCell(field, str) == true)
                {
                    if(flagOfFirstPlayerSwitch = HelpTools.stepOfFirstPlayerSwitch(field, str, flagOfFirstPlayerSwitch) == false){
                        System.out.println("Неккоректное значение, введи еще раз");

                        flagOfFirstPlayerSwitch = HelpTools.stepOfFirstPlayerSwitch(field, str, flagOfFirstPlayerSwitch);

                        if(flagOfFirstPlayerSwitch == false) b = 0;
                        else b = 1;
                    }
                    else b = 1;

                }
                else {b = 0; System.out.println("Ячейка уже занята, выбери другую");}

            }//девятый, последний ход, условие, если пользователь ввел не правильное значение

            winEndGame = HelpTools.winFirstPlayer(field);
            HelpTools.giveMeField(field);

            for(byte i = 0; i == 0; ){
                if(winEndGame == true){
                    System.out.println("Сыграем еще раз?");
                    System.out.println("1. Да");
                    System.out.println("2. Нет");

                    continueGame = reader.readLine();
                    switch (continueGame){
                        case "1":
                            game++;
                            i = 1;
                            break;
                        case "2":
                            System.out.println("Приятно было поиграть, возвращайтесь еще!");
                            game = 100;
                            i = 1;
                            break;
                        default:
                            System.out.println("Вы ввели некоректное значение, повторите запрос!");
                            break;
                    }
                }
                else i = 1;
            }
            if(continueGame.equals("1") || continueGame.equals("2")) continue;

            for(byte i = 0; i == 0; ){
                    System.out.println("Похоже ничья! Сыграем еще раз?");
                    System.out.println("1. Да");
                    System.out.println("2. Нет");

                    continueGame = reader.readLine();
                    switch (continueGame){
                        case "1":
                            game++;
                            i = 1;
                            break;
                        case "2":
                            System.out.println("Приятно было поиграть, возвращайтесь еще!");
                            game = 100;
                            i = 1;
                            break;
                        default:
                            System.out.println("Вы ввели некоректное значение, повторите запрос!");
                            break;
                    }

            }

            sleep(1000);
        }
    }

    public static class HelpTools{
        public static void giveMeField(String field[][]){
            System.out.println("A: " + field[0][0] + " " + "|" + " " + field[0][1] + " " + "|" + " " + field[0][2]); // объявляем в консоли поле с пустыми клетками
            System.out.println("  -----------");
            System.out.println("B: " + field[1][0] + " " + "|" + " " + field[1][1] + " " + "|" + " " + field[1][2]);
            System.out.println("  -----------");
            System.out.println("C: " + field[2][0] + " " + "|" + " " + field[2][1] + " " + "|" + " " + field[2][2]);
        }

        public static boolean stepOfFirstPlayerSwitch(String field[][], String str, boolean flagOfFirstPlayerSwitch){
            switch (str){
                case "A1": field[0][0] = "O"; break; case "A2": field[0][1] = "O"; break; case "A3": field[0][2] = "O"; break;
                case "B1": field[1][0] = "O"; break; case "B2": field[1][1] = "O"; break; case "B3": field[1][2] = "O"; break;
                case "C1": field[2][0] = "O"; break; case "C2": field[2][1] = "O"; break; case "C3": field[2][2] = "O"; break;
                default: return flagOfFirstPlayerSwitch = false;
            }
            return flagOfFirstPlayerSwitch = true;
        }

        public static boolean stepOfSecondPlayerSwitch(String field[][], String str, boolean flagOfSecondPlayerSwitch){
            switch (str){
                case "A1": field[0][0] = "X"; break; case "A2": field[0][1] = "X"; break; case "A3": field[0][2] = "X"; break;
                case "B1": field[1][0] = "X"; break; case "B2": field[1][1] = "X"; break; case "B3": field[1][2] = "X"; break;
                case "C1": field[2][0] = "X"; break; case "C2": field[2][1] = "X"; break; case "C3": field[2][2] = "X"; break;
                default: return flagOfSecondPlayerSwitch = false;
            }
            return flagOfSecondPlayerSwitch = true;
        }
        public static boolean checkingFullnessOfCell(String field[][], String str){
            switch (str){
                case "A1": if(field[0][0] != " ") return false; break; case "A2": if(field[0][1] != " ") return false; break; case "A3": if(field[0][2] != " ") return false; break;
                case "B1": if(field[1][0] != " ") return false; break; case "B2": if(field[1][1] != " ") return false; break; case "B3": if(field[1][2] != " ") return false; break;
                case "C1": if(field[2][0] != " ") return false; break; case "C2": if(field[2][1] != " ") return false; break; case "C3": if(field[2][2] != " ") return false; break;
            }
            return true;
        }

        public static boolean winFirstPlayer(String field[][]){
            if((     field[0][0] == "O" && field[1][0] == "O" && field[2][0] == "O") || (field[0][1] == "O" && field[1][1] == "O" && field[2][1] == "O") || (field[0][2] == "O" && field[1][2] == "O" && field[2][2] == "O") ||
                    (field[0][0] == "O" && field[0][1] == "O" && field[0][2] == "O") || (field[1][0] == "O" && field[1][1] == "O" && field[1][2] == "O") || (field[2][0] == "O" && field[2][1] == "O" && field[2][2] == "O") ||
                    (field[0][0] == "O" && field[1][1] == "O" && field[2][2] == "O") || (field[0][2] == "O" && field[1][1] == "O" && field[2][0] == "O") ){
                System.out.println("Первому игроку лавры! Сегодня он победитель и король балдежа!");
                return true;
            }
            return false;
        }

        public static boolean winSecondPlayer(String field[][]){
            if((     field[0][0] == "X" && field[1][0] == "X" && field[2][0] == "X") || (field[0][1] == "X" && field[1][1] == "X" && field[2][1] == "X") || (field[0][2] == "X" && field[1][2] == "X" && field[2][2] == "X") ||
                    (field[0][0] == "X" && field[0][1] == "X" && field[0][2] == "X") || (field[1][0] == "X" && field[1][1] == "X" && field[1][2] == "X") || (field[2][0] == "X" && field[2][1] == "X" && field[2][2] == "X") ||
                    (field[0][0] == "X" && field[1][1] == "X" && field[2][2] == "X") || (field[0][2] == "X" && field[1][1] == "X" && field[2][0] == "X") ){
                System.out.println("Второму игроку лавры! Сегодня он победитель и король балдежа!");
                return true;
            }
            return false;
        }



    }


}