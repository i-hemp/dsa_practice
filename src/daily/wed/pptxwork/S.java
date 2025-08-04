package daily.wed.pptxwork;

class A

{

    // SIB - Static Initialization Block

    static

    {

        staticmethod(); // Invoking static method inside SIB

    }

    static void staticmethod()

    {

        System.out.println("It is a static method");

    }

}