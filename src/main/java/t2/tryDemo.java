package t2;

/**
 * Project name(项目名称)：finally与return的执行顺序
 * Package(包名): t2
 * Class(类名): tryDemo
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 13:15
 * Version(版本): 1.0
 * Description(描述)： 当 try 代码块或者 catch 代码块中有 return 时，finally 中的代码总会被执行，且 finally 语句 return 返回之前执行。
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
            System.out.println("执行catch语句：");
            return 2;
        }
        finally
        {
            System.out.println("执行finally模块");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("try 和 catch 中都带有 return :");
        System.out.println("返回值：" + show());
    }
}
