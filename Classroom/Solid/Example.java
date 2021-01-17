import java.math.BigDecimal;

public class Example {

    private int a = 1;
    private String b = "Example";
    private BigDecimal c = new BigDecimal(4.007);

    public void Foo() {

        this.a = 5;
        this.b = "New example";
        this.c = new BigDecimal(80.009);
    }

    public void Bar() {

        System.out.println(a + " " + b + " " + c);
    }

    public void FooBar() {

        this.a = 15;
        this.b = "New example 3";
        this.c = new BigDecimal(70.009);
        System.out.println(c + " " + b + " " + a);
    }


}
