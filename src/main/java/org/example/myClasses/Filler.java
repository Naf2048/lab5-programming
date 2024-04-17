package org.example.myClasses;

import org.example.myClasses.enums.MovieGenre;

import java.util.Scanner;

public class Filler {
    public void Fill() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите название фильма: ");
                String name = scanner.nextLine();
                if (name == "") {
                    System.out.println("Фильм не может существовать без нормального имени! Постарайтесь придумать что-то получше пустого поля!!!");
                } else {
                    break;
                }
            } catch (NullPointerException npe) {
                System.out.println("Фильм не может быть null!");
            }
        }
        while (true){
            try{
                System.out.println("Введите количество оскаров : ");
                Integer oscarsCount = Integer.parseInt(scanner.nextLine());
                if (oscarsCount <= 0){
                    System.out.println("Количество оскаров должно быть больше нуля или null!");
                }else{
                    break;
                }

            }catch (Exception e){
                System.out.println("Ошибка на этапе введения количества оскаров");
            }
            System.out.println("Введите название : ");
            scanner.nextLine();
        }
        while(true){
            try{
                System.out.println("Введите жанр фильма : ");
                 MovieGenre genre = MovieGenre.valueOf(scanner.nextLine());

                 if (!genre.findGenreValue(genre) ){

                 }else{
                     break;
                 }
            }catch(NullPointerException npe){
                System.out.println("Жанр не может быть null! повторите попытку!");
            }

        }
        while(true) {
            try {
                System.out.println("Введите координату X : ");
                Long x = Long.parseLong(scanner.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Проверьте формат ввода числа - должен быть Long!");
            }
        } while(true){
            try{
                System.out.println("Введите координату Y : ");
                int y = Integer.parseInt(scanner.nextLine());

                if (y <= -735 ){
                    System.out.println("Проверьте введенные данные - число должно быть больше -735");
                }else{
                    break;
                }
            }catch(NumberFormatException nfe){
                System.out.println("Проверьте формат ввода числа - должен быть int!");
            }
        }
    }
}
