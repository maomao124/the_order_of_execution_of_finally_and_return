package t3;

/**
 * Project name(项目名称)：finally与return的执行顺序
 * Package(包名): t3
 * Class(类名): tryDemo
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 13:19
 * Version(版本): 1.0
 * Description(描述)：
 * 当 finally 有返回值时，会直接返回该值，不会去返回 try 代码块或者 catch 代码块中的返回值。
 * 注意：finally 代码块中最好不要包含 return 语句，否则程序会提前退出。
 */

public class tryDemo
{
    public static int show()
    {
        try
        {
            int a = 8 / 0;
            return 1;
        }
        catch (Exception e)
        {
            System.out.println("执行catch:");
            return 2;
        }
        finally
        {
            System.out.println("执行finally模块");
            return 0;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(" finally 中带有 return:");
        System.out.println("返回值：" + show());
    }
}
