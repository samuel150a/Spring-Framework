package com.xworkz.in;



import javax.xml.transform.Result;
import java.util.function.*;

public class Lambda {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (num1, num2) -> {

            System.out.println(" Running in BiConsumer interface");
            System.out.println("Adding two numbers " + num1 + " and " + num2 + " and answer is = " + (num1 + num2));
        };
        biConsumer.accept(4, 8);

        System.out.println("------------------------------------------------------------------------------");

        BiFunction<Integer, Integer, Integer> biFunction = (str1, str2) ->
        {
            System.out.println(" Running in biFunction interface");
            System.out.println("Adding two numbers " + str1 + " and " + str2 + " and answer is = " + (str1 + str2));
            return 55;
        };
        biFunction.apply(1, 1);

        System.out.println("------------------------------------------------------------------------------");


        BinaryOperator<String> binaryOperator = (name1, name2) ->
        {
            System.out.println("running in the BinaryOperator interface ");

            if (name1.equals(name2)) {
                return "equals";
            } else
                return "not equals";
        };
        String result = binaryOperator.apply("sun", "gun");
        System.out.println(result);
        System.out.println("------------------------------------------------------------------------------");


        BiPredicate<Integer, Integer> biPredicate = (num1, num2) ->
        {
            System.out.println("Running in the BiPredicate interface");

            if (num1.equals(num2)) {
                return true;
            } else
                return false;
        };
        Boolean ans = biPredicate.test(3, 3);
        System.out.println("Answer " + ans);
        System.out.println("------------------------------------------------------------------------------");


        BooleanSupplier booleanSupplier = () -> {
            System.out.println("BooleanSupplier interface");
            return true;
        };
        Boolean returns = booleanSupplier.getAsBoolean();
        System.out.println(returns);

        System.out.println("------------------------------------------------------------------------------");
        Consumer<String> consumer = (message) -> {
            System.out.println("Consumer interface");
            System.out.println(message);

        };
        consumer.accept("Your using Accept method with no return type");
        System.out.println("------------------------------------------------------------------------------");


        DoubleBinaryOperator doubleBinaryOperator = (decimal1, decimal2) -> {
            System.out.println("DoubleBinaryOperator interface");
            return decimal1 * decimal2;
        };
        System.out.println("the returned value is " + doubleBinaryOperator.applyAsDouble(5.5, 7.7));
        System.out.println("------------------------------------------------------------------------------");

        DoubleConsumer doubleConsumer = (deci) ->
        {
            System.out.println("DoubleConsumer");
            System.out.println("no return type but the passed value is " + deci);
        };
        doubleConsumer.accept(100.0);
        System.out.println("------------------------------------------------------------------------------");


        DoubleFunction<Double> doubleFunction = (num1) ->
        {
            System.out.println("DoubleFunction interface");
            return num1;
        };
        System.out.println("the returned value is " + doubleFunction.apply(85.5));
        System.out.println("------------------------------------------------------------------------------");


        DoublePredicate doublePredicate = (results) -> {
            System.out.println("DoublePredicate interface");
            if (results >= 85.5) {
                return true;
            } else return false;

        };
        System.out.println(doublePredicate.test(86.0));
        System.out.println("------------------------------------------------------------------------------");

        DoubleSupplier doubleSupplier = () -> 4.4;
        {
            System.out.println("DoubleSupplier interface ");


        }
        System.out.println(doubleSupplier.getAsDouble());
        System.out.println("------------------------------------------------------------------------------");


        DoubleToIntFunction doubleToIntFunction = (deci) -> 5;
        {
            System.out.println("DoubleToIntFunction interface");
        }
        System.out.println("returned value is " + doubleToIntFunction.applyAsInt(5.5));
        System.out.println("------------------------------------------------------------------------------");


        DoubleToLongFunction doubleToLongFunction = (deci) -> 1555555;
        {
            System.out.println("DoubleToLongtFunction interface");
        }
        System.out.println("returned value is " + doubleToLongFunction.applyAsLong(2.3));
        System.out.println("------------------------------------------------------------------------------");

        DoubleUnaryOperator doubleUnaryOperator = (deci) -> deci;
        {
            System.out.println("DoubleUnaryOperator interface");
        }
        System.out.println("returned value is " + doubleUnaryOperator.applyAsDouble(8.8));
        System.out.println("------------------------------------------------------------------------------");

        Function<Integer, Integer> function = (num1) ->
        {
            System.out.println("Function interface");
            return num1;
        };
        System.out.println("returned value is " + function.apply(7));
        System.out.println("------------------------------------------------------------------------------");

        IntBinaryOperator intBinaryOperator = (num1, num2) ->
        {
            System.out.println("IntBinaryOperator interface");
            return num1 + num2;
        };
        System.out.println("sum of returned value is " + intBinaryOperator.applyAsInt(7, 1));
        System.out.println("------------------------------------------------------------------------------");


        IntConsumer intConsumerr = (num1) ->
        {
            System.out.println("IntConsumer interface");
            System.out.println("returned value is " + num1);
        };
        intConsumerr.accept(7);
        System.out.println("------------------------------------------------------------------------------");


        IntFunction<Boolean> intFunction = (num1) ->
        {
            System.out.println("IntFunction interface");
            if (num1 >= 2) {
                return true;
            } else return false;
        };
        System.out.println("Returned value " + intFunction.apply(2));
        System.out.println("------------------------------------------------------------------------------");

        IntPredicate intPredicate = (num1) -> {
            System.out.println("IntPredicate interface");
            return true;
        };
        System.out.println("retuned value is " + intPredicate.test(15));
        System.out.println("------------------------------------------------------------------------------");


        IntSupplier intSupplier = () -> 100;
        System.out.println("IntSupplier interface");
        System.out.println("retuned value is " + intSupplier.getAsInt());
        System.out.println("------------------------------------------------------------------------------");


        IntToDoubleFunction intToDoubleFunction = (num1) ->
        {
            System.out.println("IntToDoubleFunction interface");
            return num1;
        };
        System.out.println("Returned value is " + intToDoubleFunction.applyAsDouble(111));
        System.out.println("------------------------------------------------------------------------------");


        IntToLongFunction intToLongFunction = (num1) ->
        {
            System.out.println("IntToLongFunction interface");
            return num1;
        };
        System.out.println("the returned value is " + intToLongFunction.applyAsLong(10));
        System.out.println("------------------------------------------------------------------------------");


        IntUnaryOperator intUnaryOperator = (num1) -> num1;
        System.out.println("IntUnaryOperator interface");

        System.out.println("the returned value is " + intUnaryOperator.applyAsInt(00));
        System.out.println("------------------------------------------------------------------------------");


        LongBinaryOperator longBinaryOperator = (num1, num2) ->
        {
            System.out.println("LongBinaryOperator interface");
            if (num1 > num2) {
                System.out.println("num1 is greter");
                return num1;
            } else
                System.out.println("num2 is  greter");
            return num2;
        };
        System.out.println("The Greater value is " + longBinaryOperator.applyAsLong(56, 55));
        System.out.println("------------------------------------------------------------------------------");

        LongConsumer longConsumer = (num1) ->
        {
            System.out.println("LongConsumer interface");
            System.out.println("returned value is " + num1);
        };
        longConsumer.accept(5);
        System.out.println("------------------------------------------------------------------------------");

        LongFunction<Boolean> longFunction = (data) ->
        {
            System.out.println("LongFunction interface");


            return true;
        };
        System.out.println("returned type is " + longFunction.apply(155555));
        System.out.println("------------------------------------------------------------------------------");


        LongPredicate longPredicate = (longvalue) ->
        {
            System.out.println("LongPredicate interface");
            return true & true;
        };
        System.out.println("retuned value " + longPredicate.test(16846222));
        System.out.println("------------------------------------------------------------------------------");


        LongSupplier longSupplier = () ->
        {
            System.out.println("LongSupplier interface");
            return 1222222;
        };
        System.out.println("returned value is " + longSupplier.getAsLong());
        System.out.println("------------------------------------------------------------------------------");

        LongToDoubleFunction longToDoubleFunction = (longvalue) ->
        {
            System.out.println("LongToDoubleFunction interface");
            return 2.3;
        };
        System.out.println("returned value is " + longToDoubleFunction.applyAsDouble(225));
        System.out.println("------------------------------------------------------------------------------");

        LongToIntFunction longToIntFunction = (longvalue) -> 5;
        System.out.println("LongToIntFunction interface");
        System.out.println("returned value is " + longToIntFunction.applyAsInt(225));
        System.out.println("------------------------------------------------------------------------------");

        LongUnaryOperator longUnaryOperator = (longvalue) -> 500;
        System.out.println("LongUnaryOperator interface");
        System.out.println("returned value is " + longUnaryOperator.applyAsLong(225));
        System.out.println("------------------------------------------------------------------------------");

        ObjDoubleConsumer<String> objDoubleConsumer = (name, Num1) ->
        {
            System.out.println("ObjDoubleConsumer interface");
            System.out.println("no return type");
        };
        objDoubleConsumer.accept("df", 1.2);
        System.out.println("------------------------------------------------------------------------------");


        ObjIntConsumer<String> objIntConsumer = (name, Num1) ->
        {
            System.out.println("ObjIntConsumer interface");
            System.out.println("no return type");
        };
        objIntConsumer.accept("df", 1);
        System.out.println("------------------------------------------------------------------------------");


        ObjLongConsumer<String> objLongConsumer = (name, num1) ->
        {
            System.out.println("ObjLongConsumer interface");
            System.out.println("no return type");

        };
        objLongConsumer.accept("dfd", 120);
        System.out.println("------------------------------------------------------------------------------");


        Predicate<String> predicate = (name) -> true;
        System.out.println("Predicate interface");

        System.out.println("returned value is " + predicate.test("vivek"));
        System.out.println("------------------------------------------------------------------------------");

        Supplier<Integer> supplier = () -> 100;
        System.out.println("Supplier interface");
        System.out.println("returned value is " + supplier.get());
        System.out.println("------------------------------------------------------------------------------");


        ToDoubleBiFunction<String, Double> toDoubleBiFunction = (name1, percentage) ->
        {
            System.out.println("ToDoubleBiFunction interface");
            return percentage;
        };
        System.out.println("returned value is " + toDoubleBiFunction.applyAsDouble("samuel", 89.25));
        System.out.println("------------------------------------------------------------------------------");

        ToDoubleFunction<String> toDoubleFunction = (name) -> 2.2;
        System.out.println("ToDoubleFunction interface");
        System.out.println("returned value is " + toDoubleFunction.applyAsDouble("vivek"));
        System.out.println("------------------------------------------------------------------------------");

        ToIntBiFunction<String, Integer> toIntBiFunction = (name, m) ->
        {
            System.out.println("ToIntBiFunction interface");
            return 4;
        };
        System.out.println("returned value is " + toIntBiFunction.applyAsInt("vivek", 044));
        System.out.println("------------------------------------------------------------------------------");


        ToIntFunction<Integer> toIntFunction = (RollNo) ->
        {
            System.out.println("ToIntFunction interface");
            return RollNo;

        };
        System.out.println("returned value is " + toIntFunction.applyAsInt(25));
        System.out.println("------------------------------------------------------------------------------");


        ToLongBiFunction<String, String> toLongBiFunction = (nam1, nam2) -> 45;
        System.out.println("ToLongBiFunction interface");
        System.out.println("returned value is " + toLongBiFunction.applyAsLong("sam", "57"));
        System.out.println("------------------------------------------------------------------------------");

        ToLongFunction<Integer> toLongFunction = (longvalue) -> 1200;
        System.out.println("ToLongFunction interface");
        System.out.println("returned value is " + toLongFunction.applyAsLong(120000));

        System.out.println("------------------------------------------------------------------------------");


        UnaryOperator<String> unaryOperator = (name) ->
        {
            System.out.println("UnaryOperator interface");
            return name;
        };
        System.out.println("returned value is " + unaryOperator.apply("sam"));
        System.out.println("------------------------------------------------------------------------------");

    }
    }



