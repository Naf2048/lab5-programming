package org.example.commands;


/**
 * Класс хранилища коллекций и ресивер
 * @author Daniel
 */
import org.example.exceptions.*;
import org.example.myClasses.*;
import org.example.myClasses.enums.*;

import java.time.LocalDate;
import java.util.*;

public class Storage {
    private Vector<Movie> collection = new Vector<>();
    private final java.time.LocalDate creationDate;
    private Scanner scannerInput;
    /**
     * Конструктор
     */
    public Storage(LocalDate creationDate) {
        this.creationDate = creationDate;
        scannerInput = new Scanner(System.in) ;
    }

    /**
     * Добавление элемента в коллекцию
     * @param scanner читало потока
     * th
     *
     */


    /**
     * Расширение территории - Ugandan Movie
     */
    public Movie createElementFromInput(StreamReader streamReader) throws NoSuchElementException{
        String name = null; //Поле не может быть null, Строка не может быть пустой
        Coordinates coordinates = null; //Поле не может быть null
        Integer oscarsCount = null; //Значение поля должно быть больше 0, Поле может быть null
        MovieGenre genre = null; //Поле не может быть null
        MpaaRating mpaaRating = null; //Поле не может быть null
        Person operator = null; //Поле может быть null

        while(true){
            try{
                //name
                if(scannerInput.equals(System.in)) System.out.println("Как ваше имя? Вас зовут:");
                String input;
                input = streamReader.readLine();
                if(scannerInput.equals(System.in) && input.equals("null")){
                    System.out.println("Неправильный ввод.");
                    throw new NotValidFileException("name value");
                }

                if (input.equals("s369076")){
                    name = "bingus 2: the revenge";
                    coordinates = new Coordinates(123L, 312);
                    oscarsCount = 2*9;//https://youtu.be/A6g0mPo-uJM?si=KnK3_VqDBwmban1C
                    genre = MovieGenre.SCIENCE_FICTION;
                    mpaaRating = MpaaRating.NC_17;
                    Date date = new Date(Long.MIN_VALUE);
                    operator = new Person("entity", date, new Location(59,57L,94, "ITMO University"));

                    return new Movie(name, coordinates, oscarsCount, genre, mpaaRating, operator);
                }

                if (input != null && input.trim().isEmpty()){
                    name = input;
                    break;
                } else if(scannerInput.equals(System.in)){
                    System.out.println("Неправильно введено имя, попробуйте снова:");
                } else if(input.isBlank()||input.isEmpty()){
                    throw new InputMismatchException();
                }
            }catch (InputMismatchException e){
                if(scannerInput.equals(System.in)) System.out.println("Неправильно введено имя, попробуйте снова:");
                else throw new InputMismatchException("name value");
                if(scannerInput.equals(System.in)) System.out.println("Как ваше имя? Вас зовут:");
            }
        }

        //coordinates
        {
            Long coordX = null;
            Integer coordY = null;

            boolean successfulX = false;
            do{
                try {

                    if(scannerInput.equals(System.in)) System.out.println("Введите координату X:");
                    Long inputX = Long.parseLong(streamReader.readLine());

                    coordX = inputX;
                    successfulX = true;
                } catch (InputMismatchException | NumberFormatException e) {
                    if(scannerInput.equals(System.in)) System.out.println("Неправильно введена координата X, попробуйте ещё раз");
                    else throw new NotValidFileException("X coord");
                }
            }while (!successfulX);

            boolean successfulY = false;
            do {
                if(scannerInput.equals(System.in)) System.out.println("Введите координату Y:");
                try {

                    Integer inputY = Integer.parseInt(streamReader.readLine());
                    if (inputY > -162.d) {
                        coordY = inputY;
                        successfulY = true;
                    } else {
                        if(scannerInput.equals(System.in)) System.out.println("Неправильно введена координата Y, попробуйте ещё раз");
                    }
                } catch (InputMismatchException | NumberFormatException e) {
                    if(scannerInput.equals(System.in)) System.out.println("Неправильно введена координата Y, попробуйте ещё раз");
                    else throw  new NotValidFileException("Y coord");
                }
            }while (!successfulY);

            coordinates = new Coordinates(coordX, coordY);
        }

        //oscarsCount
        while(true){
            if(scannerInput.equals(System.in)) System.out.println("Введите количество оскаров:");

            try {

                Integer input = Integer.parseInt(streamReader.readLine());
                if (input != null && input > 0) {
                    oscarsCount = input;
                    break;
                } else {
                    if(scannerInput.equals(System.in)) System.out.println("Неправильный ввод количества оскаров, попробуйте ещё раз");
                }
            }catch (InputMismatchException | NumberFormatException e){
                if(scannerInput.equals(System.in)) System.out.println("Неправильный ввод количества оскаров, попробуйте ещё раз");
                else throw  new NotValidFileException("oscars count value");
            }
        }


        //genre
        outerloop:
        while(true){
            String input = null;
            if (scannerInput.equals(System.in)) System.out.println("Выберите жанр фильма из:\n" +
                    "   1)ACTION,\n" +
                    "   2)ADVENTURE,\n" +
                    "   3)TRAGEDY,\n" +
                    "   4)THRILLER,\n" +
                    "   5)SCIENCE_FICTION");
            try {
                input = streamReader.readLine();
                if(scannerInput.equals(System.in) && input.equals("null")){
                    System.out.println("Неправильный ввод");
                    throw new NotValidFileException("неправильный элемент в файле");
                }
                switch (input){
                    case "1","ACTION":
                        genre = MovieGenre.ACTION;
                        break outerloop;
                    case "2","ASVENTURE":
                        genre = MovieGenre.ADVENTURE;
                        break outerloop;
                    case "3","TRAGEDY":
                        genre = MovieGenre.TRAGEDY;
                        break outerloop;
                    case "4","THRILLER":
                        genre = MovieGenre.THRILLER;
                        break outerloop;
                    case "5","SCIENCE_FICTION":
                        genre = MovieGenre.SCIENCE_FICTION;
                        break outerloop;
                    default:
                        if(scannerInput.equals(System.in)) System.out.println("Неправильный ввод, попробуй ещё раз");
                        break;
                }
            }catch (InputMismatchException | NumberFormatException e){
                for(MovieGenre movieGenre : MovieGenre.values()){
                    if(input.toLowerCase().equals(movieGenre.name().toLowerCase())){
                        genre = movieGenre;
                        break outerloop;
                    }
                }
                if(scannerInput.equals(System.in)) System.out.println("Неправильный ввод, попробуйте ещё раз");
                else throw  new NotValidFileException("genre value");
            }
        }
        //mpaaRating
        outerloop:
        while(true){
            String input = null;
            if (scannerInput.equals(System.in)) System.out.println("Выберите со скольки лет человек может смотреть фильм:\n" +
                    "   1)0+,\n" +
                    "   2)13+,\n" +
                    "   3)16+,\n" +
                    "   4)18+");
            try {
                input = streamReader.readLine();
                if(scannerInput.equals(System.in) && input.equals("null")){
                    System.out.println("Неправильный ввод");
                    throw new NotValidFileException("неправильный элемент в файле");
                }
                switch (input){
                    case "1","0+":
                        mpaaRating = MpaaRating.G;
                        break outerloop;
                    case "2","13+":
                        mpaaRating = MpaaRating.PG;
                        break outerloop;
                    case "3","16+":
                        mpaaRating = MpaaRating.R;
                        break outerloop;
                    case "4","18+":
                        mpaaRating = MpaaRating.NC_17;
                        break outerloop;
                    default:
                        if(scannerInput.equals(System.in)) System.out.println("Неправильный ввод, попробуй ещё раз");
                        break;
                }
            }catch (InputMismatchException | NumberFormatException e){
                for(MpaaRating mpaaRating1 : MpaaRating.values()){
                    if(input.toLowerCase().equals(mpaaRating1.name().toLowerCase())){
                        mpaaRating = mpaaRating1;
                        break outerloop;
                    }
                }
                if(scannerInput.equals(System.in)) System.out.println("Неправильный ввод, попробуйте ещё раз");
                else throw  new NotValidFileException("genre value");
            }
        }

        //Operator

        boolean operatorSuccessful = false;
        do{
            String operatorName = null;
            Date operatorDate = null;
            Location operatorLocation = null;
            while(true){
                try{
                    if(scannerInput.equals(System.in)) System.out.println("Введите имя оператора:");
                    String input;
                    input = streamReader.readLine();
                    if(scannerInput.equals(System.in) && input.equals("null")){
                        System.out.println("Неправильный ввод.");
                        throw new NotValidFileException("name value");
                    }
                    if (input != null && input.trim().isEmpty()){
                        operatorName = input;
                        break;
                    } else if(scannerInput.equals(System.in)){
                        System.out.println("Неправильно введено имя, попробуйте снова:");
                    } else if(input.isBlank()||input.isEmpty()){
                        throw new InputMismatchException();
                    }
                }catch (InputMismatchException e){
                    if(scannerInput.equals(System.in)) System.out.println("Неправильно введено имя оператора, попробуйте снова:");
                    else throw new InputMismatchException("operator name value");
                }

                try {
                    String inputD, inputM, inputY;
                    if (scannerInput.equals(System.in)) System.out.println("Введите дату рождения оператора числами: \n Введите день месяца:");
                    inputD = streamReader.readLine();
                    if(scannerInput.equals(System.in) && (inputD == null || Integer.parseInt(inputD)<0||Integer.parseInt(inputD)>31)){
                        System.out.println("Неправильный ввод.");
                        throw new NotValidFileException("Day value");
                    }
                    if (scannerInput.equals(System.in)) System.out.println("Введите месяц:");
                    inputM = streamReader.readLine();
                    if(scannerInput.equals(System.in) && (inputM == null || Integer.parseInt(inputM)<0||Integer.parseInt(inputM)>11)){
                        System.out.println("Неправильный ввод.");
                        throw new NotValidFileException("Month value");
                    }
                    if (scannerInput.equals(System.in)) System.out.println();
                    inputY = streamReader.readLine();
                    if(scannerInput.equals(System.in) && (inputY == null || Integer.parseInt(inputY)<0||Integer.parseInt(inputY)>2024)){
                        System.out.println("Неправильный ввод.");
                        throw new NotValidFileException("Year value");
                    }

                    operatorDate = new Date(Integer.parseInt(inputD),Integer.parseInt(inputM),Integer.parseInt(inputY));
                }catch (InputMismatchException erm){
                    if(scannerInput.equals(System.in)) System.out.println("Неправильно введена дата, попробуйте ввести еще раз:");
                    else throw new InputMismatchException("Date value");
                }

                try{
                    if (scannerInput.equals(System.in)) System.out.println("Введите локацию оператора, если у оператора нет локации пропустите все этапы с помощью клавиши Enter. \n Введите координату x:");

                    int input1 = Integer.parseInt(streamReader.readLine());
                    if (scannerInput.equals(System.in)) System.out.println("Введите координату Y:");
                    double input2 = Double.parseDouble(streamReader.readLine());
                    if (scannerInput.equals(System.in)) System.out.println("Введите координату Z:");
                    int input3 = Integer.parseInt(streamReader.readLine());
                    if (scannerInput.equals(System.in)) System.out.println("Введите Название локации:");
                    String input4 = streamReader.readLine();
                }catch (InputMismatchException e){
                    if(scannerInput.equals(System.in)) System.out.println("Неправильно введена дата, попробуйте ввести еще раз:");
                    else throw new InputMismatchException("Location value");
                } catch ()
            }

            Person operatorNew = new Person(operatorName,operatorDate, operatorLocation);
        }while(!operatorSuccessful);

        return new Movie(name, coordinates, oscarsCount, genre, mpaaRating, operator);
    }

}
