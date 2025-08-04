package daily.mon30.customexceptionpack1;

public class UseCustomException {
    public static void main(String[] args) throws CustomException {
        try {
            int a = 18;
            // int c = a / 0;
            // if (a > 15)
            // throw new CustomException("Not Possible");
            if (a > 15) {
                System.out.println("oweinf\n\n");
                throw new CustomException();
            }
        } catch (CustomException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        } 
        System.out.println("End");
    }
}
