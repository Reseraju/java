import java.io.File;
//import java.io.Exception;

public class CreatenewFile {
    public static void main(String[] args) {
        try {
            File myObj= new File("inp.txt");
            if(myObj.createNewFile()){
                System.out.println("the file created "+ myObj.getName());
            }
            else{
                System.out.println("file already exists");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("error occuered");
            e.printStackTrace();

        }
    }
}
