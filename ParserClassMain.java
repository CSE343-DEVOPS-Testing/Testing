import java.util.ArrayList;

public class ParserClassMain {

    public static void main(String args[]) throws Exception {

        ParserClass parser = new ParserClass();
        ArrayList<String> nameOfMethods = new ArrayList<String>();
        ArrayList<String> returnTypes = new ArrayList<String>();
        ArrayList<ArrayList<String>> parametersType = new ArrayList<ArrayList<String>>();


        parser.myParser("C:\\Users\\amd3\\Desktop\\hw3\\part1\\part1\\src\\State.java");
        nameOfMethods = parser.getNameOfMethods();
        returnTypes = parser.getReturnTypes();
        parametersType = parser.getParametersType();

        System.out.println(nameOfMethods);
        System.out.println(returnTypes);
        System.out.println(parametersType);

    }
}
